package ApEx1;

public class File {
    public String name;
    public int size; 

    public File(String path, int size){
        this.name = path;
        this.size = size;
    }


    
    public void add(File name){
        Directory.filesList.add(name);
    }

    public void remove(File name){
        Directory.filesList.remove(name);
    }



    //implemented methods
    //method 1
    public String FgetName(){
        return name;
    }
    
    //method 2
    public int FgetSize(){
        return this.size;
      
    }


    //method 3
    public int FgetCount(){
        int count = 0;
        for(int i =0; i < Directory.filesList.size(); i++){
                count++;
        }
        return count;
    }

}

