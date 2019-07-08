package com.work.mydaggarworld;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselModule {

    int horsePower;

    public DiselModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideDiselEngine(){
        return new PetrolEngine(horsePower);
    }
}
