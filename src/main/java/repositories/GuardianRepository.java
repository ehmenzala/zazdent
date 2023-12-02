package repositories;

import java.util.List;
import models.Guardian;

public interface GuardianRepository {

    public void add(Guardian guardian);

    public Guardian getById(int id);

    public void delete(int id);

    public void update(Guardian newGuardian);

    public List<Guardian> getAll();
}
