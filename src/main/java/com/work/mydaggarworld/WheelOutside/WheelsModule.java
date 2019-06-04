package com.work.mydaggarworld.WheelOutside;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims rimsProvider(){
        return new Rims();
    }

    @Provides
    Tires tiresProvider() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheel2 wheel2Provider(Rims rims, Tires tires){
        return new Wheel2(rims, tires);
    }
}
