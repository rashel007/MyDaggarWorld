package com.work.mydaggarworld;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolModule {

    @Provides
    Engine providePetrolEngine(PetrolEngine engine) {
        return engine;
    }

}
