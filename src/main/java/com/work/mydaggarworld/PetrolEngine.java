package com.work.mydaggarworld;

import android.util.Log;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;

    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine Started. HorsePower "+ horsePower);
    }
}
