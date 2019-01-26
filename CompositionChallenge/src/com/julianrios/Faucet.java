package com.julianrios;

public class Faucet {

    private String model;
    private int handle;

    public Faucet(String model, int handle) {
        this.model = model;
        this.handle = handle;
    }

    public void runWater(String temp) {

        temp = temp.toLowerCase();

        switch(temp) {
            case "hot":
                temp = "hot";
                break;

            case "cold":
                temp = "cold";
                break;

            default:
                temp = "warm";
                break;
        }

        System.out.println("Running " + temp + " water.");
    }

    public void turnOff() {
        System.out.println("Turning off water");
    }
}
