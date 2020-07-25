package com.lab.ocp.day16.forkjoin;

import java.util.concurrent.RecursiveAction;

public class Sum extends RecursiveAction{
    final int A = 2; // 門檻值
    int stIndex, lstIndex;
    int[] data;

    public Sum(int[] data, int start, int end) {
        this.stIndex = start;
        this.lstIndex = end;
        this.data = data;
    }
    
    @Override
    protected void compute() {
        if(lstIndex - stIndex <= A) { // 小於或等於門檻值就直接求解
            int sum = 0;
            for(int i=stIndex;i<lstIndex;i++) {
                sum += data[i];
            }
            System.out.printf("sum: %d\n", sum);
        } else { // 進行拆分
            new Sum(data, stIndex+A, lstIndex).fork();
            new Sum(data, stIndex, Math.min(lstIndex, stIndex+A)).compute();
        }
    }
    
}
