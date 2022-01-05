package com.alexshank.patterns.creational.factories.models.products;

public class iOS implements PhoneOS {
    @Override
    public String downloadUpdates() {
        return "Downloading Apple updates...";
    }
}
