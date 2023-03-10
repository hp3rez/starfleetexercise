/**
 * A class that contains the data for the crew members
 * @author Hannah Perez 
 *
 */
public class CrewMember {
	String name, position, rank, species, assignment;
	
	/**
	 * A constructor for crew members with assignments
	 * @param name the name of the crew member
	 * @param position the position of the crew member
	 * @param rank the rank of the crew member
	 * @param species the species of the crew member
	 * @param assignment the assignment of the crew member
	 */
	public CrewMember(String name, String position, String rank, String species, String assignment) {
		this.name = name;
		this.position = position;
		this.rank = rank;
		this.species = species;
		this.assignment = assignment;
	}
	
	/**
	 * A constructor for crew members without assignments
	 * @param name the name of the crew member
	 * @param position the position of the crew member
	 * @param rank the rank of the crew member
	 * @param species the species of the crew member
	 * @param assignment the assignment of the crew member
	 */
	public CrewMember(String name, String position, String rank, String species) {
		this.name = name;
		this.position = position;
		this.rank = rank;
		this.species = species;
		assignment = "";
	}

	/**
	 * @return the String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name of the crew member
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the String position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position of the crew member
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the String rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank of the crew member
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * @return the String species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species of the crew member
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the String assignment
	 */
	public String getAssignment() {
		return assignment;
	}

	/**
	 * @param assignment the assignment of the crew member
	 */
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	
	/**
	 * a method that compiles the crew member's information for display
	 * @return message a String with the crew member's information
	 */
	public String toString() {
		String message = "";
		
		message += " - " + name + " (" + rank + ") - " + position + " [" + species + "]\n";
		
		return message;
	}
}
