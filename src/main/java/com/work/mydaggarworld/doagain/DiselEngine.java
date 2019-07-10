package com.work.mydaggarworld.doagain;

import android.util.Log;

public class DiselEngine implements Engine {

    private static final String TAG = "Car";

    private int horsePower;


    public DiselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Disel Engine Started . HorsePower " + horsePower);
    }
}
