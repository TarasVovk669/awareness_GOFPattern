package structural.facade.engine;

public class UploadFacade {
    private CompressFacade compressFacade;
    private Server server;
    public UploadFacade(Server server){
        System.out.println("[initialize server...]");
        this.server = server;
    }

    public void uploadFileOnServer(File file, boolean isCompressFile){
        if (isCompressFile){
            System.out.println("[initialize compress facade...]");
            compressFacade = new CompressFacade();
            compressFacade.compressFile(file);
        }
        System.out.println("[upload file on server...]");
        server.loadData(file);
    }

    public Server getServer() {
        return server;
    }
}
