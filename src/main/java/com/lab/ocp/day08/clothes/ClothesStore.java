package com.lab.ocp.day08.clothes;

import java.io.File;
import java.util.Scanner;

public class ClothesStore {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day08\\clothes\\clothes.txt");
        String data = new Scanner(file).useDelimiter("\\A").next();
        String[] rows = data.split("\n");
        Clothes[] clotheses = new Clothes[rows.length-1];
        for(int i=1;i<rows.length;i++) {
            String[] row = rows[i].trim().split(",");
            String kind = row[0].trim();
            String size = row[1].trim();
            Integer price = Integer.parseInt(row[2].trim());
            Integer amount = Integer.parseInt(row[3].trim());
            // 將衣服與褲子分類選定放好
            switch(kind) {
                case "T-Shirt":
                    switch(size) {
                        case "S":
                            break;
                        case "M":
                            break;
                        case "L":
                            break;
                    }
                    break;
                case "Pants":
                    switch(size) {
                        case "S":
                            break;
                        case "M":
                            break;
                        case "L":
                            break;
                    }
                    break;
            }
        }
    }
}
