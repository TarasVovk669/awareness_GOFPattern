package structural.proxy.memes_media_library;

import java.util.HashMap;

public class MemesLibClass implements MemesLib {
    @Override
    public HashMap<String, Memes> popularMemes() {
        connectToServer("http://www.memes.com");
        return getRandomMemes();
    }

    @Override
    public Memes getMemes(String identificator) {
        connectToServer("http://www.memes.com/" + identificator);
        return getSomeMemes(identificator);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Memes> getRandomMemes() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Memes> memesMap = new HashMap<>();
        memesMap.put("vaitishnik", new Memes("vaitishnik", "vaitishnik_XXX.memes"));
        memesMap.put("galeraRab", new Memes("galeraRab", "rab delayet dedlajnu.memes"));
        memesMap.put("dogggy", new Memes("dogggy", "Dancing video.memes"));
        memesMap.put("MEEGUSTA", new Memes("MEEGUSTA", "BOYAN.memes"));
        memesMap.put("POKER_FICE", new Memes("POKER_FICE", "MINUS_INTELECT.memes"));

        System.out.print("Done!" + "\n");
        return memesMap;
    }

    private Memes getSomeMemes(String memesIdentificator) {
        System.out.print("Downloading memes... ");

        experienceNetworkLatency();
        Memes memes = new Memes(memesIdentificator, "Some memes name");
        System.out.print("Done!" + "\n");
        return memes;
    }

}
