package com.julianrios;

public class Toilet {
    private String model;

    public Toilet(String model) {
        this.model = model;
    }

    public void flush() {
        System.out.println("Flushing the toilet");
    }
}
