package structural.facade.engine;

import java.util.ArrayList;
import java.util.List;

public class Server {

    private List<File> files = new ArrayList<>();

    public void loadData(File file){
        files.add(file);
        System.out.println("load file on server: "+ file);
    }

    public List<File> getFiles() {
        return files;
    }

    public boolean hasFileOnServer(File file){
        return files.contains(file);
    }

}
