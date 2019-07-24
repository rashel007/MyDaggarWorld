package com.work.mydaggarworld.doagain.GOT.component;


import com.squareup.picasso.Picasso;
import com.work.mydaggarworld.doagain.GOT.interfaces.RandomUsersApi;
import com.work.mydaggarworld.doagain.GOT.module.PicassoModule;
import com.work.mydaggarworld.doagain.GOT.module.RandomUsersModule;

import dagger.Component;

@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUsersApi();

    Picasso getPicasso();
}
