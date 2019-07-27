package com.work.mydaggarworld.doagain.GOT.module;

import android.content.Context;


import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import com.work.mydaggarworld.doagain.GOT.CustomAnnotation.RandomUserApplicationScope;
import com.work.mydaggarworld.doagain.GOT.interfaces.ApplicationContext;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module(includes = OkHttpClientModule.class)
public class PicassoModule {

    @RandomUserApplicationScope
    @Provides
    public Picasso picasso(@ApplicationContext Context context, OkHttp3Downloader okHttpDownloader) {
        return new Picasso.Builder(context).downloader(okHttpDownloader).build();
    }

    @Provides
    public OkHttp3Downloader okHttpDownloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }
}
