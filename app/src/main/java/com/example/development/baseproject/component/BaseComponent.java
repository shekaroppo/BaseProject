package com.example.development.baseproject.component;

import com.example.development.baseproject.module.BaseModule;
import com.example.development.baseproject.module.ExampleModule;
import com.example.development.baseproject.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shekar on 7/3/15.
 */

@Singleton
@Component(modules = {
        BaseModule.class,
        NetworkModule.class,
})
public interface BaseComponent {
        ExampleComponent plus(ExampleModule exampleModule);
}
