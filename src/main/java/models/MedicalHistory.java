package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "medical_history")
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    @OneToOne
    @JoinColumn(name = "clinical_exam")
    private ClinicalExam clinicalExam;
    
    @OneToOne
    @JoinColumn(name = "anamnesis_id")
    private Anamnesis anamnesis;
    
    @Column(name = "creation_date")
    private LocalDate creationDate;
    
    @Column(name = "presumptive_diagnosis")
    private String presumptiveDiagnosis;
    
    @Column(name = "auxiliary_exams")
    private String auxiliaryExamns;
    
    @Column(name = "definitive_diagnosis")
    private String definitiveDiagnosis;
    
    @Column(name = "treatment_plan")
    private String treatmentPlan;

    public MedicalHistory(int id, Patient patient, ClinicalExam clinicalExam, Anamnesis anamnesis, LocalDate creationDate, String presumptiveDiagnosis, String auxiliaryExamns, String definitiveDiagnosis, String treatmentPlan) {
        this.id = id;
        this.patient = patient;
        this.clinicalExam = clinicalExam;
        this.anamnesis = anamnesis;
        this.creationDate = creationDate;
        this.presumptiveDiagnosis = presumptiveDiagnosis;
        this.auxiliaryExamns = auxiliaryExamns;
        this.definitiveDiagnosis = definitiveDiagnosis;
        this.treatmentPlan = treatmentPlan;
    }
    
    public MedicalHistory(Patient patient, ClinicalExam clinicalExam, Anamnesis anamnesis, String presumptiveDiagnosis, String auxiliaryExamns, String definitiveDiagnosis, String treatmentPlan) {
        this.patient = patient;
        this.clinicalExam = clinicalExam;
        this.anamnesis = anamnesis;
        this.presumptiveDiagnosis = presumptiveDiagnosis;
        this.auxiliaryExamns = auxiliaryExamns;
        this.definitiveDiagnosis = definitiveDiagnosis;
        this.treatmentPlan = treatmentPlan;
    }
    
    public MedicalHistory() {}

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public ClinicalExam getClinicalExam() {
        return clinicalExam;
    }

    public Anamnesis getAnamnesis() {
        return anamnesis;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public String getPresumptiveDiagnosis() {
        return presumptiveDiagnosis;
    }

    public String getAuxiliaryExamns() {
        return auxiliaryExamns;
    }

    public String getDefinitiveDiagnosis() {
        return definitiveDiagnosis;
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }
}
