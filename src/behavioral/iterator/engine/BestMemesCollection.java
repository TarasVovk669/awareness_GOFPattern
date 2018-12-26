package behavioral.iterator.engine;

import java.util.List;

public class BestMemesCollection implements Iterable {
    List<Memes> bestMemes;

    public BestMemesCollection(List<Memes> bestMemes) {
        this.bestMemes = bestMemes;
    }

    @Override
    public Iterator getIterator() {
        return new MemesIterator(bestMemes);
    }
}
