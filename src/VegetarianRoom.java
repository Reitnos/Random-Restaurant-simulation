import java.util.ArrayList;
import java.util.Random;

public class VegetarianRoom extends Room{
	
		private boolean occupiedSnookerTable = false;

		public VegetarianRoom( int numOfTables, int numOfChairs, TV tv, Menu menu) {
			
			this.numOfTables = numOfTables;
			this.numOfChairs = numOfChairs;
			this.tv = tv;
			this.menu = menu;
			
			
			
			tableList = CommonFunctions.createAndInitializeTableListForRoom(numOfTables);
			tableList.add(new SnookerTable());
			
		}

		@Override
		void addGuestToRoom() {
				if(numOfGuestsInside <numOfChairs) {
				
					
				numOfGuestsInside++;
				// place the given number of customers randomly to empty chairs around the tables.
				// if randomly found table is full, try this process again.
				// also check if the snooker table is occupied.
				randomlySeatPeopleAndCheckSnookerTable();
						
			
				}
			
			
			
			}

		private void randomlySeatPeopleAndCheckSnookerTable() {
			Random random = new Random();
			boolean foundAFreeTableToPlace = false;
			while(!foundAFreeTableToPlace)
			{
				try {
					int randomTableIndex = random.nextInt(numOfTables+1);
					tableList.get(randomTableIndex).addPeople();
					foundAFreeTableToPlace = true;
					Table tableFinder = tableList.get(randomTableIndex);
					if(tableFinder instanceof SnookerTable) {
					
						 occupiedSnookerTable = true; 
					}
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
			
			System.out.println("Vegetarian Room: \n" +
								"Number of people inside: " + numOfGuestsInside + "\n"
								+ "Total number of dinner tables in the room: " + numOfTables + "\n"
								+ "Number of free tables: " + freeTables);
			if(occupiedSnookerTable) {
				System.out.println("Snooker table is occupied, number of people playing: " + tableList.get(numOfTables).currentNumOfPeopleAround);
			}
			else {
				System.out.println("Snooker table is free");
			}
			System.out.println("-----TV Content Below-----");
			tv.DisplayTV();
			System.out.println("-----Menu Content Below-----");
			menu.MenuDisplay();
		}

		
}
