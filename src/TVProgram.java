
public class TVProgram {

		String name;
		int datePublished;
		int starsInvolved;
		
		// constructor
		TVProgram(String name, int datePublished, int starsInvolved){
			this.name = name;
			this.datePublished = datePublished;
			this.starsInvolved = starsInvolved;
			
		}
		
		
		// display tv program info
		void DisplayTVProgram() {
			System.out.println("Name: " + name + "\n" 
								+ "Date published: " + datePublished + "\n" 
								+ "Number of Stars Involved: " + starsInvolved);
		}
}
