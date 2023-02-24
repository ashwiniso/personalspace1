package PlatformCode;
import java.util.Scanner;
import java.util.Arrays;
//anagrams
//sorting string
public class hackerrank4  {

    public static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = true;
        char[] arr = a.toLowerCase().toCharArray();
        char[] barr = b.toLowerCase().toCharArray();
        Arrays.sort(arr);
        String sorteda =  new String(arr);
        Arrays.sort(barr);
        String sortedb  = new String(barr);
        System.out.println(sorteda);
        System.out.println(sortedb);
    if(a.length() == b.length()){
        for(int i =0; i < a.length(); i++){
            if(sorteda.charAt(i)!=sortedb.charAt(i)){
                anagram = false;
                break;
            }
    }
    }
    else{
        anagram = false;
    }
    return anagram;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
    
