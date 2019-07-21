package com.work.mydaggarworld.doagain;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    // provisioning method
    Car getCar();

    void injectCar(DaggerMainActivity daggerMainActivity);


    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent buildMe();


    }


}
