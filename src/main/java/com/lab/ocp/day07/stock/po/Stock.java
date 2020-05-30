package com.lab.ocp.day07.stock.po;

public class Stock {
    private String 證券代號;
    private String 證券名稱;
    private String 殖利率;
    private String 股利年度;
    private String 本益比;
    private String 股價淨值比;
    private String 財報年季;

    public Stock() {
    }

    public Stock(String 證券代號, String 證券名稱, String 殖利率, String 股利年度, String 本益比, String 股價淨值比, String 財報年季) {
        this.證券代號 = 證券代號;
        this.證券名稱 = 證券名稱;
        this.殖利率 = 殖利率;
        this.股利年度 = 股利年度;
        this.本益比 = 本益比;
        this.股價淨值比 = 股價淨值比;
        this.財報年季 = 財報年季;
    }
    
    public String get證券代號() {
        return 證券代號;
    }

    public void set證券代號(String 證券代號) {
        this.證券代號 = 證券代號;
    }

    public String get證券名稱() {
        return 證券名稱;
    }

    public void set證券名稱(String 證券名稱) {
        this.證券名稱 = 證券名稱;
    }

    public String get殖利率() {
        return 殖利率;
    }

    public void set殖利率(String 殖利率) {
        this.殖利率 = 殖利率;
    }

    public String get股利年度() {
        return 股利年度;
    }

    public void set股利年度(String 股利年度) {
        this.股利年度 = 股利年度;
    }

    public String get本益比() {
        return 本益比;
    }

    public void set本益比(String 本益比) {
        this.本益比 = 本益比;
    }

    public String get股價淨值比() {
        return 股價淨值比;
    }

    public void set股價淨值比(String 股價淨值比) {
        this.股價淨值比 = 股價淨值比;
    }

    public String get財報年季() {
        return 財報年季;
    }

    public void set財報年季(String 財報年季) {
        this.財報年季 = 財報年季;
    }
    
}
