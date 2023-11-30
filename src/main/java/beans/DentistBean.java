package beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import services.DentistService;
import models.Dentist;

@Named
@RequestScoped
public class DentistBean {

    @Inject
    DentistService dentistService;
    private List<Dentist> dentists;

    @PostConstruct
    public void init() {
        fillDentistsList();
    }
    
    public void fillDentistsList() {
        dentists = dentistService.getAll();
    }

    public List<Dentist> getDentists() {
        return dentists;
    }
}
