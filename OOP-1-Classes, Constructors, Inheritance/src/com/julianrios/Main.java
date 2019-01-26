package com.julianrios;

public class Main {

    public static void main(String[] args) {

        Mazda mazda = new Mazda(4,true,"CX5", false);

//        Car maz = new Car(2,true);
//
//        Mazda coupe = new Mazda(2, false, "CX3", false);
//
//        mazda.tooFastTooFurious(mazda.isSportMode());
//
//        System.out.println(mazda.getModel());
//
//        mazda.setSteering("right");
//        mazda.setGear("6");
//        mazda.getSpeed();
//        mazda.velocity(100);
//
//        coupe.setGear("reverse");
//
        mazda.tooFastTooFurious(true);
        mazda.velocity(100);
        mazda.tooFastTooFurious(false);
        mazda.velocity(80);
        mazda.stop();
        mazda.getSpeed();

    }
}
