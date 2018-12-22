package structural.proxy.memes_media_library;

public class Memes {
    private String identification;
    private String name;

    public Memes(String identification, String name) {
        this.identification = identification;
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
