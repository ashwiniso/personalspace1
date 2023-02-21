import java.util.Arrays;
import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String split = input.nextLine();
        String[] splitArgs = split.split("\\s+");
        if (splitArgs[9].equalsIgnoreCase("")) {
            System.out.println("space detected");
        }
    }
}