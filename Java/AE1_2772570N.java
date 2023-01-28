/* 
    Instructions - Assessed Exercise 1
    - This exercise tests the things you've learnt in the first week of the semester.
    - Add your code to this file, leaving the main method unchanged except to call your methods.
    - Add all of your methods *below* the main method, in question order.
    - Each of the tasks involves writing a single method. You do not need to add additional main methods.
    - The total number of marks is 22.
    - Read the instructions for each task *carefully*.
    - Submit a single .java file on moodle by the deadline (details on moodle).
    - Your java file must be called AE1_<yourguid>.java
    - You do not need to add any additional import lines.
    - Everything you need to do these tasks is covered in the week 1 lectures and slides.
    - You do not need to perform error checking unless explicitly requested in the task.
*/

/*
    Non task-specific marks:
     - Add a comment with your name and GUID here - [1 mark]
     - Clear code commenting [1 mark]
     - Use of correct Java variable and method naming conventions [1 mark]
*/

import java.util.Scanner;

public class AE1_2772570N {

	public static void main(String[] args) {

		/*
		 * EXAMPLE TASK:
		 * 
		 * This code here demonstrates how you should answer the questions. You will be
		 * asked to create code to perform certain tasks. It is important that you leave
		 * this main method unmodified, except for where you need to call the methods
		 * that you create.
		 * 
		 * So, if I asked you to create a method called helloWorld that will print the
		 * following line: 'hello world!' you should do the following: create the method
		 * body below the main method as shown, and call it from main as below.
		 */

		helloWorld();

		/*
		 * Now, please make a start on the following tasks below:
		 * Reminder, you are supposed to work on this assessment on your own, to test
		 * your
		 * own understanding and to strengthen your problem solving skills.
		 */

		/*
		 * TASK 1: (2 marks)
		 * 
		 * Create a method called 'task1' to calculate the area of a rectangle and call
		 * it from main
		 * here. The method will not specify any input parameters. Within the method,
		 * use a scanner to
		 * capture user input. The user should be prompted for both the length and width
		 * of the rectangle.
		 * 
		 * Note that the length and width of the rectangle can be specified to 2 decimal
		 * places.
		 * Once entered, calculate the area and print it to the screen.
		 * 
		 * 
		 */

		/*
		 * TASK 2: (3 marks)
		 * 
		 * Create a method called 'task2' that will take two integer input parameters,
		 * max and number. The
		 * method should print out the total number of values (not the values
		 * themselves)
		 * between 1 and max (inclusive) that satisfy the following conditions:
		 * 
		 * The value must be odd, and the value must be a factor of number.
		 * 
		 * Your main method must pass in max = 99. For example, if I passed in
		 * the parameters task2(99, 39) the output should be 4.
		 */

		/*
		 * TASK 3: (3 marks)
		 * 
		 * Create a method called 'task3' that will take an int parameter and assign it
		 * to the variable
		 * 'challenge'. This method will play out a table top game at the console. The
		 * idea is that players roll a 20-sided dice and indicate what they got in the
		 * terminal.
		 * 
		 * You are not being asked to program the dice roll, you can assume
		 * the user will simply input a number between 1 and 20.
		 * 
		 * The game plays out over a series of rounds. On each round, the player should
		 * be prompted for input specifying what they rolled. If the player rolls higher
		 * than the challenge, then they are successful in attacking the monster, and
		 * the monster will lose 1 hit point. If the player rolls less than or the value
		 * of challenge, they are not successful.
		 * 
		 * If the player is not successful, the monster will attack. When the player
		 * fails for the first time the monster will miss and the player will not lose a
		 * hit point. However, on the second failed attempt onwards, the monster will
		 * always be successful and the player will lose a hit point.
		 * 
		 * The game continues until either the player or the monster lose all their hit
		 * points. Both the player and the monster should start with 3 hit points.
		 * 
		 * You must use a while loop in this code. The input parameter (challenge)
		 * should
		 * be set to 10.
		 */

		/*
		 * TASK 4: (6 marks)
		 * 
		 * Create a method 'task4' that will take an integer as an input parameter. This
		 * value will
		 * be used in a guessing game where the user is to input a series of guesses, to
		 * try and guess the number held by the method, which is the input parameter.
		 * 
		 * Each time the player guesses, they are to be prompted for input. An example
		 * of expected input can be seen below:
		 * 
		 * 16 97
		 * 
		 * Each time the player guesses, they are to input 2 numbers, separated by a
		 * single space. Your method should take both of these guesses, and determine
		 * which value is closer to the secret number. Your method should ensure that
		 * exactly 2 guesses are entered. If not, it should print an error message.
		 * 
		 * If either of the guesses are correct, then the player wins. Otherwise they
		 * are presented with some console output, telling them how far away they are,
		 * which is to be calculated based on which guess was the closest of the two.
		 * 
		 * The output the user should see must be formatted, with '0' being used as
		 * padding. The readout should be 3 characters long. Therefore, if the secret
		 * number is 364, and the user enters 4 300 as their guess, the readout must be
		 * exactly:
		 * 
		 * You are 064 away from the secret number!
		 */

		/*
		 * TASK 5: (5 marks)
		 * 
		 * Create a method 'task5' that will take 2 int parameters rows and columns.
		 * This method will create
		 * a table on the console output, representing the game of mine sweeper. The aim
		 * of this task
		 * is to illustrate to the player where all the mines are on the board, such as
		 * what occurs in
		 * the standard 'game over' screen for mine sweeper.
		 * 
		 * The method should accept values between 5 and 10 for the rows and columns,
		 * however it is not
		 * required that the value of rows should match the value of columns.
		 * 
		 * The minimum value that must be entered for the rows and columns is 5, and the
		 * maximum is 10. Your method
		 * should check this. If ok, then the method will continue, otherwise it should
		 * print out an error message.
		 * 
		 * The method should print a header for the table, labelling the columns,
		 * beneath, a separator as shown in the example.
		 * The method should then populate the table, using the character 'o' to
		 * represent clear cells and
		 * the character 'x' to represent mines. Each row should also be labelled as 1,
		 * 2, 3, etc.
		 * 
		 * The mines are to be specified with 2 int values, x,y such that x represents
		 * the row position, and
		 * y represents the column position. Your method must specify three mines.
		 * 
		 * You are expected to use String.format() in this task, to format the table.
		 * The cells should be padded to a length of 3 with no unnecessary information
		 * to pad the cells.
		 * (i.e. no occurrences of for example, XoX or OoO)
		 * 
		 * If for example, the table was specified with having 10 rows and 6 columns,
		 * and
		 * the 3 mines were specified at 3,4 and 1,5 and 6,6 your table must look
		 * *exactly* like this:
		 * 
		 * 
		 * | 1 2 3 4 5 6
		 * | - - - - - -
		 * 1 | o o o o x o
		 * 
		 * 2 | o o o o o o
		 * 
		 * 3 | o o o x o o
		 * 
		 * 4 | o o o o o o
		 * 
		 * 5 | o o o o o o
		 * 
		 * 6 | o o o o o x
		 * 
		 * 7 | o o o o o o
		 * 
		 * 8 | o o o o o o
		 * 
		 * 9 | o o o o o o
		 * 
		 * 10 | o o o o o o
		 */

		/*
		 * PLACE YOUR METHOD CALLS HERE
		 */
		System.out.println("------------------TASK 1-------------------");
		task1();

		System.out.println("------------------TASK 2-------------------");
		task2(10, 3);

		System.out.println("------------------TASK 3-------------------");
		task3(7);

		System.out.println("------------------TASK 4-------------------");
		task4(123);

		System.out.println("------------------TASK 5-------------------");
		task5(7, 8);

	}

	/*
	 * EXAMPLE METHOD
	 */
	private static void helloWorld() {
		System.out.println("hello world!");
	}

	/*
	 * PLACE YOUR METHODS HERE
	 */
	// task1
	public static void task1() {
		Scanner input1 = new Scanner(System.in);
		double length, breadth;
		System.out.println("enter the length: ");
		length = input1.nextDouble();
		System.out.println("enter the breadth: ");
		breadth = input1.nextDouble();
		System.out.println("area of the rectangle with provided arguments is: " + length * breadth);

	}

	// task2
	public static void task2(int max, int num) {
		int count = 0;
		for (int i = 1; i < max; i++) {
			if (i % num == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}

	// task3
	public static void task3(int challenge) {
		Scanner input3 = new Scanner(System.in);
		int playerscore = 3, monsterscore = 3;
		while (true) {
			// the true condition makes the while loop run for infinite untill conditions
			// met
			System.out.println("Enter your rolled number: ");
			int rollednumber = input3.nextInt();
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

	}

	// task4
	public static void task4(int number) {
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter two integers in the single line: ");
		String s = input4.nextLine();
		String[] numbers = s.split(" ");
		int number1 = Integer.parseInt(numbers[0]);
		int number2 = Integer.parseInt(numbers[1]);
		if (numbers.length > 2 || number2 < 2) {
			System.out.println("U are supposed to enter two integer inputs");
		} else {
			int min = Math.min(number - number1, number - number2);
			if (number != number1 && number != number2) {
				System.out.println(String.format("you are %03d away from the secret number", min));
				System.out.println(numbers.length);
			} else {
				System.out.println("You won! you guessed the right number that is " + number);
			}

		}
	}

	// task5
	public static void task5(int rows, int colms) {
		if (rows < 10 && rows > 5 && colms < 10 && colms > 5) {
			String entry = "";
			for (int i = 1; i < rows + 3; i++) {
				if (i <= 2) {
					entry = "    |";
				} else {
					entry = String.format(" %2d |", i - 2);
				}
				for (int j = 1; j < colms + 1; j++) {
					if (i == 1) {
						entry += String.format("%3d", j);
					} else if (i == 2) {
						entry += String.format("%3c", '-');
					} else {
						if ((i == rows - 1 && j == colms - 3) || (i == rows + 1 && j == colms - 5)
								|| (i == rows + 2 && j == colms - 5)) {
							entry += String.format("%3c", 'x');
						} else {
							entry += String.format("%3c", 'o');
						}
					}
				}
				System.out.println(entry);
				if (i >= 3 && i <= rows + 2) {
					System.out.println('\n');
				}
			}
		} else {
			System.out.println("the entered rows and columns arent in accordance!");
		}

	}

}
