package com.lab.ocp.day02;

import com.lab.ocp.day02.bar.CellPhone;

public class PhoneMain {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        cp.job(); // job 的權限是 public
        //cp.price(); // price 的權限是無修飾字
    }
}
