package repositories;

import models.Specialty;
import java.util.List;

public interface SpecialtyRepository {

  public void add(Specialty specialty);

  public void delete(int id);

  public void update(Specialty specialty);

  public Specialty getById(int id);

  public List<Specialty> getAll();
}
