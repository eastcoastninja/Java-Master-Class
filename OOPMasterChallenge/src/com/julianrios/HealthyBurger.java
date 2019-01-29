package com.julianrios;

public class HealthyBurger extends Hamburger {
    private double burgerPrice;
    private double additionsTotal;
    private int maxAdditions;

    public HealthyBurger(String name, String meat) {
        super(name, "Brown rye roll", meat);
    }

    @Override
    public double setBurgerPrice() {
        return burgerPrice = 9.00;
    }

    @Override
    public int setMaxAdditions() {
        return maxAdditions = 6;
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
    public double getAdditionsTotal() {
        return additionsTotal;
    }

    @Override
    public int getMaxAdditions() {
        return maxAdditions;
    }

    @Override
    public double additions() {
        this.additionsTotal += super.additions();
        return this.additionsTotal;
    }

    @Override
    public int maxCounter(String addOn) {

        return super.maxCounter(addOn);
    }

    @Override
    public boolean maxAddons(String addOns) {
        // tracks number of additions
        addOns = addOns.toLowerCase();
        boolean valid = false; // validates if the string passed is a passing value

        if(addOns.equals("avocado")||addOns.equals("turkey bacon")) {
            valid = true;
        } else {
            valid = super.maxAddons(addOns);
        }
        return valid;
    }

    @Override
    public double addOnPrices(String addOn) {

        double temp = 0; // used to store pricing of additions in temp var to be transferred to additions var if added
        addOn = addOn.toLowerCase();

        switch (addOn) {
            case "avocado":
                System.out.println("Avocado: $.75");
                temp += 0.75;
                break;

            case "turkey bacon":
                System.out.println("Turkey Bacon: $.60");
                temp += 0.60;
                break;
        }
        temp += super.addOnPrices(addOn);

        return temp;
    }

    @Override
    public double pricing() {

        double temp = 0;

        double healthyBurger = super.pricing();
        temp += addOnPrices("avocado");
        temp += addOnPrices("turkey bacon");
        healthyBurger += temp;
        return healthyBurger;
    }

    @Override
    public void pricesMenu() {
        super.pricesMenu();
    }
}