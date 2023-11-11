package models;

public class Antecedents {
    
    private final int id;
    private final String allergies;
    private final String pulmonary;
    private final String cardiac;
    private final String neurological;
    private final String hepatic;
    private final String renal;
    private final String endocrine;
    private final String otherDiseases;
    private final String medication;
    private final String prevOperations;
    private final String tumorTreatment;
    private final String hemorrhage;
    private final int dailyBrushings;
    private final String oralHygieneItems;
    private final boolean hasBleedingGums;
    private final boolean smokesCigarrettes;
    private final String smokeFrequency;
    private final boolean isTakingContraceptives;
    private final boolean isPregnant;
    private final boolean isBreastfeeding;

    public Antecedents(int id, String allergies, String pulmonary, String cardiac, String neurological, String hepatic, String renal, String endocrine, String otherDiseases, String medication, String prevOperations, String tumorTreatment, String hemorrhage, int dailyBrushings, String oralHygieneItems, boolean hasBleedingGums, boolean smokesCigarrettes, String smokeFrequency, boolean isTakingContraceptives, boolean isPregnant, boolean isBreastfeeding) {
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
    }

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
      
}
