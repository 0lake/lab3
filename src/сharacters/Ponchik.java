package сharacters;

import cosmicobjects.CosmicObject;

public class Ponchik extends Human {
    public Ponchik(String name, double weight, CosmicObject location) {
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
    public void notjump(CosmicObject name) {
        System.out.println(this.getName() + " не прыгает на " + name.getName());
    }

    @Override
    public void jump() {
        System.out.println(this.getName() + " прыгает.");
    }

    @Override
    public void walk() {

        System.out.println(this.getName() + " идет нормально.");
    }
    @Override
    public void tighten( ) {
        System.out.println( " и потуже натягивать их.");
    }
    @Override
    public void grab( ) {
        System.out.println(" поминутно хвататься за голенища ");
    }
    @Override
    public void afraid() {

        System.out.println(this.getName() + " опасался, что выскользнет из ");
    }

}
