package creational.builder.house;

public class VenetianHouse {

    private String name;
    private int NumberOfDoors;
    private int NumberOfWindows;
    private Material material;

    public VenetianHouse(String name, int numberOfDoors, int numberOfWindows, Material material) {
        this.name = name;
        NumberOfDoors = numberOfDoors;
        NumberOfWindows = numberOfWindows;
        this.material = material;
    }

    @Override
    public String toString() {
        return "VenetianHouse{" +
                "name='" + name + '\'' +
                ", NumberOfDoors=" + NumberOfDoors +
                ", NumberOfWindows=" + NumberOfWindows +
                ", material=" + material +
                '}';
    }
}
