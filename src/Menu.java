
public class Menu {
	String soup, mainDish, dessert;
	
	Menu(String soup, String mainDish, String dessert){
		this.soup = soup;
		this.mainDish = mainDish;
		this.dessert = dessert;
	}
	
	void MenuDisplay() {
		System.out.println("Soup: " + soup + "\n"
							+ "Main Dish: "+ mainDish + "\n"
							+ "Dessert: " + dessert);
	}
	
}
