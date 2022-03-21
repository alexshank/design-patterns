package patterns.creational.factories.models.factories;

import patterns.creational.factories.models.products.AndroidNuget;
import patterns.creational.factories.models.products.iOS;

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
