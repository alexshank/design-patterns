package com.alexshank.patterns.creational.builder.modelsB;

import com.alexshank.patterns.creational.builder.modelsA.Vacation;

public class VacationExtended extends Vacation {

    public VacationExtended(String destination, double cost, String transportation) {
        super(destination, cost, transportation);
    }

    /*
     * We're extending the original Vacation class to add one method. It gives us access
     * to a builder we can use as an alternative to the constructor.
     *
     * TODO Spring does this with a Decorator somehow.
     *
     * Alternatively, we could have just added this method to the base Vacation class, but I wanted
     * to be clear that it is a nicety and not required.
     */
    public static VacationBuilderChain builder(){
        return new VacationBuilderChain();
    }
}
