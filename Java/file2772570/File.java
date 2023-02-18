package file2772570;

public class File {
    public String name;
    public int size; 

    //takes in the name of the file and size.
    public File(String path, int size){
        this.name = path;
        this.size = size;
    }

    //method 1
    //returns name of the file
    public String FgetName(){
        return name;
    }
    
    //method 2
    //returns size of the file
    public int FgetSize(){
        return this.size;
      
    }

}

