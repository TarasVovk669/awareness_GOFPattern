package behavioral.visitor.engine;

public class Circle implements Shape {
    private Long id;
    private String name;
    private int x;
    private int y;
    private double radius;

    public Circle(Long id, String name, int x, int y, double radius) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
