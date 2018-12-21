package structural.flyweight.engine;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> shapeCashe = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapeCashe.get(shapeName);

        if (shape == null) {
            switch (shapeName) {
                case "Dot":
                    shape = new Dot();
                    break;
                case "Circle":
                    shape = new Circle();
                    break;
                case "Square":
                    shape = new Square();
                    break;
                default:
                    return null;

            }
            shapeCashe.put(shapeName, shape);
        }
        return shape;
    }
}
