package beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import services.DentistService;
import models.Dentist;

@Named
@RequestScoped
public class DentistBean {

    @Inject
    DentistService dentistService;
    private List<Dentist> dentists;
    
    private int dentistId;
    private String dentistName;
    private String dentistLastNameFather;
    private String dentistLastNameMother;
    private String dentistDni;

    @PostConstruct
    public void init() {
        fillDentistsList();
    }
    
    public void reload() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }
    
    public void fillDentistsList() {
        dentists = dentistService.getAll();
    }
    
    public void addDentist() {
        Dentist dentist = new Dentist(
                dentistName,
                dentistLastNameFather,
                dentistLastNameMother,
                dentistDni
        );
        dentistService.add(dentist);
    }
    
    public void updateDentist() {
        Dentist currentDentist = new Dentist(
                dentistId,
                dentistName,
                dentistLastNameFather,
                dentistLastNameMother,
                dentistDni
        );
        dentistService.update(currentDentist);
    }
    
    public void removeDentist() {
        dentistService.delete(dentistId);
    }
    
    /* Getters and Setters */

    public List<Dentist> getDentists() {
        return dentists;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getDentistLastNameFather() {
        return dentistLastNameFather;
    }

    public void setDentistLastNameFather(String dentistLastNameFather) {
        this.dentistLastNameFather = dentistLastNameFather;
    }

    public String getDentistLastNameMother() {
        return dentistLastNameMother;
    }

    public void setDentistLastNameMother(String dentistLastNameMother) {
        this.dentistLastNameMother = dentistLastNameMother;
    }

    public String getDentistDni() {
        return dentistDni;
    }

    public void setDentistDni(String dentistDni) {
        this.dentistDni = dentistDni;
    }

    public int getDentistId() {
        return dentistId;
    }

    public void setDentistId(int dentistId) {
        this.dentistId = dentistId;
    }
}
