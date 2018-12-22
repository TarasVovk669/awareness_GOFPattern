package structural.proxy.proxy;

import structural.proxy.memes_media_library.Memes;
import structural.proxy.memes_media_library.MemesLib;
import structural.proxy.memes_media_library.MemesLibClass;

import java.util.HashMap;
import java.util.Map;

public class MemesCacheProxy implements MemesLib {
    private MemesLib memesLib;
    private HashMap<String, Memes> cachePopular = new HashMap<>();
    private HashMap<String, Memes> cacheAll = new HashMap<>();

    public MemesCacheProxy() {
        memesLib = new MemesLibClass();
    }

    @Override
    public HashMap<String, Memes> popularMemes() {
        if (cachePopular.isEmpty()) {
            cachePopular = memesLib.popularMemes();
        } else {
            System.out.println("Get popular memes from cache");
        }
        return cachePopular;
    }

    @Override
    public Memes getMemes(String identificator) {
        Memes memes = cacheAll.get(identificator);
        if (memes == null) {
            memes = memesLib.getMemes(identificator);
            cacheAll.put(identificator, memes);
        } else {
            System.out.println("Get memes from cache " + identificator);
        }
        return memes;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
