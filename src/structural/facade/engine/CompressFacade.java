package structural.facade.engine;

public class CompressFacade {

    public File compressFile(File file) {
        if (file.getType().equalsIgnoreCase("mp4")) {
            System.out.println("[special compress [mp4] file for upload on server]");
            file.setCompress(Compress.MP4_COMPRESS);
        } else if (file.getType().equalsIgnoreCase("mp3")) {
            System.out.println("[special compress [mp3] file for upload on server]");
            file.setCompress(Compress.MP3_COMPRESS);
        } else {
            System.out.println("[simple compress file for upload on server]");
            file.setCompress(Compress.SIMPLE_COMPRESS);
        }
        return file;
    }
}
