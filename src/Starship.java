import java.util.ArrayList;

/**
 * A class that contains all the information for the starship
 * @author Hannah Perez 
 *
 */
public class Starship {
	String name, registry, shipClass;
	ArrayList<CrewMember> crewMembers;
	
	/**
	 * a constructor for the starship
	 * @param name a String for the ship's name
	 * @param registry a String for the ship's registry
	 * @param shipClass a String for the ship's class
	 */
	public Starship(String name, String registry, String shipClass) {
		this.name = name;
		this.registry = registry;
		this.shipClass = shipClass;
		crewMembers = new ArrayList<CrewMember>();
	}
	
	 /**
	  * adds a crew member to the ship's list of personnel
	  * @param crew a CrewMember object representing a crew member
	  */
	public void addCrewMember(CrewMember crew) {
		crewMembers.add(crew);
	}
	
	/**
	 * counts how many personnel the ship has
	 * @return n an integer representing the count of the ship's personnel
	 */
	public int getNumberOfPersonnel() {
		int n = 0;
		n = crewMembers.size();
		return n;
	}

	/**
	 * @return the String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name of the starship
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the String registry
	 */
	public String getRegistry() {
		return registry;
	}

	/**
	 * @param registry the registry of the starship
	 */
	public void setRegistry(String registry) {
		this.registry = registry;
	}

	/**
	 * @return the String shipClass
	 */
	public String getShipClass() {
		return shipClass;
	}

	/**
	 * @param shipClass the class of the starship
	 */
	public void setShipClass(String shipClass) {
		this.shipClass = shipClass;
	}

	/**
	 * @return the ArrayList of CrewMembers crewMembers
	 */
	public ArrayList<CrewMember> getCrewMembers() {
		return crewMembers;
	}

	/**
	 * @param crewMembers the crew members on the starship
	 */
	public void setCrewMembers(ArrayList<CrewMember> crewMembers) {
		this.crewMembers = crewMembers;
	}
	
	/**
	 * a method that returns all the information about the starship
	 * @return message a String with information about the starship
	 */
	public String toString() {
		int x = 0;
		String message = "";
		
		x = getNumberOfPersonnel();
		
		message += name + " " + shipClass + ". Registry: " + registry + "\n";
		message += x + " crew members assigned.\n";
		
		for(int i = 0; i < x; i++) {
			message += crewMembers.get(i).toString();
		}
		
		message += "\n";
		
		return message;
	}
}
