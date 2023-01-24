import java.util.Scanner;
public class Player {
	private String name;
	private int score;
	public Board board;	
	private int turnNo;
	Scanner in = new Scanner(System.in);
	
	public Player(String inputName) {
		name = inputName;
		score = 0;
		turnNo = 0;
		board = new Board(10, 10);
	}
//	Take turn - if game end after this turn, return true, else false.
	public Boolean takeTurn() {
		int x = 0;
		int y = 0;
//		When Show what's the current turn number, each play turnNO will increment by 1.
		turnNo++;
		System.out.println(name + "'s turn "+ turnNo);
		System.out.println("Please input the coordinate, seperated by a space");
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("You hit " + x + ", " + y + ".");
		if(board.sqr[x][y].getIsHit() == true) {
			System.out.println("This coordinate has been hit, you lose your turn.");
		} else {
//			If the position has not been hit, check if there is a ship.
			board.sqr[x][y].setIsHit();
		}
//		When player's turn ends, update the board and check if he/she wins.
		score = board.getShipNumber() - board.getRemainShips();
		System.out.println(name + "'s score: " + score + ".");
		System.out.println("Remain ships: " + board.getRemainShips());
//		Test - print ship health
//		for(int i = 0; i < board.getShipNumber(); i++) {
//			System.out.print("Ship" + i + "'s health is: " + board.ship[i].getShipHealth() + ".  ");
//		}
//		System.out.print("\n");
		printBoard();
		return checkEndGame();
	}
//	If there is no ship alive, return true end game.
	private Boolean checkEndGame() {
		if(score == board.getShipNumber()) {
			return true;
		} else {
			return false;
		}
	}
	public void printBoard() {
		System.out.println(board.toString());
	}
//	Getters
	public int getScore() {
		return score;
	}
	public int getTurnNumber() {
		return turnNo;
	}
	public String getName() {
		return name;
	}
}