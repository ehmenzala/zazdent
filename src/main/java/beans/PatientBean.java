package beans;

import jakarta.annotation.ManagedBean;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.util.List;
import models.Guardian;
import services.PatientService;
import models.Patient;
import services.GuardianService;

@Named
@ManagedBean
public class PatientBean {

    @Inject
    private PatientService patientService;
    
    @Inject GuardianService guardianService;
    private List<Patient> patients;
    
    private int patientId;
    private String patientName;
    private String patientLastNameFather;
    private String patientLastNameMother;
    private int patientAge;
    private String patientBirthplace;
    private String patientBirthdate;
    private String patientDni;
    private String patientEmail;
    private String patientOccupation;
    private String patientPhone;
    private String patientMaritalStatus;
    private String patientAddress;
    private String patientDistrict;
    
    private int guardianId;
    
    @PostConstruct
    public void init() {
        fillPatientsList();
    }
    
    public void fillPatientsList() {
        patients = patientService.getAll();
    }

    public List<Patient> getPatients() {
        return patients;
    }
    
    public void addPatient() {
        Guardian guardian = guardianService.getById(guardianId);
        Patient.MaritalStatus maritalStatus = Patient.MaritalStatus.valueOf(patientMaritalStatus);
        LocalDate birthDate = LocalDate.parse(patientBirthdate);
        Patient patient = new Patient(
                guardian,
                patientLastNameFather,
                patientLastNameMother,
                patientName,
                patientAge,
                birthDate,
                patientBirthplace,
                patientDni,
                patientEmail,
                patientOccupation,
                patientPhone,
                maritalStatus,
                patientAddress,
                patientDistrict
        );
        patientService.add(patient);
    }
    
    public void updatePatient() {
        Patient.MaritalStatus maritalStatus = Patient.MaritalStatus.valueOf(patientMaritalStatus);
        LocalDate birthDate = LocalDate.parse(patientBirthdate);
        Patient patient = new Patient(
                patientId,
                patientLastNameFather,
                patientLastNameMother,
                patientName,
                patientAge,
                birthDate,
                patientBirthplace,
                patientDni,
                patientEmail,
                patientOccupation,
                patientPhone,
                maritalStatus,
                patientAddress,
                patientDistrict
        );
        patientService.update(patient);
    }
    
    public void removePatient() {
        patientService.delete(patientId);
    }
    
    /* Getters and Setters */

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientLastNameFather() {
        return patientLastNameFather;
    }

    public void setPatientLastNameFather(String patientLastNameFather) {
        this.patientLastNameFather = patientLastNameFather;
    }

    public String getPatientLastNameMother() {
        return patientLastNameMother;
    }

    public void setPatientLastNameMother(String patientLastNameMother) {
        this.patientLastNameMother = patientLastNameMother;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientBirthplace() {
        return patientBirthplace;
    }

    public void setPatientBirthplace(String patientBirthplace) {
        this.patientBirthplace = patientBirthplace;
    }

    public String getPatientDni() {
        return patientDni;
    }

    public void setPatientDni(String patientDni) {
        this.patientDni = patientDni;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientOccupation() {
        return patientOccupation;
    }

    public void setPatientOccupation(String patientOccupation) {
        this.patientOccupation = patientOccupation;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientMaritalStatus() {
        return patientMaritalStatus;
    }

    public void setPatientMaritalStatus(String patientMaritalStatus) {
        this.patientMaritalStatus = patientMaritalStatus;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientDistrict() {
        return patientDistrict;
    }

    public void setPatientDistrict(String patientDistrict) {
        this.patientDistrict = patientDistrict;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientBirthdate() {
        return patientBirthdate;
    }

    public void setPatientBirthdate(String patientBirthdate) {
        this.patientBirthdate = patientBirthdate;
    }

    public int getGuardianId() {
        return guardianId;
    }
    
    public void setGuardianId(int guardianId) {
        this.guardianId = guardianId;
    }
}
