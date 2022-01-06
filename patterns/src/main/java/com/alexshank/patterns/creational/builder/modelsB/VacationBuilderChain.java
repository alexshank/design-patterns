package com.alexshank.patterns.creational.builder.modelsB;

import com.alexshank.patterns.creational.builder.modelsA.Vacation;

public class VacationBuilderChain {

    private String destination = null;
    private double cost = 0.0;
    private String transportation = null;

    public VacationBuilderChain buildDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public VacationBuilderChain buildCost(double cost) {
        this.cost = cost;
        return this;
    }

    public VacationBuilderChain buildTransportation(String transportation) {
        this.transportation = transportation;
        return this;
    }

    public Vacation getVacation() {
        return new Vacation(this.destination, this.cost, this.transportation);
    }
}
