
package models;

public class Dentist {
    private final int id;
    private final String name;
    private final String lastNameFather;
    private final String lastNameMother;
    private final String dni;

    public Dentist(int id, String name, String lastNameFather, String lastNameMother, String dni) {
        this.id = id;
        this.name = name;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastNameFather() {
        return lastNameFather;
    }

    public String getLastNameMother() {
        return lastNameMother;
    }

    public String getDni() {
        return dni;
    } 
}
