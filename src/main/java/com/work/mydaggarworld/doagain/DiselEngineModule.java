package com.work.mydaggarworld.doagain;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiselEngineModule {

    // if we want just the implementation part , then we should use @Binds
    @Binds
    abstract Engine bindsEngine(DiselEngine engine);
}
