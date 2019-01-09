package behavioral.visitor.engine;

public interface Visitor {

    String visit(Circle circle);

    String visit(Rectangle rectangle);

    String visit(Dot dot);

    String visit(ShapeCollection shapeCollection);


}
