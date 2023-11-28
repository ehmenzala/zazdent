package repositories;

import java.util.List;
import models.Patient;

public interface PatientRepository {
  
   public int add(Patient patient);
    
    public Patient getById(int id);
    
    public void delete (int id);
    
    public void update (Patient newPatient);
    
    public List<Patient> getAll();
    
}
