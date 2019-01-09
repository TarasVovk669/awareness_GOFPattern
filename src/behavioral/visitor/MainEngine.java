package behavioral.visitor;

import behavioral.visitor.engine.*;

import java.util.ArrayList;
import java.util.List;

public class MainEngine {

    public static void main(String[] args) {
        Circle circle = new Circle(1L, "Circle66", 2, 2, 10);
        Rectangle rectangle = new Rectangle(2L, "REC123", 6, 8);
        Dot dot = new Dot(55L, "BOLD_DOT", 89, 76);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(dot);
        shapes.add(dot);
        ShapeCollection collection = new ShapeCollection(32L, shapes);

        JsonVisitor jsonVisitor = new JsonVisitor();
        collection.getShapes().forEach(shape -> System.out.println(shape.accept(jsonVisitor)));

    }

}
