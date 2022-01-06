package com.alexshank.patterns.creational.builder.models;

/*
 * When you need to build a complex object, you can do it incrementally in this class.
 *
 * Once it is sufficiently built up, you can ask for it with getVacation()
 */
public class EuropeanVacationBuilder implements VacationBuilder {

    private String destination = null;
    private double cost = 0.0;
    private String transportation = null;

    @Override
    public void buildDestination(String destination) {
       this.destination = destination;
    }

    @Override
    public void buildCost(double cost) {
        // the builder could do complex things here, maybe a cost calculation
        // or a call to a microservice rather than a direct variable assignment
        this.cost = cost;
    }

    @Override
    public void buildTransportation(String transportation) {
        this.transportation = transportation;
    }

    @Override
    public Vacation getVacation() {
        return new Vacation(this.destination, this.cost, this.transportation);
    }
}
