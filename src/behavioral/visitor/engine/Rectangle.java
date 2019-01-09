package behavioral.visitor.engine;

public class Rectangle implements Shape {
    private Long id;
    private String name;
    private int sideA;
    private int sideB;

    public Rectangle(Long id, String name, int sideA, int sideB) {
        this.id = id;
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
