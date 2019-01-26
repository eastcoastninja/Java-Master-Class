package com.julianrios;

public class Vehicle {
    private int wheels;
    private int doors;
    private boolean drive;
    private boolean fly;
    private boolean sail;
    private int speed;

    public Vehicle() {
        this(4, 2, true,false, false);
    }

    public Vehicle(int doors) {
        this(4, doors, true, false, false);
    }

    public Vehicle(int wheels, int doors, boolean drive, boolean fly, boolean sail) {
        this.wheels = wheels;
        this.doors = doors;
        this.drive = drive;
        this.fly = fly;
        this.sail = sail;
        this.speed = 0;
    }

    public void getSpeed() {
        System.out.println("You are going " + this.speed + " mph");
    }

    public int velocity(int speed) {
        if(speed > this.speed) {
            System.out.println("Accelerating to " + speed + " mph");
        } else {
            System.out.println("Decelerating to " + speed + " mph");
        }
        return this.speed = speed;
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Stopping");
        velocity(0);
    }

    public void setSteering(String steering) {

        steering = steering.toLowerCase();

        switch (steering) {

            case "left":
                System.out.println("Turning left");
                break;

            case "right":
                System.out.println("Turning right");
                break;

            default:
                System.out.println("Moving forward");
                break;
        }
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isFly() {
        return fly;
    }

    public boolean isDrive() {
        return drive;
    }

    public boolean isSail() {
        return sail;
    }
}

