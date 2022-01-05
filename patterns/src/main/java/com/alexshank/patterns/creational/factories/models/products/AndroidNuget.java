package com.alexshank.patterns.creational.factories.models.products;

public class AndroidNuget implements PhoneOS {
    @Override
    public String downloadUpdates() {
        return "Downloading Android updates...";
    }
}
