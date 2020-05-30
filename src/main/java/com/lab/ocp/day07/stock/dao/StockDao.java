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
            System.out.println(data);
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
