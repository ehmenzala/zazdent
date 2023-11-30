package beans;

import jakarta.annotation.ManagedBean;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import services.PatientService;
import models.Patient;

@Named
@ManagedBean
public class PatientBean {

    @Inject
    PatientService patientService;
    List<Patient> patients;
    
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
}
