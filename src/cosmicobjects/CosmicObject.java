package cosmicobjects;

import сharacters.Human;
import interfaces.Gravity;
import interfaces.Weight;

public abstract class CosmicObject implements Gravity, Weight {
    private double gravity;
    private String name;
    private double radius;
    private double weight;
    private CosmicObjectsTypes type;


    public CosmicObject(String name, double radius, double weight, CosmicObjectsTypes type, double gravity) {
        this.gravity = gravity;
        this.name = name;
        this.radius = radius;
        this.weight = weight;
        this.type = type;
    }

    public void attracts(Human target, CosmicObject name) {
        System.out.println(this.name + " притягивает " + target.getName() + " слабее, чем " + name.getName() + ".");
    }

    public String getViewPoint() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getSurfaceGravity() {
        return String.valueOf(this.gravity);
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public double getRadius() {
        return this.radius;
    }

    public CosmicObjectsTypes getType() {
        return this.type;
    }

    public double getGravity() {
        return this.gravity;
    }
}
