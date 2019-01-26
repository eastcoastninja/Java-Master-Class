package com.julianrios;

public class Light {

    public Light() {
    }

    public void powerOnorOff(boolean switches) {

        if (switches) {
            System.out.println("Turning lights on");
        } else {
            System.out.println("Turning lights off");
        }
    }
}
