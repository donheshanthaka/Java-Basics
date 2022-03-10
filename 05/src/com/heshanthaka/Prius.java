package com.heshanthaka;

public class Prius extends Toyota {
    private int batteryRange;

    public Prius(int batteryRange){
        super("Prius", "sedan", 4, 6, false);
        this.batteryRange = batteryRange;
    }
}
