package com.alexshank.patterns.creational.factories.models.factories;

import com.alexshank.patterns.creational.factories.models.products.AndroidNuget;
import com.alexshank.patterns.creational.factories.models.products.iOS;

/*
 * This is a concrete factory (not abstract) that creates OS products.
 */
public class PhoneOSFactory {
    public static iOS createAppleOS(){
        return new iOS();
    }

    public static AndroidNuget createAndroidOS(){
        return new AndroidNuget();
    }
}
