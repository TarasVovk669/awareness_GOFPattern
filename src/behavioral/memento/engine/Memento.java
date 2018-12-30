package behavioral.memento.engine;

public class Memento {
    private final String name;
    private final int x;
    private final int y;
    private final int level;
    private final double experience;

    public Memento(String name, int x, int y, int level, double experience) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.level = level;
        this.experience = experience;
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

    public int getLevel() {
        return level;
    }

    public double getExperience() {
        return experience;
    }
}

