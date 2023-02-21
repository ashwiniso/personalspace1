import java.io.IOException;
import java.util.Scanner;

/**
 * The Main class implements an application that reads lines from the standard
 * input
 * and prints them to the standard output.
 */
public class morsetoenglish {
    /**
     * Iterate through each line of input.
     */

    public static void main(String[] args) {
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                " ", ".---", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };

        String alphabet[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0" };
        Scanner input = new Scanner(System.in);
        String l = input.nextLine();
        String[] words = l.split("  ");
        for (int k = 0; k < words.length; k++) {
            String[] morsechars = words[k].split(" ");
            for (int i = 0; i < morsechars.length; i++) {
                for (int j = 0; j < morse.length; j++) {
                    if (morsechars[i].equalsIgnoreCase(morse[j])) {
                        System.out.print(alphabet[j]);
                    }
                }

            }
            System.out.print(" ");
        }
    }
}
