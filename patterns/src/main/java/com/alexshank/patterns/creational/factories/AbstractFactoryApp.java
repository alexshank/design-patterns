package com.alexshank.patterns.creational.factories;

import com.alexshank.patterns.creational.factories.models.factories.AppleFactory;
import com.alexshank.patterns.creational.factories.models.factories.PhoneAbstractFactory;
import com.alexshank.patterns.creational.factories.models.Phones.MobilePhone;
import com.alexshank.patterns.creational.factories.models.factories.AndroidFactory;

public class AbstractFactoryApp {

    /*
     * We use an Abstract Factory below to create the family of products needed to build a MobilePhone.
     *
     * Within the implementations of a the abstract factory, we use factories (not abstract) to get each needed product
     * that makes up the family of products.
     */
    public static void main(String[] args) {

        // We can decide what family of products we want to create at runtime or with a config value
//        PhoneAbstractFactory phoneAbstractFactory = new AndroidFactory();
        PhoneAbstractFactory phoneAbstractFactory = new AppleFactory();

        // We can then use the family of products together to do things (like create a more complex object)
        MobilePhone mobilePhone = new MobilePhone(
                phoneAbstractFactory.createOS(),
                phoneAbstractFactory.createDisplay()
        );

        // The behavior of our final mobile phone changes based on the family of products we built it with
        mobilePhone.updatePhone();
    }
}
