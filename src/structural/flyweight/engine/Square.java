package structural.flyweight.engine;

public class Square implements Shape {
    private int side = 66;

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw square - [ x: " + x + ", y: " + y + "] with side:" + side + "]___object: " + this);
    }
}
