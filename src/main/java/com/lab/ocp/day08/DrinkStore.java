package com.lab.ocp.day08;

public class DrinkStore {
    public static void main(String[] args) {
        Drink c1 = new Coffee("拿鐵", 50);
        Drink c2 = new Coffee("美式", 40);
        Drink c3 = new Coffee("焦糖", 60);
        
        Drink t1 = new Tea("紅茶", 20);
        Drink t2 = new Tea("綠茶", 25);
        
        Drink m1 = new Milk("巧克力", 45);
        Drink m2 = new Milk("鮮奶", 45);
        
        Drink j1 = new Juice("葡萄汁", 40);
        Drink j2 = new Juice("柳橙汁", 35);
        
        Drink[] drinks = {c1, c2, c3, t1, t2, m1, m2, j1, j2};
        // 所有的 Drink
        for(Drink drink : drinks) {
            System.out.printf("品名: %s 價格: $%d\n", drink.getName(), drink.getPrice());
        }
        // 只印出 Coffee
        for(Drink drink : drinks) {
            if(drink instanceof Coffee) {
                System.out.printf("品名: %s 價格: $%d\n", drink.getName(), drink.getPrice());
            }
        }
        // 平均價格 ?
        
        
    }
}
