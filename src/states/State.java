package states;

import interfaces.Weight;

public abstract class State implements Weight {
    private String name;
    private double weight;
    private String direction;

    public State(String name, double weight, String direction) {
        this.name = name;
        this.weight = weight;
        this.direction = direction;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public String getDirection() {
        return this.direction;
    }
}




