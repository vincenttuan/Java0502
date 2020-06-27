package com.lab.ocp.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Mary");
        queue.offer("Tom");
        System.out.println("排隊: " + queue);
        while (!queue.isEmpty()) {        
            String name = queue.poll();
            System.out.printf("%s 看診 目前排隊狀態: %s\n", name, queue);
        }
        System.out.println("排隊: " + queue);
    }
}
