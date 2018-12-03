package creational.builder.builders;

import creational.builder.house.Barrack;
import creational.builder.house.Material;

public class BarrackBuilder implements AbstractBuilder {

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

    public Barrack getBarrack(){
        return new Barrack(name,numberOfDoors,numberOfWindows,material);

    }
}
