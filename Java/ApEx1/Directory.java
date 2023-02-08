package ApEx1;

import java.util.ArrayList;

public class Directory implements Component {
    public String dname;
    public int dsize; 
    public static ArrayList<Directory>  directoryList = new ArrayList<>();
    public static ArrayList<File> filesList = new ArrayList<>();

    public Directory(String path){
        this.dname = path;
    }

    
    
    public void add(Directory dir){
        directoryList.add(dir);
    }
    
    public void add(File name){
        filesList.add(name);
    }

    public static void remove(Directory dir){
        directoryList.remove(dir);
    }

    public void remove(File file){
       filesList.remove(file);
    }



    //implemented methods
    //method 1
    public String getName(){
        return dname;
    }
    
    //method 2
    public int getSize(){
        int totalSize = 0;
        for(int i = 0; i < Directory.filesList.size(); i++){
            totalSize += Directory.filesList.get(i).size;
    
        }
        return totalSize;
    }


    //method 3
    public int getCount(){
        int count = 0;
        for(int i =0; i < filesList.size(); i++){
                count++;
        }
        return count;
    }


    //method 4
    public String display(String prefix){
        String out = this.dname + ": (count=" + getCount()+ " size=" + getSize()+")" ;
        for(int i =0; i < directoryList.size(); i++){
            for(int j =0; j < Directory.filesList.size(); j++){
                out +=  "\n" + prefix.repeat(i+1) + Directory.filesList.get(j).name + " (" + Directory.filesList.get(j).FgetSize()+")";
            }
            out +=  "\n" + prefix.repeat(i) + Directory.directoryList.get(i).dname + " (" + Directory.directoryList.get(i).getSize()+")";
        }
        return out;

    }


    //method 5
    public Component search (String name){
        Directory needed = new Directory("test");
         for(Directory dir : directoryList){
            for(int i =0; i < Directory.filesList.size(); i++){
                if(filesList.get(i).name == name){
                needed.dname  = dir.dname;
                break;
                }
                else{
                    needed.dname = null;
                }
            }
            
        }
        return needed;
    
    }
    
   

 
   

 



}
