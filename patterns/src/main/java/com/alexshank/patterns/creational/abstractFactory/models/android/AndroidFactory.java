package com.alexshank.patterns.creational.abstractFactory.models.android;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneOS;
import com.alexshank.patterns.creational.abstractFactory.models.PhoneAbstractFactory;
import com.alexshank.patterns.creational.abstractFactory.models.PhoneScreen;

public class AndroidFactory implements PhoneAbstractFactory {

    @Override
    public PhoneScreen buildPhoneScreen() {
        return new FoldingScreen();
    }

    @Override
    public PhoneOS buildOperatingSystem() {
        return new AndroidNuget();
    }
}
