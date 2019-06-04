package com.work.mydaggarworld;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine;
    private Wheel wheel;


    // this is called constructor injection
    @Inject
    public Car( Wheel wheel) {
        this.wheel = wheel;
    }

    @Inject
    public void setListener(Remote remote){
        remote.setListener(this);
    }
    
    
    public void drive(){
        engine.start();
        Log.d(TAG, "drive: Driving");
    }
}
