package ADTS;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;

public class stack {
    public static void main(String[] args){

        //stack
        Stack<String> stackone = new Stack<>();
        System.out.println(stackone.empty());
        stackone.push("jesse");
        stackone.push("mike");
        stackone.push("walter");
        stackone.push("skyler");
        System.out.println(stackone);












//other linear data structures in java, for comparaion purposes

        //arraylist
        ArrayList<String> arraylistone = new ArrayList<>();
        arraylistone.add("orange");
        System.out.println(arraylistone);



        //arrays
        String[] arrayone  = {"orange"};
        System.out.println(Arrays.toString(arrayone));






    }
    
}
