package com.julianrios;

public class DeluxeBurger extends Hamburger {
    private double burgerPrice;
    private int maxAdditions;
    private String chips;
    private String drink;

    public DeluxeBurger(String name, String roll, String meat, String chips, String drink) {
        super(name, roll, meat);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double setBurgerPrice() {
        return burgerPrice = 10;
    }

    @Override
    public int setMaxAdditions() {
        return maxAdditions = 0;
    }
    @Override
    public double getBurgerPrice() {
        return burgerPrice;
    }

    @Override
    public double getGrandTotal() {
        return super.getGrandTotal();
    }

    @Override
    public int getMaxAdditions() {
        return maxAdditions;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public double addOnPrices(String addOn) {

        addOn = addOn.toLowerCase();

        switch (addOn) {
            case "soda":
                System.out.println("Soda is included with the " + getName());
                break;

            case "chips":
                System.out.println("Chips are included with the " + getName());
                break;
        }

        return 0;
    }

    @Override
    public double pricing() {

        double deluxeBurger = super.pricing();
        addOnPrices("soda");
        addOnPrices("chips");
        return deluxeBurger;
    }

    @Override
    public void pricesMenu() {
        super.pricesMenu();
    }
}
