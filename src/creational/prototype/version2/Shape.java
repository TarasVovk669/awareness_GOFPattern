package creational.prototype.version2;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    Shape() {
    }

    Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = color;
        }
    }

    public abstract Shape copy();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(color, shape.color);
    }
}
