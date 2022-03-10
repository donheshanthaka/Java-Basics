package com.heshanthaka;

public class Toyota extends Car {

    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Toyota(String name, String size, int doors, int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Toyota.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    @Override
    public void stop(){
        super.stop();
        this.currentGear = 1;
    }

}
