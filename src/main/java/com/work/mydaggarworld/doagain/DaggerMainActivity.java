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
    Car car1, car2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityComponent activityComponent = DaggerActivityComponent.builder().diselEngineModule(new DiselEngineModule(100)).build();
//        car = activityComponent.getCar(); we can also get the car inctance by Field Injection

        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .engineCapacity(100)
                .horsePower(1400)
                .appComponent(((MyExampleApp) getApplicationContext()).getActivityComponent())
                .buildMe();
        activityComponent.injectCar(this);

        car1.drive();
        car2.drive();
    }


    /*

        Dagger first inject constructor
        Then
        Inject the Field
        Then
        Inejct the Method
     */
}
