package com.work.mydaggarworld.doagain;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelModule {

    @Provides
  static   Rims provideRims() {
        return new Rims();
    }

    @Provides
    static  Tires provideTires() {
        // If we want to do some work with the class then we can do here before passing the class object
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static  Wheel provideWheel(Rims rims, Tires tires) {
        return new Wheel(rims, tires);
    }
}
