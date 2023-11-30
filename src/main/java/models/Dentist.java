package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "dentist")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "last_name_father")
    private String lastNameFather;
    
    @Column(name = "last_name_mother")
    private String lastNameMother;
    
    @Column(name = "dni")
    private String dni;
    
    @OneToOne(mappedBy = "dentist")
    private ClinicalExam clinicalExam;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="dentist_specialties",
      joinColumns = { @JoinColumn(name = "dentist_id", referencedColumnName = "id") },
      inverseJoinColumns = { @JoinColumn(name = "specialty_id", referencedColumnName = "id") })
    private Set<Specialty> specialties;

    public Dentist(int id, String name, String lastNameFather, String lastNameMother, String dni, Set<Specialty> specialties, ClinicalExam clinicalExam) {
        this.id = id;
        this.name = name;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.dni = dni;
        this.specialties = specialties;
        this.clinicalExam = clinicalExam;
    }
    
    public Dentist(String name, String lastNameFather, String lastNameMother, String dni, Set<Specialty> specialties) {
        this.name = name;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.dni = dni;
        this.specialties = specialties;
    }
    
    public Dentist(String name, String lastNameFather, String lastNameMother, String dni) {
        this.name = name;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.dni = dni;
    }
    
    public Dentist() {}

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

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public ClinicalExam getClinicalExam() {
        return clinicalExam;
    }
}
