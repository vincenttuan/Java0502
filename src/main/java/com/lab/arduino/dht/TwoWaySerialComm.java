package com.lab.arduino.dht;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TwoWaySerialComm {

    private static Callback callback;

    public TwoWaySerialComm(Callback callback) {
        super();
        this.callback = callback;
    }

    void connect(String portName) throws Exception {
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if (portIdentifier.isCurrentlyOwned()) {
            System.out.println("Error: Port is currently in use");
        } else {
            CommPort commPort = portIdentifier.open(this.getClass().getName(), 2000);

            if (commPort instanceof SerialPort) {
                SerialPort serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

                InputStream in = serialPort.getInputStream();
                OutputStream out = serialPort.getOutputStream();

                (new Thread(new SerialReader(in))).start();
                (new Thread(new SerialWriter(out))).start();

            } else {
                System.out.println("Error: Only serial ports are handled by this example.");
            }
        }
    }

    /**
     *
     */
    public static class SerialReader implements Runnable {

        InputStream in;

        public SerialReader(InputStream in) {
            this.in = in;
        }

        public void run() {
            byte[] buffer = new byte[1024];
            int len = -1;
            StringBuilder sb = new StringBuilder();
            try {
                while ((len = this.in.read(buffer)) > -1) {
                    //System.out.print(new String(buffer, 0, len));
                    String data = new String(buffer, 0, len);
                    //System.out.print(data);
                    if (data.trim().equals("") && sb.length() > 5) {
                        // fulldata = 收到完整的 Arduino 資訊
                        String fulldata = sb.toString().replace("\r", "").replace("\n", "");
                        //System.out.printf("收到資料: %s, 資料長度: %d\n", fulldata, fulldata.length());
                        if (callback != null) {
                            callback.getValue(fulldata);
                        }
                        sb = new StringBuilder();
                    } else {
                        sb.append(data);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     *
     */
    public static class SerialWriter implements Runnable {

        OutputStream out;

        public SerialWriter(OutputStream out) {
            this.out = out;
        }

        public void run() {
            try {
                int c = -1;
                while (true) {
                    if (callback != null) {
                        c = callback.getRelayValue() ? 48 : 49;
                        this.out.write(c);
                        this.out.write(10);
                        //System.out.println(c);
                    }
                    Thread.sleep(1000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
