package com.alexshank.patterns.creational.builder.modelsA;

public class VacationBuilder {
    private String destination = null;
    private double cost = 0.0;
    private String transportation = null;

    public void buildDestination(String destination) {
        this.destination = destination;
    }

    public void buildCost(double cost) {
        // the builder could do complex things here, maybe a cost calculation
        // or a call to a microservice rather than a direct variable assignment
        this.cost = cost;
    }

    public void buildTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Vacation getVacation() {
        return new Vacation(this.destination, this.cost, this.transportation);
    }
}
