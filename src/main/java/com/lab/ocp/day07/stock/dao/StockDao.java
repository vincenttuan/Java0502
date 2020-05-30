package com.lab.ocp.day07.stock.dao;

import com.lab.ocp.day07.stock.po.Stock;
import java.io.File;
import java.util.Scanner;

public class StockDao {
    private Stock[] stocks;
    private static StockDao _instance = new StockDao();
    private StockDao() {
        try {
            File file = new File("src\\main\\java\\com\\lab\\ocp\\day07\\stock\\db\\BWIBBU_d.txt");
            String data = new Scanner(file, "UTF-8").useDelimiter("\\A").next();
            String[] rows = data.split("\r\n");
            stocks = new Stock[rows.length];
            for(int i=0;i<rows.length;i++) {
                String[] row = rows[i].split(",");
                Stock stock = new Stock();
                stock.set證券代號(row[0]);
                stock.set證券名稱(row[1]);
                stock.set殖利率(row[2]);
                stock.set股利年度(row[3]);
                stock.set本益比(row[4]);
                stock.set股價淨值比(row[5]);
                stock.set財報年季(row[6]);
                stocks[i] = stock;
            }
        } catch (Exception e) {
        }
    }
    public static StockDao getInstance() {
        return _instance;
    }
    
    public Stock[] getStocks() {
        return stocks;
    }
    
    
}
