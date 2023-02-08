package ApEx1;

import java.util.ArrayList;

public class Directory {
    private String name;
    private int size; 

    public Directory(String path){
        this.name = path;
    }

    ArrayList<String> directory = new ArrayList<>();
 
    public void add(File path){
        directory.add(path);

    }
    
}
