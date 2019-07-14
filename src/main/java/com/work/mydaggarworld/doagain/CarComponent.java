package com.work.mydaggarworld.doagain;



import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelModule.class,  PetrolEngineModule.class})
public interface CarComponent {

    // provisioning method
    Car getCar();

    void injectCar(DaggerMainActivity daggerMainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent buildMe();



    }


}
