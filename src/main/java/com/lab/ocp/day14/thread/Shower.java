package com.lab.ocp.day14.thread;

class Father extends Thread {
    @Override
    public void run() {
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("工人開始送瓦斯");
        for(int i=1;i<=5;i++) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d 秒鐘 ", i);
            } catch (Exception e) {
                System.out.println("\n工人發生意外: " + e);
                return;
            }
        }
        System.out.println("\n工人將瓦斯送到家");
    }
}

public class Shower {
    
}
