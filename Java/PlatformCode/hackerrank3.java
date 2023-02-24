package PlatformCode;

import java.util.Scanner;

//palindrome java string reverse.
public class hackerrank3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String rev = "";
        char[] str = word.toCharArray();
        for(int i = str.length-1; i >=0; i--){
            rev+= str[i];
        }
        System.out.println(rev);

        if(word.equals(rev)){
            System.out.println("Yes");
        
        }
        else{
            System.out.println("No");
        }
}
}
