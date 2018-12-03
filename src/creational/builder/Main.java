package creational.builder;

import creational.builder.builders.BarrackBuilder;
import creational.builder.builders.VenetianHouseBuilder;
import creational.builder.house.Barrack;
import creational.builder.house.VenetianHouse;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        BarrackBuilder barrackBuilder = new BarrackBuilder();
        director.buildBarrack(barrackBuilder);
        Barrack barrack = barrackBuilder.getBarrack();
        System.out.println(barrack);

        VenetianHouseBuilder venetianHouseBuilder = new VenetianHouseBuilder();
        director.buildVenetialHouse(venetianHouseBuilder);
        VenetianHouse venetianHouse = venetianHouseBuilder.getHouse();
        System.out.println(venetianHouse);
    }
}
