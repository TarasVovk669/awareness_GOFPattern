package structural.proxy.memes_media_library;

import java.util.HashMap;

public interface MemesLib {
    HashMap<String, Memes> popularMemes();

    Memes getMemes(String identificator);
}
