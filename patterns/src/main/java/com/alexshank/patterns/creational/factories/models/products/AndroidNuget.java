package com.alexshank.patterns.creational.factories.models.products;

public class AndroidNuget extends PhoneOS {
    @Override
    public String createVersion() {
        return "ANDROID::1::0::0";
    }
}
