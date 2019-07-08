package com.work.mydaggarworld.doagain;

public class Wheel {
    // Lets imagine we cant own this, class, then we cant inject this class
    // SO for now TO Create Car class Dagger dont no hot to get Wheel Object
    // Here comes @Module and @Provide annotations
    // We neet to create a Module Class and create necessary objects with Provide annotation to create wheel object

    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
