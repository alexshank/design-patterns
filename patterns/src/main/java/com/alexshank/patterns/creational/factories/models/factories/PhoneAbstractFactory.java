package com.alexshank.patterns.creational.factories.models.factories;

import com.alexshank.patterns.creational.factories.models.products.PhoneDisplay;
import com.alexshank.patterns.creational.factories.models.products.PhoneOS;

/*
 * This is our abstract factory interface. It defines all of the products that make up a family of products.
 *
 * If we want to create a Google phone, we'll need a certain family of products. If we want to create an Apple phone,
 * we'll need a different family of products.
 *
 * We're assuming an operating system and a display is always needed to make a phone.
 */
public interface PhoneAbstractFactory {
    PhoneOS createOS();
    PhoneDisplay createDisplay();
}
