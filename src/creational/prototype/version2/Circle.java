package creational.prototype.version2;

public class Circle extends Shape {
    private int radius;

    Circle(){}

    Circle(Circle target){
        super(target);
        if(target !=null){
            this.radius = target.radius;
        }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }
}
