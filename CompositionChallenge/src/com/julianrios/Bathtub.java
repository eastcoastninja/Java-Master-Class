package com.julianrios;

public class Bathtub {
    private String model;
    private Faucet faucet;

    public Bathtub(String model, Faucet faucet) {
        this.model = model;
        this.faucet = faucet;
    }

    public Faucet getFaucet() {
        return faucet;
    }
}
