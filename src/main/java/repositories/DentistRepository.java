package repositories;

import models.Dentist;
import java.util.List;

public interface DentistRepository {

    public void add(Dentist doctor);

    public void delete(int id);

    public void update(Dentist doctor);

    public Dentist get(int id);

    public List<Dentist> getAll();
}
