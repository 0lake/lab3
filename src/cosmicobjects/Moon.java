package cosmicobjects;

public class Moon extends CosmicObject {
    public Moon(String name, double gravity, CosmicObjectsTypes type, double radius, double weight) {
        super(name, radius, weight, CosmicObjectsTypes.Sputnic, gravity);
    }

    @Override
    public String getSurfaceGravity() {
        return this.getName() + " сила тяжести " + this.getGravity();
    }
}
