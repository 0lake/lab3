import interfaces.Weight;

public class Boots implements Weight {

    private String ownername;
    private double weight;
    private String material;
    private String sosmaterial;
    public Boots(String ownername, double weight, String material, String sosmaterial) {
        this.ownername = ownername;
        this.weight = weight;
        this.material = material;
        this.sosmaterial = sosmaterial;
    }


    public String getOwnername() {
        return this.ownername;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public String getMaterial() {
        return this.material;
    }
    public String getSosmaterial() {
        return this.sosmaterial;
    }
    public void stay( ) {
        System.out.println( " остануться на ");
    }
}

