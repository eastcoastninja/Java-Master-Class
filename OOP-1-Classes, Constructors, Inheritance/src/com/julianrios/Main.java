package com.julianrios;

public class Main {

    public static void main(String[] args) {

        Mazda mazda = new Mazda(false, false, false, "CX5", false);

//        mazda.getSpeed();
//        mazda.velocity(80);
//        mazda.getSpeed();
//        mazda.velocity(65);
//        mazda.getSpeed();

        mazda.tooFasttooFurious(mazda.isSportMode());

        System.out.println(mazda.getModel());
    }
}
