package com.work.mydaggarworld.doagain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.work.mydaggarworld.R;

import javax.inject.Inject;

public class DaggerMainActivity extends AppCompatActivity {

    //   private Car car;
//    to inject variable or field we cant declare the field private.
    // but this will throw a null point exception. to inject field we need to pass this activity in dagger component
    @Inject
    Car car;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
//        car = carComponent.getCar(); we can also get the car inctance by Field Injection

        carComponent.injectCar(this);

        car.drive();
    }
    

    /*

        Dagger first inject constructor
        Then
        Inject the Field
        Then
        Inejct the Method
     */
}
