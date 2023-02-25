package PlatformCode;
import java.util.*;
//string split
public class hackerrank5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        scan.close();

        String[] words = str.split("[ !,?._'@]+");
        System.out.println(words.length);
        for(String s: words){
            System.out.println(s);
        }
}
}
