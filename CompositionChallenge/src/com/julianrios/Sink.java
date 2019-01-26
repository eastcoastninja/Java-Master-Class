package com.julianrios;

public class Sink {
    private String model;
    private Faucet faucet;

    public Sink(String model, Faucet faucet) {
        this.model = model;
        this.faucet = faucet;
    }


    public Faucet getFaucet() {
        return faucet;
    }

}
