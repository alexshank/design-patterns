package com.alexshank.patterns.creational.abstractFactory.models.apple;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneOS;

public class iOS implements PhoneOS {
    @Override
    public String printOS() {
        return "I'm using Apple iOS!";
    }
}
