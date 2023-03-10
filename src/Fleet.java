import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that represents the information in the fleet
 * @author Hannah Perez
 *
 */
public class Fleet {
	String name;
	ArrayList<Starship> ships;
	
	/**
	 * A constructor for the fleet
	 * @param name the String representing the name of the fleet
	 */
	public Fleet(String name) {
		this.name = name;
		ships = new ArrayList<Starship>();
	}

	/**
	 * @return the String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name of the fleet
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ArrayList ships
	 */
	public ArrayList<Starship> getShips() {
		return ships;
	}

	/**
	 * @param ships the Arraylist of Starships
	 */
	public void setShips(ArrayList<Starship> ships) {
		this.ships = ships;
	}
	
	/**
	 * a method to determine the number of ships in the fleet
	 * @return n an integer with the count of starships in the fleet
	 */
	public int getSizeOfFleet() {
		int n = 0;
		n = ships.size();
		return n;
	}
	
	/**
	 * a method to add a ship to the ships ArrayList
	 * @param ship a Starship object
	 */
	public void addStarship(Starship ship) {
		ships.add(ship);
	}
	
	/**
	 * A method that converts all of the fleet's information to string
	 * @return message a String with all the fleet's information
	 */
	public String toString() {
		String message = "";
		String dashes = "";
		int x, y;
		
		x = name.length();
		
		for(int i = 0; i < x; i++) {
			dashes += "-";
		}
		
		message += dashes + "\n" + name + "\n" + dashes + "\n";
		
		y = ships.size();
		for(int i = 0; i < y; i++) {
			message += ships.get(i).toString();
		}
		
		return message;
	}
	
	public void loadStarships( String directoryName ) throws FileNotFoundException {
		File dir = new File("data/" + directoryName);
		String[] files;
		
		
		files = dir.list();
		
		for(int i = 0; i < files.length; i++) {
			ArrayList<String> info = new ArrayList<String>();
			File file = new File(dir + "/" + files[i]);
			Scanner sc = new Scanner(file);
			sc.useDelimiter(",|\\n");
			while (sc.hasNext()) {
				info.add(sc.next());
			}
			
			Starship ship = new Starship(info.get(0), info.get(1), info.get(2));
			
			for(int j = 3; j < info.size(); j += 4) {
				CrewMember crew = new CrewMember(info.get(j), info.get(j+1), info.get(j+2), info.get(j+3));
				ship.addCrewMember(crew);
			}
			
			ships.add(ship);
			sc.close();
			for(int j = 0; j < info.size(); j++) {
				info.remove(j);
			}
		}
	}
	
	
}
