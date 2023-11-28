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
@Table(name = "anamnesis")
public class Anamnesis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "antecedents_id")
    private Antecedents antecedents;

    @Column(name = "consultation_reason")
    private String consultationReason;

    @Column(name = "current_disease")
    private String currentDisease;

    @Column(name = "tome_of_illness")
    private String tomeOfIllness;

    @Column(name = "main_symptoms")
    private String mainSymptoms;

    @Column(name = "last_visit_to_dentist")
    private String lastVisitToDentist;

    @OneToOne(mappedBy = "anamnesis")
    private MedicalHistory medicalHistory;

    public Anamnesis(int id, Antecedents antecedents, String consultationReason, String currentDisease, String tomeOfIllness, String mainSymptoms, String lastVisitToDentist, MedicalHistory medicalHistory) {
        this.id = id;
        this.antecedents = antecedents;
        this.consultationReason = consultationReason;
        this.currentDisease = currentDisease;
        this.tomeOfIllness = tomeOfIllness;
        this.mainSymptoms = mainSymptoms;
        this.lastVisitToDentist = lastVisitToDentist;
        this.medicalHistory = medicalHistory;
    }

    public Anamnesis(Antecedents antecedents, String consultationReason, String currentDisease, String tomeOfIllness, String mainSymptoms, String lastVisitToDentist) {
        this.antecedents = antecedents;
        this.consultationReason = consultationReason;
        this.currentDisease = currentDisease;
        this.tomeOfIllness = tomeOfIllness;
        this.mainSymptoms = mainSymptoms;
        this.lastVisitToDentist = lastVisitToDentist;
    }
    
    public Anamnesis() {}

    public int getId() {
        return id;
    }

    public Antecedents getAntecedents() {
        return antecedents;
    }

    public String getConsultationReason() {
        return consultationReason;
    }

    public String getCurrentDisease() {
        return currentDisease;
    }

    public String getTomeOfIllness() {
        return tomeOfIllness;
    }

    public String getMainSymptoms() {
        return mainSymptoms;
    }

    public String getLastVisitToDentist() {
        return lastVisitToDentist;
    }

    public MedicalHistory getMedicalHistory() {
        return medicalHistory;
    }
}
