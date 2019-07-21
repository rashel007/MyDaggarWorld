package com.work.mydaggarworld.doagain;

import android.app.Application;

public class MyExampleApp extends Application {


    AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().build();
    }


    public AppComponent getActivityComponent() {
        return appComponent;
    }
}
