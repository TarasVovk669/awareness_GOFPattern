package creational.builder.builders;

import creational.builder.house.Material;
import creational.builder.house.VenetianHouse;

public class VenetianHouseBuilder implements AbstractBuilder{

    private String name;
    private int numberOfDoors;
    private int numberOfWindows;
    private Material material;

    @Override
    public void createName(String name) {
        this.name=name;
    }

    @Override
    public void createNumberOfDoors(int qty) {
        this.numberOfDoors=qty;
    }

    @Override
    public void createNumberOfWindows(int qty) {
        this.numberOfWindows=qty;
    }

    @Override
    public void createMaterial(Material material) {
        this.material = material;
    }

    public VenetianHouse getHouse(){
        return new VenetianHouse(name,numberOfDoors,numberOfWindows,material);
    }
}
