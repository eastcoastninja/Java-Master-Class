package com.julianrios;

public class Mazda extends Car {
    String model;
    boolean sportMode;

    public Mazda(int doors, boolean manual, String model, boolean sportMode) {
        super(doors, manual);
        this.model = model;
        this.sportMode = false;
    }

    @Override
    public int velocity(int speed) {
        if(isSportMode()) {
            super.velocity(speed+10);
        } else {
            super.velocity(speed);
        }
        return speed;
    }

    public String tooFastTooFurious(boolean sportMode) {

        String indicator;
        this.sportMode = sportMode;

        if(sportMode) {
            indicator = "Sport mode enabled";
        } else {
            indicator = "Sports mode disabled";
        }
        System.out.println(indicator);
        return indicator;
    }

    public boolean isSportMode() {
        return sportMode;
    }

    public String getModel() {
        return model;
    }
}
