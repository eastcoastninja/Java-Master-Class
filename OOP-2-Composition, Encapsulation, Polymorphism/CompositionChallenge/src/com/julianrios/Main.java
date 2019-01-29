package com.julianrios;

public class Main {

    public static void main(String[] args) {

        Faucet sinkFaucet = new Faucet("American Standard", 2);
        Sink sink = new Sink("American Standard", sinkFaucet);

        Toilet toilet = new Toilet("European Standard");

        Faucet tubFaucet = new Faucet("American Standard", 1);
        Bathtub bathtub = new Bathtub("American Standard", tubFaucet);

        Light lightSwitch = new Light();

        BathRoom bathRoom = new BathRoom(sink, toilet, bathtub, lightSwitch);

        System.out.println("Nightly routine");

        bathRoom.getLightswitch().powerOnorOff(true);

        bathRoom.useToilet();

        bathRoom.washHands("hot");

        bathRoom.nightly("warm");

        bathRoom.getLightswitch().powerOnorOff(false);


    }
}
