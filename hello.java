import java.util.Scanner;

public class hello {
    public static void task3(int challenge) {
        Scanner input = new Scanner(System.in);
        int playerscore = 3, monsterscore = 3;
        while (true) {
            // the true condition makes the while loop run for infinite untill conditions
            // met
            int rollednumber = input.nextInt();
            if (rollednumber < challenge) {
                monsterscore += 1;
                playerscore -= 1;
                // the conditional 1
                System.out.println("player losses 1 and monster wins 1");
                if (playerscore == 0) {
                    System.out.println("oh no! monster won!!");
                    break;
                } else if (monsterscore == 0) {
                    System.out.println("Yay! player wins this game!");
                    break;
                } else if (rollednumber > challenge) {
                    // the conditional 2
                    monsterscore -= 1;
                    playerscore += 1;
                    System.out.println("player wins 1 and monster losses 1!");
                    if (playerscore == 0) {
                        System.out.println("oh no! monster won!!");
                        break;
                    } else if (monsterscore == 0) {
                        System.out.println("Yay! player wins this game!");
                        break;
                    }
                }
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        task3(7);
    }
}
