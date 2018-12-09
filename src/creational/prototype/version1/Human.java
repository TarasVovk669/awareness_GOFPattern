package creational.prototype.version1;

public class Human implements Clonable {
    private int age;
    private String name;
    private Body body;


    public Human(int age, String name, Body body) {
        this.age = age;
        this.name = name;
        this.body = body;
    }

    @Override
    public Object copy() {
        return new Human(age, name, new Body(body.getQtyLegs(), body.getQtyHands()));
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", body=" + body +
                '}';
    }

}
