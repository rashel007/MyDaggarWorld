package com.work.mydaggarworld.doagain.GOT.module;


import android.content.Context;

import com.work.mydaggarworld.doagain.GOT.CustomAnnotation.RandomUserApplicationScope;
import com.work.mydaggarworld.doagain.GOT.interfaces.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    public Context getContext() {
        return context.getApplicationContext();
    }
}
