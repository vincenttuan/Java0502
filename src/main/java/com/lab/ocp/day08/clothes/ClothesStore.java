package com.lab.ocp.day08.clothes;

import java.io.File;
import java.util.Arrays;
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
                            clotheses[i-1] = new SmallTShirt(price, amount);
                            break;
                        case "M":
                            clotheses[i-1] = new MedTShirt(price, amount);
                            break;
                        case "L":
                            clotheses[i-1] = new LargePants(price, amount);
                            break;
                    }
                    break;
                case "Pants":
                    switch(size) {
                        case "S":
                            clotheses[i-1] = new SmallPants(price, amount);
                            break;
                        case "M":
                            clotheses[i-1] = new MedPants(price, amount);
                            break;
                        case "L":
                            clotheses[i-1] = new LargePants(price, amount);
                            break;
                    }
                    break;
            }
        }
        for(Clothes clothes : clotheses) {
            System.out.println(clothes);
        }
        // 1.總庫存成本
        int total = Arrays.stream(clotheses)
                .mapToInt(c -> c.getAmount() * c.getPrice())
                .sum();
        System.out.printf("Total price: %,d\n", total);
        int total_tshirt = Arrays.stream(clotheses)
                .filter(c -> c instanceof TShirt)
                .mapToInt(c -> c.getAmount() * c.getPrice())
                .sum();
        int total_pants = Arrays.stream(clotheses)
                .filter(c -> c instanceof Pants)
                .mapToInt(c -> c.getAmount() * c.getPrice())
                .sum();
        System.out.printf("Total T-Shirt price: %,d\n", total_tshirt);
        System.out.printf("Total Pants price: %,d\n", total_pants);
    }
}
