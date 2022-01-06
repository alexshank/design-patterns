package com.alexshank.patterns.creational.builder.models;

public interface VacationBuilder {
    void buildDestination(String destination);
    void buildCost(double cost);
    void buildTransportation(String transportation);
    Vacation getVacation();
}
