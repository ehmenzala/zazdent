package models;

public class Guardian {

	private final int id;
	private final String lastNameFather;
	private final String lastNameMother;
	private final String name;
	private final String dni;
	private final String relationship;

	public Guardian(int id, String lastNameFather, String lastNameMother, String name, String dni,
			String relationship) {
		super();
		this.id = id;
		this.lastNameFather = lastNameFather;
		this.lastNameMother = lastNameMother;
		this.name = name;
		this.dni = dni;
		this.relationship = relationship;
	}

	public int getId() {
		return id;
	}

	public String getLastNameFather() {
		return lastNameFather;
	}

	public String getLastNameMother() {
		return lastNameMother;
	}

	public String getName() {
		return name;
	}

	public String getDni() {
		return dni;
	}

	public String getRelationship() {
		return relationship;
	}

}
