import java.util.Random;

import javax.sound.midi.MidiDevice;

public class RestaurantSimulator {

	public static void main(String[] args) {
		
			Random random = new Random();
	
			// creating tv programs
			TVProgram program1 = new TVProgram("Game of Thrones",2004,12);
			TVProgram program2 = new TVProgram("Criminal Minds",2003,4);
			TVProgram program3 = new TVProgram("Prison Break",2007,5);
			TVProgram program4 = new TVProgram("Squid Game",2020,3);
			
			// creating tvs
			
			TV carnivorRoomTv = new TV(true,program3);
			TV vegetarianRoomTv = new TV(true,program1);
			
			// creating menus
			
			Menu menu1 = new Menu("fish soup", "steak", "baklava");
			Menu menu2 = new Menu("rise soup", "rise meal", "rise dessert");
			Menu menu3 = new Menu("cold soup", "Pierogi", "Pierogi but somehow dessert");
			
			// creating rooms
			
			CarnivoresRoom carnivoresRoom = new CarnivoresRoom(9, 18,carnivorRoomTv,menu1);
			VegetarianRoom vegetarianRoom = new VegetarianRoom(5, 12,vegetarianRoomTv,menu3);
			
			
			// randomly distributing random amount of people
			
			int randomAmountOfPeople = random.nextInt(31);
			
			for(int i = 0; i< randomAmountOfPeople; i++) {
				int deciderRandom = random.nextInt(2);
				if(deciderRandom == 0) {
					carnivoresRoom.addGuestToRoom();
				}
				else {
					vegetarianRoom.addGuestToRoom();
				}
			}
			
			// Creating the restaurant
			Restaurant restaurant = new Restaurant(carnivoresRoom, vegetarianRoom);
			restaurant.DisplayRestaurant();
			
			
	}

}
