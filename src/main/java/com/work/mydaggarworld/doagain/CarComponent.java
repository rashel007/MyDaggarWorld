package com.work.mydaggarworld.doagain;



import dagger.Component;

@Component(modules = {WheelModule.class, DiselEngineModule.class})
public interface CarComponent {

    // provisioning method
    Car getCar();

    void injectCar(DaggerMainActivity daggerMainActivity);
}
