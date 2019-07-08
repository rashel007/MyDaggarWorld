package com.work.mydaggarworld.doagain;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }


    public void drive() {
        Log.d(TAG, "driving...");
    }

    /*

    Dagger First Inject the constructor
    Then
    Ineject the Field
    Then
    Inject the Method
     */

    /*
    WE can use @Inject in 3 places
    1. Constructor
    2. Fields
    3. Methods

    * IF Constructor Injected then fields and methods are automatically injected
    * But For DaggerMainActivity, we have to pass the activity to Component , becoz we cant inject Activity
     */
}
