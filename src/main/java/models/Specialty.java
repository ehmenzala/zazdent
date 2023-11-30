package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "specialties", fetch = FetchType.LAZY)
    private Set<Dentist> dentists;

    public Specialty(int id, String name, String description, Set<Dentist> dentists) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dentists = dentists;
    }
    
    public Specialty(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Specialty(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Specialty() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<Dentist> getDentists() {
        return dentists;
    }
}
