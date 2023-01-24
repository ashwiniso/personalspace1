
public class Square {
	private int row;
	private int col;
	private char state;
	private Boolean isHit;
	private Boolean isShip;
	private Ship a;
	
//	Constructor
//	Need to take in ship objective?
	public Square(int inputRow, int inputCol) {
		row = inputRow;
		col = inputCol;
		state = '-';
		isHit = false;
		isShip = false;
		a = null;
	}
//	Getter and Setters
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public char getState() {
		return state;
	}
	public Boolean getIsHit() {
		return isHit;
	}
	public Boolean getIsShip() {
		return isShip;
	}
	public void setShip(Object input) {
		if(input instanceof Ship) {
			a = (Ship) input;
			isShip = true;
//			Test - Ship visible
//			state = 'D';
		} else {
			System.out.println("Invalid input object type");
		}
	}
//	State converts from '-' to 'x' or 'o', if hit the ship lose 1 health
	public void setIsHit() {
		isHit = true;
		if(isShip) {
			System.out.println("You hit a ship.");
			state = 'x';
			a.beHit();
		} else {
			System.out.println("You miss.");
			state = 'o';
		}
	}
//	Used by Board to print each cell.
	public String toString() { 

		return String.format("%3c", state);
	}
}