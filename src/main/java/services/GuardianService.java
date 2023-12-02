package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import models.Guardian;
import repositories.GuardianRepository;

public class GuardianService extends BaseService implements GuardianRepository {

    @Override
    public void add(Guardian guardian) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(guardian);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[GuardianService]: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    @Override
    public Guardian getById(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            return entityManager.find(Guardian.class, id);
        } finally {
            entityManager.close();
        }
    }
    
    @Override
    public void delete(int id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Guardian guardian = null;
            try {
                guardian = entityManager.getReference(Guardian.class, id);
                guardian.getId();
            } catch (EntityNotFoundException e) {
                System.out.println("EntityNotFoundException: " + e.getMessage());
            }
            entityManager.remove(guardian);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("[GuardianService]: " + e.getMessage());
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    @Override
    public void update(Guardian guardian) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Guardian updatedGuardian = entityManager.merge(guardian);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }
    
    @Override
    public List<Guardian> getAll() {
        EntityManager entityManager = getEntityManager();
        List<Guardian> guardians = entityManager.createQuery("SELECT g FROM Guardian g", Guardian.class).getResultList();
        return guardians;
    }
}
