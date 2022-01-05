package com.alexshank.patterns.creational.abstractFactory.models.apple;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneOS;
import com.alexshank.patterns.creational.abstractFactory.models.PhoneAbstractFactory;
import com.alexshank.patterns.creational.abstractFactory.models.PhoneScreen;

public class AppleFactory implements PhoneAbstractFactory {

    @Override
    public PhoneScreen buildPhoneScreen() {
        return new LiquidRetina();
    }

    @Override
    public PhoneOS buildOperatingSystem() {
        return new iOS();
    }
}
