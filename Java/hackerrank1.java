import java.util.*;
import java.lang.Math;

public class hackerrank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long input = scanner.nextLong();
                System.out.println(input + " can be fitted in:");
                if (input >= -(Math.pow(2, 7)) && input <= Math.pow(2, 7) - 1) {
                    System.out.println("* byte");
                }
                if (input >= -(Math.pow(2, 15)) && input <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (input >= -(Math.pow(2, 31)) && input <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (input >= -(Math.pow(2, 63)) && input <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.nextLine() + " can't be fitted anywhere.");
            }
        }

    }

}
