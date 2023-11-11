package models;

public class ClinicalExam {

    private final int id;
    private final StomatologicalExam stomatologicalExam;
    private final Dentist dentist;
    private final double weight;
    private final double height;
    private final double bloodPressure;
    private final double pulse;
    private final double temperature;
    private final double breathingRate;

    public ClinicalExam(int id, StomatologicalExam stomatologicalExam, Dentist dentist, double weight, double height, double bloodPressure, double pulse, double temperature, double breathingRate) {
        this.id = id;
        this.stomatologicalExam = stomatologicalExam;
        this.dentist = dentist;
        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.temperature = temperature;
        this.breathingRate = breathingRate;
    }

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

    
}
