import java.util.ArrayList;

public class CommonFunctions {
	public static ArrayList<Table> createAndInitializeTableListForRoom(int numOfTables ) {
		ArrayList<Table> tableList  = new ArrayList<Table>();
		for(int i = 0; i < numOfTables; i++) {
			tableList.add(new SittingTable());
		}
		return tableList;
	}
}
