package behavioral.visitor.engine;

import java.util.List;

public class ShapeCollection implements Shape {
    private Long id;
    private List<Shape> shapes;

    public ShapeCollection(Long id, List<Shape> shapes) {
        this.id = id;
        this.shapes = shapes;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Long getId() {
        return id;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
