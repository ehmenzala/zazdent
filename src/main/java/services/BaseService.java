package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BaseService {

  protected EntityManager getEntityManager() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("medlab-persistence");
    return entityManagerFactory.createEntityManager();
  }
}
