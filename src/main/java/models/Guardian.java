package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "guardian")
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "last_name_father")
    private String lastNameFather;

    @Column(name = "last_name_mother")
    private String lastNameMother;

    @Column(name = "name")
    private String name;

    @Column(name = "dni")
    private String dni;

    @Column(name = "relationship")
    private String relationship;

    @OneToOne(mappedBy = "guardian")
    private Patient patient;

    public Guardian(int id, String lastNameFather, String lastNameMother, String name, String dni, String relationship, Patient patient) {
        this.id = id;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.name = name;
        this.dni = dni;
        this.relationship = relationship;
        this.patient = patient;
    }

    public Guardian(String lastNameFather, String lastNameMother, String name, String dni, String relationship) {
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.name = name;
        this.dni = dni;
        this.relationship = relationship;
    }
    
    public Guardian() {}

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
