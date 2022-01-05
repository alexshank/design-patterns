package com.alexshank.patterns.creational.abstractFactory;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneAbstractFactory;
import com.alexshank.patterns.creational.abstractFactory.models.android.AndroidFactory;
import com.alexshank.patterns.creational.abstractFactory.models.apple.AppleFactory;

public class AbstractFactoryApp {

    /*
     * We use an Abstract Factory below to either create an AppleFactory or AndroidFactory.
     *
     * The concrete factories can then build all the components needed for a phone.
     */
    public static void main(String[] args) {
        PhoneAbstractFactory phoneAbstractFactory = new AndroidFactory();
//        PhoneAbstractFactory phoneAbstractFactory = new AppleFactory();

        System.out.println();
        System.out.println("Display:");
        System.out.println(phoneAbstractFactory.buildPhoneScreen().printScreen());
        System.out.println("OS:");
        System.out.println(phoneAbstractFactory.buildOperatingSystem().printOS());
    }
}
