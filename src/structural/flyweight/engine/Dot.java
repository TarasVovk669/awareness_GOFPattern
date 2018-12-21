package structural.flyweight.engine;

public class Dot implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw dot - [ x: " + x + ", y: " + y + "]"+ "]___object: "+ this);
    }
}
