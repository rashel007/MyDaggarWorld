package com.work.mydaggarworld.doagain;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModule {

    int horsePower;

    public DiselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    // if we want just the implementation part , then we should use @Binds
    @Provides
    Engine bindsEngine(DiselEngine diselEngine) {
        return diselEngine;
    }
}
