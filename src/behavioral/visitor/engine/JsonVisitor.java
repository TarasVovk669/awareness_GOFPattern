package behavioral.visitor.engine;

public class JsonVisitor implements Visitor {
    @Override
    public String visit(Circle circle) {
        return "Circle: {" + ",\n" +
                "     id: " + circle.getId() + ",\n" +
                "     name: " + circle.getName() + ",\n" +
                "     x: " + circle.getX() + ",\n" +
                "     y: " + circle.getY() + ",\n" +
                "     radius: " + circle.getRadius() + "\n" +
                "}";
    }

    @Override
    public String visit(Rectangle rectangle) {
        return "Rectangle: {" + ",\n" +
                "     id: " + rectangle.getId() + ",\n" +
                "     name: " + rectangle.getName() + ",\n" +
                "     a: " + rectangle.getSideA() + ",\n" +
                "     b: " + rectangle.getSideB() + "\n" +
                "}";
    }

    @Override
    public String visit(Dot dot) {
        return "Dot: {" + ",\n" +
                "     id: " + dot.getId() + ",\n" +
                "     name: " + dot.getName() + ",\n" +
                "     x: " + dot.getX() + ",\n" +
                "     y: " + dot.getY() + "\n" +
                "}";
    }

    @Override
    public String visit(ShapeCollection shapeCollection) {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapeCollection.getShapes()) {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            sb.append(obj);
        }
        return sb.toString();

    }
}
