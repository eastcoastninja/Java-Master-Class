package com.julianrios;

public class Mazda extends Car {
    String model;
    boolean sportMode;

    public Mazda(boolean fly, boolean sail, boolean manual, String model, boolean sportMode) {
        super(fly, sail, manual);
        this.model = model;
        this.sportMode = false;
    }

    public String tooFasttooFurious(boolean sportMode) {

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
