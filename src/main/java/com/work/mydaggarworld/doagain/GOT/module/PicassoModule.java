package com.work.mydaggarworld.doagain.GOT.module;

import android.content.Context;


import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module(includes = OkHttpClientModule.class)
public class PicassoModule {

    @Provides
    public Picasso picasso(Context context, OkHttp3Downloader okHttpDownloader) {
        return new Picasso.Builder(context).downloader(okHttpDownloader).build();
    }

    @Provides
    public OkHttp3Downloader okHttpDownloader(OkHttpClient okHttpClient) {
        return new OkHttp3Downloader(okHttpClient);
    }
}
