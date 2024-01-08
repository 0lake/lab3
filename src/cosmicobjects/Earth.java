package cosmicobjects;

public class Earth extends CosmicObject {
    public Earth(String name, double gravity, CosmicObjectsTypes type, double radius, double weight) {
        super(name, radius, weight, CosmicObjectsTypes.Planet, gravity);
    }

    @Override
    public String getSurfaceGravity() {
        return this.getName() + " сила тяжести " + this.getGravity();
    }
}
