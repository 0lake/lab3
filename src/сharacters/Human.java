package сharacters;

import cosmicobjects.CosmicObject;
import interfaces.Weight;


public abstract class Human implements Weight {
    private String name;
    private double weight;
    private CosmicObject location;

    public Human(String name, double weight, CosmicObject location) {
        this.name = name;
        this.weight = weight;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }


    public void fly() {
        System.out.println(this.getName() + " полетит ");
    }


    public void jump() {
        System.out.println(this.getName() + " прыгает.");
    }

    public void notjump(CosmicObject name) {
        System.out.println(this.getName() + " не прыгает на " + name.getName());

    }

    public void grab( ) {
        System.out.println(" поминутно хвататься за голенища ");
    }

    public void tighten( ) {
        System.out.println( " и потуже натягивать их.");
    }


    public void walk() {
        System.out.println(this.getName() + " идет нормально.");
    }
    public void afraid() {

        System.out.println(this.getName() + " опасался, что выскользнет из ");
    }


    @Override
    public double getWeight() {
        return this.weight;
    }

    public double calculateGravityForce() {
        double gravityForce = this.getWeight() * Double.parseDouble(this.location.getSurfaceGravity());
        return gravityForce;
    }

    @Override
    public int hashCode() {
        return 1000 * this.name.hashCode() - 7;
    }

    @Override
    public String toString() {
        // Выводим сообщение с именем при вызове toString()
        return "Person: {" + "Person name = '" + this.getName() + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        // Простое сравнение имен для примера
        return this.name.equals(human.name);
    }

    public abstract String getName(CosmicObject att);
}
