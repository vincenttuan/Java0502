package com.lab.ocp.day06;

public class FastFood {
    private String name;
    private Hamburger hamburger;
    private SideDish sideDish;
    private Drink drink;

    public FastFood(String name) {
        this.name = name;
    }

    public FastFood(String name, Hamburger hamburger, SideDish sideDish, Drink drink) {
        this.name = name;
        this.hamburger = hamburger;
        this.sideDish = sideDish;
        this.drink = drink;
    }
    
    // 業務方法
    public int getPrice() {
        int price = hamburger.getPrice() + sideDish.getPrice() + drink.getPrice();
        //price = (int)(price * 0.9); // 打九折
        return price;
    }
    
    public String getName() {
        return name;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "FastFood{" + "name=" + name + ", hamburger=" + hamburger + ", sideDish=" + sideDish + ", drink=" + drink + '}';
    }
    
}
