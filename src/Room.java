import java.util.ArrayList;

public abstract class Room {
	
	// member variables of abstract room class
	protected int  numOfGuestsInside = 0;
	protected int  numOfTables;
	protected int  numOfChairs;
	protected Menu menu;
	protected TV tv;
	protected ArrayList<Table> tableList;
	
	//getter methods
	public int getNumOfGuestsInside() {
		return numOfGuestsInside;
	}
	public int getNumOfTables() {
		return numOfTables;
	}
	public int getNumOfChairs() {
		return numOfChairs;
	}

	
	
	abstract void addGuestToRoom();
	abstract void displayRoom();
	
}
