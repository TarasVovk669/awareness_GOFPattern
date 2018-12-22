package structural.proxy.downloader;

import structural.proxy.memes_media_library.Memes;
import structural.proxy.memes_media_library.MemesLib;

import java.util.HashMap;

public class MemesDownloader {
private MemesLib memesLib;

    public MemesDownloader(MemesLib memesLib) {
        this.memesLib = memesLib;
    }

    public void getMemes(String identificator) {
        Memes memes = memesLib.getMemes(identificator);
        System.out.println("\n-------------------------------");
        System.out.println("Memes page (imagine fancy HTML)");
        System.out.println("identificator: " + memes.getIdentification());
        System.out.println("name: " + memes.getName());
        System.out.println("-------------------------------\n");
    }

    public void getPopularMemes() {
        HashMap<String, Memes> list = memesLib.popularMemes();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular memes on MEMES.COM (imagine fancy HTML)");
        for (Memes memes : list.values()) {
            System.out.println("identificator: " + memes.getIdentification() + " / Name: " + memes.getName());
        }
        System.out.println("-------------------------------\n");
    }
}
