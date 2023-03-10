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
        stackone.push("saul");
        stackone.push("skyler");
        System.out.println(stackone); 

        //object returned by poping the stack

        String top_object = stackone.pop();
        System.out.println(top_object);
        System.out.println(stackone);
        //however to get this from the stack, it removes the object from the stack
        //so we can use the stack.peek() method which doesnt remove the object
        System.out.println(stackone.peek());
        System.out.println(stackone);

        //the search method helps find the object argument in the stack
        //returns the index of the object in the stack note: indexing starts from the top initial position 1.
        //returns -1 if not found
        System.out.println(stackone.search("mike"));














//other linear data structures in java, for comparaion purposes

        //arraylist
        System.out.println("\narraylist");
        ArrayList<String> arraylistone = new ArrayList<>();
        arraylistone.add("orange");
        System.out.println(arraylistone);



        //arrays
        System.out.println("\narrays");
        String[] arrayone  = {"orange"};
        System.out.println(Arrays.toString(arrayone));






    }
    
}
