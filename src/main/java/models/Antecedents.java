package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "antecedents")
public class Antecedents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "pulmonary")
    private String pulmonary;

    @Column(name = "cardiac")
    private String cardiac;

    @Column(name = "neurological")
    private String neurological;

    @Column(name = "hepatic")
    private String hepatic;

    @Column(name = "renal")
    private String renal;

    @Column(name = "endocrine")
    private String endocrine;

    @Column(name = "other_diseases")
    private String otherDiseases;

    @Column(name = "medication")
    private String medication;

    @Column(name = "prev_operations")
    private String prevOperations;

    @Column(name = "tumor_treatment")
    private String tumorTreatment;

    @Column(name = "hemorrhage")
    private String hemorrhage;

    @Column(name = "daily_brushing")
    private int dailyBrushings;

    @Column(name = "oral_hygiene_items")
    private String oralHygieneItems;

    @Column(name = "has_bleeding_gums")
    private boolean hasBleedingGums;

    @Column(name = "smokes_cigarrettes")
    private boolean smokesCigarrettes;

    @Column(name = "smoke_frequency")
    private String smokeFrequency;

    @Column(name = "is_taking_contraceptives")
    private boolean isTakingContraceptives;

    @Column(name = "is_pregnant")
    private boolean isPregnant;

    @Column(name = "is_breastfeeding")
    private boolean isBreastfeeding;

    @OneToOne(mappedBy = "antecedents")
    private Anamnesis anamnesis;

    public Antecedents(int id, String allergies, String pulmonary, String cardiac, String neurological, String hepatic, String renal, String endocrine, String otherDiseases, String medication, String prevOperations, String tumorTreatment, String hemorrhage, int dailyBrushings, String oralHygieneItems, boolean hasBleedingGums, boolean smokesCigarrettes, String smokeFrequency, boolean isTakingContraceptives, boolean isPregnant, boolean isBreastfeeding, Anamnesis anamnesis) {
        this.id = id;
        this.allergies = allergies;
        this.pulmonary = pulmonary;
        this.cardiac = cardiac;
        this.neurological = neurological;
        this.hepatic = hepatic;
        this.renal = renal;
        this.endocrine = endocrine;
        this.otherDiseases = otherDiseases;
        this.medication = medication;
        this.prevOperations = prevOperations;
        this.tumorTreatment = tumorTreatment;
        this.hemorrhage = hemorrhage;
        this.dailyBrushings = dailyBrushings;
        this.oralHygieneItems = oralHygieneItems;
        this.hasBleedingGums = hasBleedingGums;
        this.smokesCigarrettes = smokesCigarrettes;
        this.smokeFrequency = smokeFrequency;
        this.isTakingContraceptives = isTakingContraceptives;
        this.isPregnant = isPregnant;
        this.isBreastfeeding = isBreastfeeding;
        this.anamnesis = anamnesis;
    }

    public Antecedents(String allergies, String pulmonary, String cardiac, String neurological, String hepatic, String renal, String endocrine, String otherDiseases, String medication, String prevOperations, String tumorTreatment, String hemorrhage, int dailyBrushings, String oralHygieneItems, boolean hasBleedingGums, boolean smokesCigarrettes, String smokeFrequency, boolean isTakingContraceptives, boolean isPregnant, boolean isBreastfeeding) {
        this.allergies = allergies;
        this.pulmonary = pulmonary;
        this.cardiac = cardiac;
        this.neurological = neurological;
        this.hepatic = hepatic;
        this.renal = renal;
        this.endocrine = endocrine;
        this.otherDiseases = otherDiseases;
        this.medication = medication;
        this.prevOperations = prevOperations;
        this.tumorTreatment = tumorTreatment;
        this.hemorrhage = hemorrhage;
        this.dailyBrushings = dailyBrushings;
        this.oralHygieneItems = oralHygieneItems;
        this.hasBleedingGums = hasBleedingGums;
        this.smokesCigarrettes = smokesCigarrettes;
        this.smokeFrequency = smokeFrequency;
        this.isTakingContraceptives = isTakingContraceptives;
        this.isPregnant = isPregnant;
        this.isBreastfeeding = isBreastfeeding;
    }

    public Antecedents() {}

    public int getId() {
        return id;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getPulmonary() {
        return pulmonary;
    }

    public String getCardiac() {
        return cardiac;
    }

    public String getNeurological() {
        return neurological;
    }

    public String getHepatic() {
        return hepatic;
    }

    public String getRenal() {
        return renal;
    }

    public String getEndocrine() {
        return endocrine;
    }

    public String getOtherDiseases() {
        return otherDiseases;
    }

    public String getMedication() {
        return medication;
    }

    public String getPrevOperations() {
        return prevOperations;
    }

    public String getTumorTreatment() {
        return tumorTreatment;
    }

    public String getHemorrhage() {
        return hemorrhage;
    }

    public int getDailyBrushings() {
        return dailyBrushings;
    }

    public String getOralHygieneItems() {
        return oralHygieneItems;
    }

    public boolean isHasBleedingGums() {
        return hasBleedingGums;
    }

    public boolean isSmokesCigarrettes() {
        return smokesCigarrettes;
    }

    public String getSmokeFrequency() {
        return smokeFrequency;
    }

    public boolean isIsTakingContraceptives() {
        return isTakingContraceptives;
    }

    public boolean isIsPregnant() {
        return isPregnant;
    }

    public boolean isIsBreastfeeding() {
        return isBreastfeeding;
    }

    public Anamnesis getAnamnesis() {
        return anamnesis;
    }
}
