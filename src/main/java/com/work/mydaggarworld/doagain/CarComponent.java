package com.work.mydaggarworld.doagain;

import dagger.Component;

@Component
public interface CarComponent {

    // provisioning method
    Car getCar();

    void injectCar(DaggerMainActivity daggerMainActivity);
}
