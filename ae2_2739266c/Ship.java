
public class Ship {
	protected static int size;
	protected int health;
	protected Boolean isSunk;
	
	public Ship() {
		health = size;
		isSunk = false;
	}
//	If the ship is hit lose 1 health
	public void beHit() {
		health --;
		if(health == 0) {
			isSunk = true;
		}
	}
	public Boolean getIsSunk() {
		return isSunk;
	}
//	Test
//	public int getShipHealth() {
//		return health;
//	}
}