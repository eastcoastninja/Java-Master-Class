package com.julianrios;

public class Main {

    public static void main(String[] args) {
	// write your code here

        DeluxeBurger db = new DeluxeBurger("Cheese Burger", "whole", "burger", "bbq","sprite");
        HealthyBurger hb = new HealthyBurger("Crabby Patty", "Crabby");
        Hamburger hamb = new Hamburger("Crabby Patty", "Crabby", "patty");

        hb.pricesMenu();
        hb.additions();
        hb.getGrandTotal();
//        db.pricesMenu();
//        hamb.pricesMenu();

    }
}
