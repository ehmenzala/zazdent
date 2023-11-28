package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import models.Specialty;
import repositories.SpecialtyRepository;

public class SpecialtyService extends BaseService implements SpecialtyRepository {

    @Override
    public void add(Specialty specialty) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(specialty);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[SpecialtyService]: " + e.getMessage());
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
            Specialty specialty = null;
            try {
                specialty = entityManager.getReference(Specialty.class, id);
                specialty.getId();
            } catch (EntityNotFoundException e) {
                System.out.println("EntityNotFoundException: " + e.getMessage());
            }
            entityManager.remove(specialty);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[SpecialtyService]: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void update(Specialty specialty) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Specialty updatedSpecialty = entityManager.merge(specialty);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Specialty getById(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Specialty.class, id);
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Specialty> getAll() {
        EntityManager entityManager = getEntityManager();
        List<Specialty> specialties = entityManager.createQuery("SELECT s FROM Specialty s", Specialty.class).getResultList();
        return specialties;
    }
}
