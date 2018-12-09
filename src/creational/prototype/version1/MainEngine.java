package creational.prototype.version1;

public class MainEngine {

    public static void main(String[] args) {
        Human human = new Human(22, "Ivan", new Body(2,2));
        System.out.println(human);

        Human humanCopy = (Human) human.copy();
        System.out.println(humanCopy);
        System.out.println(human == humanCopy);

        HumanFactory factory = new HumanFactory(human);
        System.out.println(factory.makeCopy());

        Human humanV = new Human(60,"Stepan", new Body(1,1));

        factory.setPrototype(humanV);
        System.out.println(factory.makeCopy());
    }
}
