package behavioral.visitor.engine;

public interface Shape {

    String accept(Visitor visitor);
}
