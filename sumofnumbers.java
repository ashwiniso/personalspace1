import java.util.Scanner;

public class sumofnumbers {
    public static int nsum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter /'n' till which you want to sum");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(nsum(n));
    }
}
