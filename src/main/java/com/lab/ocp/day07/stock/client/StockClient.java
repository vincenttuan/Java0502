package com.lab.ocp.day07.stock.client;

import com.lab.ocp.day07.stock.service.StockService;

public class StockClient {
    public static void main(String[] args) {
        StockService service = new StockService();
        service.findBestBuy(7, 10);
    }
}
