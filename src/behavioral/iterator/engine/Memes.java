package behavioral.iterator.engine;

public class Memes {
    private Long id;
    private String name;
    private Double raiting;

    public Memes(Long id, String name, Double raiting) {
        this.id = id;
        this.name = name;
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "| name: '" + name + '\'' +
                "| raiting: " + raiting;
    }
}
