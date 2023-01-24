import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		Input players' name
		System.out.println("Please input the name of gamer 1.");
		String name1 = in.nextLine();
		System.out.println("Please input the name of gamer 2.");
		String name2 = in.nextLine();
//		Create Player objects
		Player p1 = new Player(name1);
		Player p2 = new Player(name2);
		p1.board.initialBoard();
		p2.board.initialBoard();
		p1.printBoard();
		p2.printBoard();
//		Start turns.
		play(p1, p2);
		in.close();
	}
//	Take turns until the game ends.
	static void play(Player p1, Player p2) {
		Boolean checkEndGame1 = false;
		Boolean checkEndGame2 = false;
		do {
			checkEndGame1 = p1.takeTurn();
			checkEndGame2 = p2.takeTurn();
		} while(!checkEndGame1 && !checkEndGame2);
//		If the game ends, check who wins.
		whoWins(p1, p2);
	}
//	Whoever has higher score wins, if their scores are the same, draw;
	static void whoWins(Player p1, Player p2) {
		if(p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " wins.");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println(p2.getName() + " wins.");
		} else {
			System.out.println("Draw.");
		}
	}
}