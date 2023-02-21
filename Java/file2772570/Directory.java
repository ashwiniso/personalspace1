package file2772570;

import java.util.ArrayList;

public class Directory implements Component {
    public String dname;
    public int dsize; 
    //two main attributes of the directory object:
    //directoryList and FilesList which contain directories within the directory and the files associated with
    public static ArrayList<Directory>  directoryList = new ArrayList<>();
    public static ArrayList<File> filesList = new ArrayList<>();

    public Directory(String path){
        this.dname = path;
    }

    
    //mendatory methods to tweak the directory structure, add another directory or files to the filelist of
    //this directory
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
    //returns the size of the directory by summing all the files in the fileslist as 
    //they are the only thing that contribute to the size.
    public int getSize(){
        int totalSize = 0;
        for(int i = 0; i < Directory.filesList.size(); i++){
            totalSize += Directory.filesList.get(i).size;
    
        }
        return totalSize;
    }


    //method 3
    //this method gets the count of the elements in the directory. especially in the directory list 
    //and files list for the particular
    //directory object.
    public int getCount(){
        int count = 0;
        for(int i =0; i < filesList.size(); i++){
                count++;
        }
        return count;
    }


    //method 4
    //diplay method for when called enlists the directory and all the encapsulated directories
    //files in the directory object.
    public String display(String prefix){
        String out = dname + ": (count=" + getCount()+ ", size=" + getSize()+")" ;
        for(int i =0; i < Directory.directoryList.size(); i++){
            out +=  "\n" + prefix.repeat(i+1) + Directory.directoryList.get(i).dname + ": (count=" + getCount()+ ", size=" + + Directory.directoryList.get(i).getSize()+")";  
        }
        for(int j =0; j < Directory.filesList.size(); j++){
            out +=  "\n" + prefix.repeat(j+1) + this.filesList.get(j).name + " (" + this.filesList.get(j).FgetSize()+")";
        }
        return out;

    }


    //method 5
    //searches for the file in the directory object, especially in the filelist, and returns the corresponding
    //directory.
    public Component search (String pname){
        Directory needed = new Directory("test");
         for(Directory dir : directoryList){
            for(int i =0; i < Directory.filesList.size(); i++){
                if(filesList.get(i).name == pname){
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
