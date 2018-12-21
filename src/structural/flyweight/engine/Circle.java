package structural.flyweight.engine;

public class Circle implements Shape {
    private int radius = 69;

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw circle - [ x: " + x + ", y: " + y + "] with radius:" + radius+ "___object: "+ this);
    }
}
