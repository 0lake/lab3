package cosmicobjects;

public class Sun extends CosmicObject {
    public Sun (String name, double gravity, CosmicObjectsTypes type, double radius, double weight) {
        super(name, radius, weight, CosmicObjectsTypes.Star, gravity);
    }

    @Override
    public String getSurfaceGravity() {
        return this.getName() + " сила тяжести " + this.getGravity();
    }
}

