import java.util.Random;
public class Board {
	private int row;
	private int col;
	public Square[][] sqr;
	private final int  SHIPNUMBER = 6;
	private final int  LargeShipNumber = 1;
	private final int  MediumShipNumber = 2;
	private final int  SmallShipNumber = 3;
	public Ship[] ship = new Ship[SHIPNUMBER];
	private int remainShip;
	private Random r = new Random();
	private String printBoard;
//	Create an array of Square objectives when initializing
	public Board(int inputRow, int inputCol) {
		row = inputRow;
		col = inputCol;
		remainShip = 0;
	}
//	Initializing the array
	public void initialBoard() {
		sqr = new Square[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sqr[i][j] = new Square(i, j);
			}
		}
//		Initialize the ships
		initialShip(LargeShipNumber);
		initialShip(MediumShipNumber);
		initialShip(SmallShipNumber);
	}
//	Generate battleships
	private void initialShip(int shipNumber) {
//		Different Ship has different generator.
//		remainship is current shipNumber, also the position in Ship array.
		for(int n = 0; n < shipNumber; n++) {

			if(shipNumber == LargeShipNumber){
				largeShipGenerator(remainShip);
			} else if(shipNumber == MediumShipNumber) {
				mediumShipGenerator(remainShip);
			} else {
				smallShipGenerator(remainShip);
			}
			remainShip++;
		}
	}
//	Generate suitable position for ships, return a Square object.
//	Generate large ship size 3
	private void largeShipGenerator(int n) {
		int shipRow;
		int shipCol;
		Square secondPosition;
		Square thirdPosition;
//		Loop until find a square without ship and inside the boundary
		do {
			shipRow = r.nextInt(row);
			shipCol = r.nextInt(col);
			if (sqr[shipRow][shipCol].getIsShip()) {
//				There is a ship in this position, get another random coordinate
				continue;
			} else {
//				No ship in this position, randomly decide the ship vertical or horizontal
//				true - horizontal, false - vertical
				Boolean isHorizontal = r.nextBoolean();
				secondPosition = findNextPosition(shipRow, shipCol, isHorizontal);
				if(secondPosition.getRow() == shipRow && secondPosition.getCol() == shipCol) {
//					The return Square is the same as first Square, continue to find another first position
					continue;
				} else {
//					Effective second position, find the third position
					thirdPosition = findNextPosition(secondPosition.getRow(), secondPosition.getCol(), isHorizontal);
					if((thirdPosition.getRow() == secondPosition.getRow() && 
							thirdPosition.getCol() == secondPosition.getCol()) ||
							(thirdPosition.getRow() == shipRow && thirdPosition.getCol() == shipCol)) {
//						The return Square is the same as second Square or the first one, continue to find another first position
						continue;
					} else {
//						Successfully find the third position, assign the ship
						ship[n] = new LargeBattleShip();
						sqr[shipRow][shipCol].setShip(ship[n]);
						secondPosition.setShip(ship[n]);
						thirdPosition.setShip(ship[n]);
						break;
					}
				}
			}
//		Will loop until find a proper place for the battleship
		} while(true);
		
	}

//	Generate medium ship size 2
	private void mediumShipGenerator(int n) {
		int shiprow;
		int shipcol;
		Square nextPosition;
		do {
			shiprow = r.nextInt(row);
			shipcol = r.nextInt(col);
			if (sqr[shiprow][shipcol].getIsShip()) {
				continue;
			} else {
				Boolean isHorizontal = r.nextBoolean();
				nextPosition = findNextPosition(shiprow, shipcol, isHorizontal);
				if(nextPosition.getRow() == shiprow && nextPosition.getCol() == shipcol) {
//					The return Square is the same as first Square, continue to find another position
					continue;
				} else {
//					Effective position, assign the ship to the square
					ship[n] = new MediumBattleship();
					sqr[shiprow][shipcol].setShip(ship[n]);
					nextPosition.setShip(ship[n]);
					break;
				}
			}
		} while(true);
	}
	
//	Generate small ship size 1
	private void smallShipGenerator(int n) {
		int shiprow;
		int shipcol;
		do {
			shiprow = r.nextInt(row);
			shipcol = r.nextInt(col);
			if (sqr[shiprow][shipcol].getIsShip()) {
				continue;
			} else {
				ship[n] = new SmallBattleship();
				sqr[shiprow][shipcol].setShip(ship[n]);
				break;
			}
		}while(true);
	}
	
//	Find a second position next to the first one
	private Square findNextPosition(int shiprow, int shipcol, boolean isHorizontal) {
		if(isHorizontal) {
			if(shiprow + 1 < row && !sqr[shiprow + 1][shipcol].getIsShip()) {
//				No ship on the right and inside the boundary and not overlap
				return sqr[shiprow + 1][shipcol];	
			} else if(shiprow - 1 >= 0 && !sqr[shiprow - 1][shipcol].getIsShip()) {
//				Check left
				return sqr[shiprow - 1][shipcol];
			} else {
//				If cannot find a suitable point,return the same square
				return sqr[shiprow][shipcol];
			}
		} else {
//			Ship is vertical
			if(shipcol + 1 < col && !sqr[shiprow][shipcol+1].getIsShip()) {
//				No ship below inside the boundary and not overlap
				return sqr[shiprow][shipcol + 1];
			} else if(shipcol - 1 >= 0 && !sqr[shiprow][shipcol - 1].getIsShip()) {
//				Check above
				return sqr[shiprow][shipcol-1];
			} else {
//				If cannot find a suitable point,return the same square
				return sqr[shiprow][shipcol];
			}
		}
	}
	
	public int getShipNumber() {
		return SHIPNUMBER;
	}
//	Get how many ships remain
	public int getRemainShips() {
//		Must reset remainShip, because this method will check every ship.
		remainShip = SHIPNUMBER;
		for(int i = 0;i < SHIPNUMBER; i++) {
			if(ship[i].getIsSunk() == true) {
				remainShip--;
			}
		}
		return remainShip;
	}
//	Print the board
	public String toString() {
		printBoard = "";
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				printBoard += sqr[i][j].toString();
			}
			printBoard += "\n";
		}
		return printBoard;
	}
}