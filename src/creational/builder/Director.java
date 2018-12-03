package creational.builder;

import creational.builder.builders.AbstractBuilder;
import creational.builder.house.Material;

public class Director {

    public void buildVenetialHouse(AbstractBuilder abstractBuilder){
        abstractBuilder.createName("House of King");
        abstractBuilder.createNumberOfDoors(100);
        abstractBuilder.createNumberOfWindows(32);
        abstractBuilder.createMaterial(Material.STONE);
    }

    public void buildBarrack(AbstractBuilder abstractBuilder){
        abstractBuilder.createName("House of soldiers");
        abstractBuilder.createNumberOfDoors(1);
        abstractBuilder.createNumberOfWindows(5);
        abstractBuilder.createMaterial(Material.WOOD);
    }
}
