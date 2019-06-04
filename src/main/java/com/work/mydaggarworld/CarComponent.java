package com.work.mydaggarworld;

import com.work.mydaggarworld.WheelOutside.WheelsModule;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolModule.class})
public interface CarComponent {

    Car getCar();

    public void inject(MainActivity mainActivity);
}
