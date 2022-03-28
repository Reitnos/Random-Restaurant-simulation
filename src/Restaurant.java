
public class Restaurant {
	Room room1,room2;
	
	public Restaurant(Room room1, Room room2) {
		
		// initialize the rooms of the restaurant
		this.room1 = room1;
		this.room2 = room2;
		
		
	}
	void DisplayRestaurant(){
		room1.displayRoom();
		System.out.println();
		room2.displayRoom();
	}
}
