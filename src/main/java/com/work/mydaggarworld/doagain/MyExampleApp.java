package com.work.mydaggarworld.doagain;

import android.app.Application;

public class MyExampleApp extends Application {


    CarComponent carComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent.builder().horsePower(150).engineCapacity(1400).buildMe();
    }


    public CarComponent getCarComponent() {
        return carComponent;
    }
}
