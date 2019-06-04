package com.work.mydaggarworld;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolModule {

    private int horsePower;

    public PetrolModule(int horsePower) {
        this.horsePower = horsePower;
    }


    @Provides
    Engine providesPetrolEngine() {
        return new PetrolEngine(horsePower);
    }

}
