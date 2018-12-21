package structural.flyweight;

import structural.flyweight.engine.Shape;
import structural.flyweight.engine.ShapeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainEngine {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Random random = new Random();
        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("Dot"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Dot"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Dot"));
        shapes.add(shapeFactory.getShape("Dot"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Circle"));

        shapes
                .parallelStream()
                .forEachOrdered(shape -> {
                    int x = random.nextInt(60);
                    int y = random.nextInt(80);
                    shape.draw(x, y);
                });
    }
}
