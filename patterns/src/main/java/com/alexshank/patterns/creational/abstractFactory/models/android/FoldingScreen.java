package com.alexshank.patterns.creational.abstractFactory.models.android;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneScreen;

public class FoldingScreen implements PhoneScreen {

    @Override
    public String printScreen() {
        return "I'm looking at a folding screen!";
    }
}
