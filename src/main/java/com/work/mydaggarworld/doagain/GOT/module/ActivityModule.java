package com.work.mydaggarworld.doagain.GOT.module;


import android.content.Context;

import com.work.mydaggarworld.doagain.GOT.CustomAnnotation.RandomUserApplicationScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    Context getContext() {
        return context;
    }
}
