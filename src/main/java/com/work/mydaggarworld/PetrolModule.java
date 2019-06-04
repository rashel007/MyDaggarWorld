package com.work.mydaggarworld;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolModule {

    @Binds
    abstract Engine bindsPetrolEngine(PetrolEngine engine);

}
