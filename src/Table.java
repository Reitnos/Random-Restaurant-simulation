
public class Table {
	int currentNumOfPeopleAround = 0;
	int maxNumOfPeopleAround;
	boolean isFull = false;
	boolean isEmpty = true;

	
	void addPeople() throws Exception {
	
		if(currentNumOfPeopleAround < maxNumOfPeopleAround)
		{
			currentNumOfPeopleAround++;
			declareTableUnempty();
			checkIfTableIsCompletelyOccupied();
		}
		else {
			// if placement failed, throw an exception.
			throw new Exception("Table is full");
		}
			
	}

	private void checkIfTableIsCompletelyOccupied() {
		if(currentNumOfPeopleAround == maxNumOfPeopleAround) {
			isFull = true;
		}
	}

	private void declareTableUnempty() {
		isEmpty = false;
	}
	
	boolean isAvailableToSit() {
		return currentNumOfPeopleAround < maxNumOfPeopleAround;
	}
}
