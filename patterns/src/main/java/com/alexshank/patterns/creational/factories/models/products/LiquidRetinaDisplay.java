package com.alexshank.patterns.creational.factories.models.products;

public class LiquidRetinaDisplay implements PhoneDisplay {
    @Override
    public String turnOffDisplay() {
        return "Turning off the liquid retina display...";
    }
}
