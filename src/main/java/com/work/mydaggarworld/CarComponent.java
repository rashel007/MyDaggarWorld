package com.work.mydaggarworld;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    public void inject(MainActivity mainActivity);
}
