package structural.proxy;

import structural.facade.engine.File;
import structural.facade.engine.Server;
import structural.facade.engine.UploadFacade;
import structural.proxy.downloader.MemesDownloader;
import structural.proxy.memes_media_library.MemesLibClass;
import structural.proxy.proxy.MemesCacheProxy;


public class MainEngine {

    public static void main(String[] args) {
        MemesDownloader naiveDownloader = new MemesDownloader(new MemesLibClass());
        MemesDownloader smartDownloader = new MemesDownloader(new MemesCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(MemesDownloader memesDownloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        memesDownloader.getPopularMemes();
        memesDownloader.getMemes("vaitishnik");
        memesDownloader.getPopularMemes();
        memesDownloader.getMemes("POKER_FICE");
        // Users might visit the same page quite often.
        memesDownloader.getMemes("galeraRab");
        memesDownloader.getMemes("POKER_FICE");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
