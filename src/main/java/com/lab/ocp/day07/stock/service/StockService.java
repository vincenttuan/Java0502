package com.lab.ocp.day07.stock.service;

import com.lab.ocp.day07.stock.dao.StockDao;
import com.lab.ocp.day07.stock.po.Stock;
import java.util.Arrays;

public class StockService {
    private StockDao dao = StockDao.getInstance();
    
    public void find本益比(double value) {
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks)
                .filter(s -> !(s.get本益比().equals("-")))
                .filter(s -> Double.parseDouble(s.get本益比()) <= value)
                .forEach(s -> System.out.println(s));
    }
    
    public void findBestBuy(double pe, double yield) { // 本益比, 殖利率
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks)
                .filter(s -> !(s.get本益比().equals("-")))
                .filter(s -> !(s.get股價淨值比().equals("-")))
                .filter(s -> Double.parseDouble(s.get本益比()) <= pe)
                .filter(s -> Double.parseDouble(s.get殖利率()) >= yield)
                .forEach(s -> System.out.println(s));
    }
}
