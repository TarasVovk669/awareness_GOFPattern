package behavioral.memento.engine;

public class Hero {

    private String name;
    private int x;
    private int y;
    private int level;
    private double experience;

    public void set(String name, int x, int y, int level, double experience) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.level = level;
        this.experience = experience;
    }

    public void load(Memento memento) {
        name = memento.getName();
        x = memento.getX();
        y = memento.getY();
        level = memento.getLevel();
        experience = memento.getExperience();
    }

    public Memento save() {
        return new Memento(name, x, y, level, experience);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", level=" + level +
                ", experience=" + experience;

    }
}
