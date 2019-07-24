package com.work.mydaggarworld.doagain.GOT.module;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.work.mydaggarworld.doagain.GOT.interfaces.RandomUsersApi;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = OkHttpClientModule.class)
public class RandomUsersModule {

    @Provides
    public RandomUsersApi randomUsersApi(Retrofit retrofit) {

        return retrofit.create(RandomUsersApi.class);
    }

    @Provides
    public Retrofit getRetrofit(OkHttpClient okHttpClient, GsonConverterFactory gsonConverterFactory) {

        return new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(gsonConverterFactory)
                .build();

    }

    @Provides
    public GsonConverterFactory getGsonConverterFactory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides
    public Gson getGson() {
        GsonBuilder builder = new GsonBuilder();
        return builder.create();
    }
}
