package com.alexshank.patterns.creational.factories.models.factories;

import com.alexshank.patterns.creational.factories.models.products.PhoneOS;
import com.alexshank.patterns.creational.factories.models.products.PhoneDisplay;

/*
 * This is one of the concrete implementations of our abstract factory
 */
public class AppleFactory implements PhoneAbstractFactory {
    @Override
    public PhoneOS createOS() {
        return PhoneOSFactory.createAppleOS();
    }

    @Override
    public PhoneDisplay createDisplay() {
        return PhoneDisplayFactory.createAppleDisplay();
    }
}
