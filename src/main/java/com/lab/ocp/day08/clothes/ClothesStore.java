package com.lab.ocp.day08.clothes;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

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
                            clotheses[i-1] = new LargeTShirt(price, amount);
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
        ToIntFunction<Clothes> amountMultiPrice = c -> c.getAmount() * c.getPrice();
        int total = Arrays.stream(clotheses)
                .mapToInt(amountMultiPrice)
                .sum();
        System.out.printf("Total price: %,d\n", total);
        // 2.各別庫存成本
        int total_tshirt = Arrays.stream(clotheses)
                .filter(c -> c instanceof TShirt)
                .mapToInt(amountMultiPrice)
                .sum();
        int total_pants = Arrays.stream(clotheses)
                .filter(c -> c instanceof Pants)
                .mapToInt(amountMultiPrice)
                .sum();
        System.out.printf("Total T-Shirt price: %,d\n", total_tshirt);
        System.out.printf("Total Pants price: %,d\n", total_pants);
        // 3. T-shirt M 3 件, Pants S 2 件
        int sum = Arrays.stream(clotheses)
                    .filter(c -> c instanceof TShirt)
                    .filter(c -> c.getSize().equals("M"))
                    .findFirst()
                    .get()
                    .getPrice() * 3 
                  + 
                  Arrays.stream(clotheses)
                    .filter(c -> c instanceof Pants)
                    .filter(c -> c.getSize().equals("S"))
                    .findFirst()
                    .get()
                    .getPrice() * 2;
        System.out.println(sum);
    }
}
