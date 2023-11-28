package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import repositories.DentistRepository;
import models.Dentist;

public class DentistService extends BaseService implements DentistRepository {

    @Override
    public void add(Dentist dentist) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(dentist);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[DentistService]: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void delete(int id) {

        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Dentist dentist = null;
            try {
                dentist = entityManager.getReference(Dentist.class, id);
                dentist.getId();
            } catch (EntityNotFoundException e) {
                System.out.println("[DentistService - EntityNotFoundException] " + e.getMessage());
            }
            entityManager.remove(dentist);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[DentistServiec]: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void update(Dentist dentist) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(dentist);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Dentist get(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Dentist.class, id);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Dentist> getAll() {
        EntityManager entityManager = getEntityManager();
        List<Dentist> dentists = entityManager.createQuery("SELECT d FROM Dentist d", Dentist.class).getResultList();
        return dentists;
    }
}
