import java.util.ArrayList;
import java.util.Random;


public class CarnivoresRoom extends Room{
		
	
	public CarnivoresRoom( int numOfTables, int numOfChairs, TV tv, Menu menu) {
		
		// initializing member variables of carnivores room
		this.numOfTables = numOfTables;
		this.numOfChairs = numOfChairs;
		this.tv = tv;
		this.menu = menu;
		
		
		
		tableList = CommonFunctions.createAndInitializeTableListForRoom(numOfTables);
		
	}

	

	@Override
	void addGuestToRoom() {
		if(numOfGuestsInside < numOfChairs) {
			numOfGuestsInside++;
			// place the given number of customers randomly to empty chairs around the tables.
			// if randomly found table is full, try this process again.
			randomlySeatPeople();
			
		}
		
		
		}



	private void randomlySeatPeople() {
		Random random = new Random();
		boolean foundAFreeTableToPlace = false;
		while(!foundAFreeTableToPlace)
		{
			try {
				int randomTableIndex = random.nextInt(numOfTables);
				tableList.get(randomTableIndex).addPeople();
				foundAFreeTableToPlace = true;
			}
			catch(Exception e){
				
			}
			
		}
	}
	@Override
	void displayRoom() {
		int freeTables = 0;
		// check all tables and count the empty ones
		for(int i = 0; i < numOfTables; i++) {
			if(tableList.get(i).isEmpty) {
				freeTables++;
			}
		}
		
		System.out.println("Carnivores Room: \n" +
							"Number of people inside: " + numOfGuestsInside + "\n"
							+ "Total number of dinner tables in the room: " + numOfTables + "\n"
							+ "Number of free tables: " + freeTables);
		System.out.println("-----TV Content Below-----");
		tv.DisplayTV();
		System.out.println("-----Menu Content Below-----");
		menu.MenuDisplay();
	}

}
