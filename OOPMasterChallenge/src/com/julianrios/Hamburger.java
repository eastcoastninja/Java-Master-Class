package com.julianrios;

import java.util.Scanner;

public class Hamburger {
    private String name;
    private String roll;
    private String meat;
    private double grandTotal;
    private double burgerPrice;
    private double additionsTotal;
    private int maxAdditions;

    public Hamburger(String name, String roll, String meat) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.grandTotal = 0;
        this.additionsTotal = 0;
        this.burgerPrice = setBurgerPrice();
        this.maxAdditions = setMaxAdditions();
    }

    public double setBurgerPrice() {
        return burgerPrice = 8.00;
    }

    public int setMaxAdditions() {
        return maxAdditions = 4;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public double getGrandTotal() {
        this.grandTotal = getBurgerPrice() + getAdditionsTotal();
        System.out.println("Grand Total: $" + String.format("%.2f", this.grandTotal));
        return this.grandTotal;
    }

    public double getAdditionsTotal() {
        return additionsTotal;
    }

    public int getMaxAdditions() {
        return maxAdditions;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getMeat() {
        return meat;
    }

    // method for allowing additions returns number of total number of additions made
    public double additions() {

        if(getMaxAdditions() == 0) {
            System.out.println("Sorry the " + getName() + " is not eligible for any more additions");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What would you like to add?");

            String addOn = scanner.nextLine();
            addOn = addOn.toLowerCase();

            maxCounter(addOn);


            if(!(addOn.equals("no"))) {

                // if the value readIn equals anything but no run the loop
                do {

                    this.additionsTotal += addOnPrices(addOn); // gets pricesMenu of each addOn and adds them into the additionsTotal

                    // breaks from loop if reached maximum number of additionsTotal
                    if(this.maxAdditions <= 0) {
                        System.out.println("Sorry you have reached your maximum additions");
                        break;
                    }

                    System.out.println("Anything else?");
                    addOn = scanner.nextLine();

                    maxCounter(addOn);

                } while(!(addOn.equals("no")));
            }

            System.out.println("Total cost of additions: $" + String.format("%.2f", this.additionsTotal));

        }

        return this.additionsTotal;
    }

    public int maxCounter(String addOn) {

        if(maxAddons(addOn)) {
            this.maxAdditions--;// decrease the number of maxAdditions allowed if method value returned == true
        }
        return this.maxAdditions;
    }

    public boolean maxAddons(String addOns) {

        // tracks number of additionsTotal
        addOns = addOns.toLowerCase();
        boolean valid = false; // validates if the string passed is a passing value

        if(addOns.equals("lettuce")||addOns.equals("tomato")||addOns.equals("pickles")||addOns.equals("onions")) {
            valid = true;

        }

//        String order = "You purchased " + getName() + " " + getRoll() + " " + getMeat() + " " + addOns;
//        order(order);

        return valid;
    }

    public double addOnPrices(String addOn) {

        double temp = 0; // used to store pricing of additionsTotal in temp var to be transferred to additionsTotal var if added
        addOn = addOn.toLowerCase();

        switch (addOn) {

            case "lettuce":
                System.out.println("Lettuce: $.10");
                temp += 0.10;
                break;

            case "tomato":
                System.out.println("Tomato: $.10");
                temp += 0.10;
                break;

            case "pickles":
                System.out.println("Pickles: $.20");
                temp += 0.20;
                break;

            case "onions":
                System.out.println("Onions: $.30");
                temp += 0.30;
                break;

            default:
                temp += 0;
                break;
        }
        return temp;
    }

    public double pricing() {

        double temp = 0; // holds the value of each extra
        System.out.println("===================");
        System.out.println(getClass().getSimpleName()+" Menu");
        System.out.println("===================");
        temp += addOnPrices("lettuce");
        temp += addOnPrices("tomato");
        temp += addOnPrices("onions");
        temp += addOnPrices("pickles");


        double everythingBurger = getBurgerPrice() + temp;

        return everythingBurger;
    }

    public void pricesMenu() {

        double everything = pricing();
        String everythingBurger = String.format("%.2f", everything);
        System.out.println(getName() + " with everything: $" + everythingBurger);
    }

//    public String order(String order) {
//
//        System.out.println("You purchased " + order);
//        return order;
//    }
}
