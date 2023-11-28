package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import models.Patient;
import repositories.PatientRepository;

public class PatientService extends BaseService implements PatientRepository {

    @Override
    public int add(Patient patient) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(patient);
            entityManager.getTransaction().commit();
            //return patient.getId();
            return 1;
        } catch (Exception e) {
            System.out.println("[PatientService]: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        return 0;
    }

    @Override
    public Patient getById(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Patient.class, id);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Patient patient = null;
            try {
                patient = entityManager.getReference(Patient.class, id);
                patient.getId();
            } catch (EntityNotFoundException e) {
                System.out.println("EntityNotFoundException: " + e.getMessage());
            }
            entityManager.remove(patient);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[PatientService]: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void update(Patient patient) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Patient updatedPatient = entityManager.merge(patient);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Patient> getAll() {
        EntityManager entityManager = getEntityManager();
        List<Patient> patients = entityManager.createQuery("SELECT p FROM Patient p", Patient.class).getResultList();
        return patients;
    }
}
