package creational.prototype.version1;

public class HumanFactory {
    private Human human;

    HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy() {
        return (Human) human.copy();
    }
}
