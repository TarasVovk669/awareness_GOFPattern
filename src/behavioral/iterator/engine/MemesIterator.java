package behavioral.iterator.engine;

import java.util.List;

public class MemesIterator implements Iterator {
    private List<Memes> memes;
    private int index = 0;

    public MemesIterator(List<Memes> memes) {
        this.memes = memes;
    }

    @Override
    public boolean hasNext() {
        return index < memes.size();
    }

    @Override
    public Memes next() {
        return memes.get(index++);
    }
}
