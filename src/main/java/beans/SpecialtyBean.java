package beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import services.SpecialtyService;
import models.Specialty;

@Named
@RequestScoped
public class SpecialtyBean {

    @Inject
    SpecialtyService specialtyService;
    List<Specialty> specialties;
    
    @PostConstruct
    public void init() {
        fillSpecialtiesList();
    }
    
    public void fillSpecialtiesList() {
        specialties = specialtyService.getAll();
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }
}
