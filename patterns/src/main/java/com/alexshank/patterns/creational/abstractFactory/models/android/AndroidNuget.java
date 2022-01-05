package com.alexshank.patterns.creational.abstractFactory.models.android;

import com.alexshank.patterns.creational.abstractFactory.models.PhoneOS;

public class AndroidNuget implements PhoneOS {
    @Override
    public String printOS() {
        return "I'm using Android Nuget!";
    }
}
