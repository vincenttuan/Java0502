package com.lab.ocp.day14.thread;
// 繼承 extends
// 實作 run()
public class Runner extends Thread {

    @Override
    public void run() {
        job();
    }
    
    public void job() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tname, i);
            if(tname.equals("兔子") && i == 500) {
                try {
                    System.out.println(tname + "睡覺中...");
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
            }
        }
    }
}
