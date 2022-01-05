package com.alexshank.patterns.creational.abstractFactory.models;

public interface PhoneAbstractFactory {
    PhoneScreen buildPhoneScreen();
    PhoneOS buildOperatingSystem();
}
