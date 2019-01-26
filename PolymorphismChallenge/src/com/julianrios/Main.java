package com.julianrios;

class Car {
    private String model;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String model, boolean engine, int cylinders) {
        this.model = model;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine() {
        System.out.println("Car: Engine Started");
    }

    public int accelerate(int speed) {
        this.speed += speed;
        System.out.println("Car: Accelerating to " + this.speed + " mph");
        return this.speed;
    }

    public int brake(int speed) {
        this.speed -= speed;
        if(this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Car: Decelerating to " + this.speed + " mph");
        return this.speed;

    }

    public String zeroToSixty() {
        return "Car: The average 0-60 mph is 8 seconds";
    }

    public String getModel() {
        return model;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mazda extends Car {

    public Mazda() {
        super("CX5", true, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Mazda -> Zoom-Zoom");
    }

    @Override
    public int accelerate(int speed) {
        System.out.print("Mazda -> ");
        return super.accelerate(speed);
    }

    @Override
    public int brake(int speed) {
        System.out.print("Mazda -> ");
        return super.brake(speed);
    }

    @Override
    public String zeroToSixty() {
        return super.zeroToSixty() + "\nMazda: The " + getModel() + " can go 0-60 mph in 6.4 seconds.";
    }
}

class Honda extends Car {
    public Honda() {
        super("CRV", true, 4);
    }

    @Override
    public void startEngine() {
        System.out.print("Honda -> ");
        super.startEngine();
    }

    @Override
    public int accelerate(int speed) {
        System.out.print("Honda -> ");
        return super.accelerate(speed);
    }

    @Override
    public int brake(int speed) {
        System.out.print("Honda -> ");
        return super.brake(speed);
    }

    @Override
    public String zeroToSixty() {
        return super.zeroToSixty() + "\nHonda: The " + getModel() + " can go 0-60 mph in 8.7 seconds.";
    }

}

class Ford extends Car {
    public Ford() {
        super("Mustang", true, 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> Vrooommmmm");
    }

    @Override
    public int accelerate(int speed) {
        System.out.print("Ford -> ");
        return super.accelerate(speed);
    }

    @Override
    public int brake(int speed) {
        System.out.print("Ford -> ");
        return super.brake(speed);
    }

    @Override
    public String zeroToSixty() {
        return super.zeroToSixty() + "\nFord: The " + getModel() + " can go 0-60 mph in < 4 seconds.";
    }

}

class Tesla extends Car {
    public Tesla() {
        super("Model X", false, 0);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla -> Is it on?");;
    }

    @Override
    public int accelerate(int speed) {
        System.out.print("Tesla -> ");
        return super.accelerate(speed);
    }

    @Override
    public int brake(int speed) {
        System.out.print("Tesla -> ");
        return super.brake(speed);
    }

    @Override
    public String zeroToSixty() {
        return super.zeroToSixty() + "\nTesla: The " + getModel() + " can go 0-60 mph in < 2 seconds.";
    }
}

public class Main {

    public static void main(String[] args) {
//        for(int i = 0; i < 7; i++) {
//            Car car = testDrive();
//            System.out.println("Car #" + i + " : " + car.getModel() + "\n" + car.zeroToSixty());
//        }

        Mazda maz = new Mazda();
        maz.accelerate(60);
        maz.accelerate(60);
        maz.brake(70);

        maz.startEngine();

        Tesla telsa = new Tesla();
        telsa.accelerate(60);
        telsa.accelerate(60);
        telsa.brake(70);

        telsa.startEngine();

        Ford mustang = new Ford();
        mustang.accelerate(60);
        mustang.accelerate(60);
        mustang.brake(70);

        mustang.startEngine();

        Honda crv = new Honda();
        crv.accelerate(60);
        crv.accelerate(60);
        crv.brake(70);

        crv.startEngine();

    }

    public static Car testDrive() {
        int randomNum = (int) (Math.random() * 3) + 1; // Math.random returns a double so cast to int

        switch(randomNum) {
            case 1:
                return new Mazda();

            case 2:
                return new Honda();

            case 3:
                return new Tesla();
        }
        return null; // too handle case outside of 0 to 3 but not needed.
    }
}
