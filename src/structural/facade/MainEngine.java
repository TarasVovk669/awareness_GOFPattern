package structural.facade;

import structural.facade.engine.File;
import structural.facade.engine.Server;
import structural.facade.engine.UploadFacade;


public class MainEngine {

    public static void main(String[] args) {
        UploadFacade uploadFacade = new UploadFacade(new Server());

        uploadFacade.uploadFileOnServer(new File("wordFile","txt"),true);
        uploadFacade.uploadFileOnServer(new File("Graf_Vaitishnik","mp4"),true);
        uploadFacade.uploadFileOnServer(new File("time to burn","mp3"),true);
        uploadFacade.uploadFileOnServer(new File("time to burn","mp3"),false);
        System.out.println(uploadFacade.getServer().getFiles());
    }
}
