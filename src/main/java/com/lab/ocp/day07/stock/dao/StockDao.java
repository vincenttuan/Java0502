package com.lab.ocp.day07.stock.dao;

import com.lab.ocp.day07.stock.po.Stock;

public class StockDao {
    private Stock[] stocks;
    private static StockDao _instance = new StockDao();
    private StockDao() {
        stocks = new Stock[1];
        stocks[0].set證券名稱("台積電");
    }
    public static StockDao getInstance() {
        return _instance;
    }
    
    public Stock[] getStocks() {
        return stocks;
    }
}
