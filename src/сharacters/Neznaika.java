package сharacters;

import cosmicobjects.CosmicObject;

public class Neznaika extends Human {
    public Neznaika(String name, double weight, CosmicObject location) {
        super(name, weight, location);
    }

    @Override
    public String getName(CosmicObject att) {
        return null;
    }
    @Override
    public void fly() {
        System.out.println(this.getName() + " полетит ");
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + " прыгает.");
    }

    @Override
    public void notjump(CosmicObject name) {
        System.out.println(this.getName() + " не прыгает на " + name.getName());
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " идет нормально.");
    }

}
