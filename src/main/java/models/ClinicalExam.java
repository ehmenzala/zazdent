package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinical_exam")
public class ClinicalExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "stomatological_exam_id")
    private StomatologicalExam stomatologicalExam;
    
    @OneToOne
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;
    
    @Column(name = "weight")
    private double weight;
    
    @Column(name = "height")
    private double height;
    
    @Column(name = "blood_presure")
    private double bloodPressure;
    
    @Column(name = "pulse")
    private double pulse;
    
    @Column(name = "temperature")
    private double temperature;
    
    @Column(name = "breathing_rate")
    private double breathingRate;
    
    @OneToOne(mappedBy = "clinicalExam")
    private MedicalHistory medicalHistory;
    
    public ClinicalExam(int id, StomatologicalExam stomatologicalExam, Dentist dentist, double weight, double height, double bloodPressure, double pulse, double temperature, double breathingRate, MedicalHistory medicalHistory) {
        this.id = id;
        this.stomatologicalExam = stomatologicalExam;
        this.dentist = dentist;
        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.temperature = temperature;
        this.breathingRate = breathingRate;
        this.medicalHistory = medicalHistory;
    }
    
    public ClinicalExam(StomatologicalExam stomatologicalExam, Dentist dentist, double weight, double height, double bloodPressure, double pulse, double temperature, double breathingRate) {
        this.stomatologicalExam = stomatologicalExam;
        this.dentist = dentist;
        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.temperature = temperature;
        this.breathingRate = breathingRate;
    }
    
    public ClinicalExam() {}

    public int getId() {
        return id;
    }

    public StomatologicalExam getStomatologicalExam() {
        return stomatologicalExam;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getPulse() {
        return pulse;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getBreathingRate() {
        return breathingRate;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }
}
