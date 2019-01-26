package com.julianrios;

public class Car extends Vehicle{

    public boolean manual;
    private String gear;
    private int speed;

    public Car(int doors, boolean manual) {
        super(doors);
        this.manual = manual;
        this.gear = "parked";
        this.speed = 0;
    }

    public boolean getManual() {
        return manual;
    }

    public String setGear(String gear) {

        this.gear = gear.toLowerCase();

        if(!getManual()) {
            switch (gear) {

                case "drive":
                    this.gear = "Drive";
                    break;

                case "reverse":
                    this.gear = "Reverse";
                    break;

                case "neutral":
                    this.gear = "Neutral";
                    break;

                default:
                    this.gear = "Parked";
                    break;
            }
        } else {
            switch (gear) {

                case "1":
                    this.gear = "1";
                    break;

                case "2":
                    this.gear = "2";
                    break;

                case "3":
                    gear = "3";
                    break;

                case "4":
                    this.gear = "4";
                    break;

                case "5":
                    gear = "5";
                    break;

                case "6":
                    gear = "6";
                    break;

                case "reverse":
                    this.gear = "Reverse";
                    break;

                default:
                    this.gear = "Parked";
                    break;
            }
        }
        System.out.println(this.gear);
        return this.gear;
    }

    public String getGear() {
        return gear;
    }
}


