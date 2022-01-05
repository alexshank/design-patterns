package com.alexshank.patterns;

public class DesignPattern {

    private String name;
    private DesignPatternType type;

    public DesignPattern(String name, DesignPatternType designPatternType){
        this.name = name;
        this.type = designPatternType;
    }

    public String getName() {
        return name;
    }

    public DesignPatternType getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.type + " - " + this.name;
    }
}
