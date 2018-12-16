package structural.composite.engine;

import structural.composite.engine.items.Item;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Item {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public Double getPrice() {
        return items.parallelStream()
                .map(Item::getPrice)
                .reduce(0.0, Double::sum);
    }


}
