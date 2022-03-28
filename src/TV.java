
public class TV {
	
	private boolean isTurnedOn;
	private TVProgram tvProgram;
	
	
	// constructors
	TV(boolean isTurnedOn){
		this.isTurnedOn = isTurnedOn;
	}
	
	TV(boolean isTurnedOn, TVProgram tvProgram){
		this.isTurnedOn = isTurnedOn;
		this.tvProgram = tvProgram;
		
	}
	
	public TVProgram getTvProgram() {
		return tvProgram;
	}
	
	public void DisplayTV() {
		if(isTurnedOn) {
			tvProgram.DisplayTVProgram();
		}
		else {
			System.out.println("TV is off");
		}
	}
}
