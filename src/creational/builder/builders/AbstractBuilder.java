package creational.builder.builders;

import creational.builder.house.Material;

public interface AbstractBuilder {

     void createName(String name);
     void createNumberOfDoors(int qty);
     void createNumberOfWindows(int qty);
     void createMaterial(Material material);
}
