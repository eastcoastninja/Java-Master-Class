package com.julianrios;

public class Car extends Vehicle{

    public boolean manual;
    private String gear;
    private int speed;

    public Car() {
    }

    public Car(boolean fly, boolean sail, boolean manual) {
        super(fly, sail);
        this.manual = manual;
        this.gear = "parked";
        this.speed = 0;
    }

    public boolean getManual() {
        return manual;
    }

    public void setSteering(String steering) {

        steering = steering.toLowerCase();

        switch (steering) {

            case "left":
                System.out.println("Turning left");
                break;

            case "right":
                System.out.println("Turning left");
                break;

            default:
                System.out.println("Moving forward");
                break;
        }
    }

    public String setGear(String gear) {

        this.gear = gear.toLowerCase();

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
        System.out.println(gear);
        return gear;
    }

    public String setGear(String gear, boolean manual) {

        if(manual == false) {
            return "Invalid transmission"; // exits method
        }

        gear = gear.toLowerCase();

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
        System.out.println(gear);
        return gear;
    }

    public String getGear() {
        return gear;
    }

    public void getSpeed() {
        System.out.println("You are going " + speed +" mph");
    }

    public void velocity(int speed) {
        if(speed > this.speed) {
            System.out.println("Accelerating to " + speed);
        } else {
            System.out.println("Decelerating to " + speed);
        }
        this.speed = speed;
    }
}


