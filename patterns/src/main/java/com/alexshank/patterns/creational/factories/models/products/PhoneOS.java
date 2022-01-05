package com.alexshank.patterns.creational.factories.models.products;

/*
 * Our concrete factories will construct products that adhere to a common interface. This way, our client can
 * use the products without knowing their implementation details.
 */
public interface PhoneOS {
    String downloadUpdates();
}
