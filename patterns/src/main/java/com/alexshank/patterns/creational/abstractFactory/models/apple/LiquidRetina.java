package com.alexshank.patterns.creational.abstractFactory.models.apple;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneScreen;

public class LiquidRetina implements PhoneScreen {
    @Override
    public String printScreen() {
        return "I'm looking at a liquid retina display!";
    }
}
