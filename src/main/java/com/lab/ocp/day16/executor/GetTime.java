package com.lab.ocp.day16.executor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime implements Runnable {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
    
}
