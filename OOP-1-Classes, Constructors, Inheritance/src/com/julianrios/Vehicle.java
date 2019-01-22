package com.julianrios;

public class Vehicle {
    private int wheels;
    private int doors;
    private boolean drive;
    private boolean fly;
    private boolean sail;

    public Vehicle() {
        this(2, 0, true,false, false);
    }

    public Vehicle(boolean fly, boolean sail) {
        this(4, 4, true, fly, sail);
    }

    public Vehicle(int wheels, int doors, boolean drive, boolean fly, boolean sail) {
        this.wheels = wheels;
        this.doors = doors;
        this.drive = drive;
        this.fly = fly;
        this.sail = sail;
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

