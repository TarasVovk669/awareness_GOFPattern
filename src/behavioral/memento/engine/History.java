package behavioral.memento.engine;

import java.util.ArrayList;
import java.util.List;

public class History {
    private Hero hero;
    private List<Memento> saves = new ArrayList<>();

    public Memento getLastSave() {
        return saves.get(saves.size() - 1);
    }

    public void save(Memento memento) {
        saves.add(memento);
    }

}
