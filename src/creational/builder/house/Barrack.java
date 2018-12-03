package creational.builder.house;

public class Barrack {

    private String name;
    private int NumberOfDoors;
    private int NumberOfWindows;
    private Material material;
    private int personCapacity = 69;

    public Barrack(String name, int numberOfDoors, int numberOfWindows, Material material) {
        this.name = name;
        NumberOfDoors = numberOfDoors;
        NumberOfWindows = numberOfWindows;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Barrack{" +
                "name='" + name + '\'' +
                ", NumberOfDoors=" + NumberOfDoors +
                ", NumberOfWindows=" + NumberOfWindows +
                ", material=" + material +
                ", personCapacity=" + personCapacity +
                '}';
    }
}
