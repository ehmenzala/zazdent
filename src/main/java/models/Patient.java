package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "guardian_id")
    private Guardian guardian;

    @Column(name = "last_name_father")
    private String lastNameFather;

    @Column(name = "last_name_mother")
    private String lastNameMother;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "birthplace")
    private String birthplace;

    @Column(name = "dni")
    private String dni;

    @Column(name = "email")
    private String email;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "phone")
    private String phone;

    @Column(name = "marital_status")
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

    @Column(name = "address")
    private String address;

    @Column(name = "district")
    private String district;

    @OneToOne(mappedBy = "patient")
    private MedicalHistory medicalHistory;

    public enum MaritalStatus {
        casado, soltero, vuido, divorciado;
    }

    public Patient(int id, Guardian guardian, String lastNameFather, String lastNameMother, String name, int age, String birthplace, String dni, String email, String occupation, String phone, MaritalStatus maritalStatus, String address, String district, MedicalHistory medicalHistory) {
        this.id = id;
        this.guardian = guardian;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.name = name;
        this.age = age;
        this.birthplace = birthplace;
        this.dni = dni;
        this.email = email;
        this.occupation = occupation;
        this.phone = phone;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.district = district;
        this.medicalHistory = medicalHistory;
    }

    public Patient(Guardian guardian, String lastNameFather, String lastNameMother, String name, int age, String birthplace, String dni, String email, String occupation, String phone, MaritalStatus maritalStatus, String address, String district) {
        this.guardian = guardian;
        this.lastNameFather = lastNameFather;
        this.lastNameMother = lastNameMother;
        this.name = name;
        this.age = age;
        this.birthplace = birthplace;
        this.dni = dni;
        this.email = email;
        this.occupation = occupation;
        this.phone = phone;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.district = district;
    }
    
    public Patient() {}

    public int getId() {
        return id;
    }

    public Guardian getGuardian() {
        return guardian;
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

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPhone() {
        return phone;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }
}
