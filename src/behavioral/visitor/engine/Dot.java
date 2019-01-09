package behavioral.visitor.engine;

public class Dot implements Shape {
    private Long id;
    private String name;
    private int x;
    private int y;

    public Dot(Long id, String name, int x, int y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
