package behavioral.iterator;

import behavioral.iterator.engine.BestMemesCollection;
import behavioral.iterator.engine.Iterator;
import behavioral.iterator.engine.Memes;

import java.util.ArrayList;
import java.util.List;

public class MainEngine {

    public static void main(String[] args) {
        BestMemesCollection memesCollection = new BestMemesCollection(getMemes());
        Iterator iterator = memesCollection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static List<Memes> getMemes() {
        List<Memes> memes = new ArrayList<>();
        memes.add(new Memes(69L, "Memesu pro deda", 8.8));
        memes.add(new Memes(666L, "VAITISHNIK NA SUROVARNE", 5.1));
        memes.add(new Memes(5L, "KOTIKI", 7.9));
        memes.add(new Memes(8L, "SOBACHKI", 10.0));
        memes.add(new Memes(4L, "DEVELOPER MEMES", 1.1));
        memes.add(new Memes(98L, "JAVKA-AVKA", 8.2));
        memes.add(new Memes(12L, "PRANKI OT BATI", 10.0));
        memes.add(new Memes(43L, "4CHAN MEMES", 9.9));
        return memes;
    }
}
