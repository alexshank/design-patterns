package com.alexshank.patterns.creational.builder.models;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneAbstractFactory;
import com.alexshank.patterns.creational.abstractFactory.models.android.AndroidFactory;

public class BuilderApp {

    /*
     * We use an Abstract Factory below to either create an AppleFactory or AndroidFactory.
     *
     * The concrete factories can then build all the components needed for a phone.
     */
    public static void main(String[] args) {
        System.out.println("Builder!");
   }
}
