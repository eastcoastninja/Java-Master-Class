package com.julianrios;

public class BathRoom {
    private Sink sink;
    private Toilet toliet;
    private Bathtub bathtub;
    private Light lightswitch;

    public BathRoom(Sink sink, Toilet toliet, Bathtub bathtub, Light lightswitch) {
        this.sink = sink;
        this.toliet = toliet;
        this.bathtub = bathtub;
        this.lightswitch = lightswitch;
    }

    public void nightly(String temp) {
        bubbleBath(temp);
        cleanTeeth(temp);
    }

    private void bubbleBath(String temp) {
        bathtub.getFaucet().runWater(temp);
        System.out.println("Bath-time!");
        bathtub.getFaucet().turnOff();
    }

    private void cleanTeeth(String temp) {
        sink.getFaucet().runWater(temp);
        System.out.println("Brush teeth: Floss, Rinse, Brush, Rinse. All clean!");
        sink.getFaucet().turnOff();
    }

    public void washHands(String temp) {
        sink.getFaucet().runWater(temp);
        System.out.println("Wash hands: Rinse, Soap, Rinse");
        sink.getFaucet().turnOff();
    }

    public void useToilet() {
        toliet.flush();
    }

     public Light getLightswitch() {
        return lightswitch;
    }
}
