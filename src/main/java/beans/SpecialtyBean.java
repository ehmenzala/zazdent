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
import services.SpecialtyService;
import models.Specialty;

@Named
@RequestScoped
public class SpecialtyBean {

    @Inject
    private SpecialtyService specialtyService;
    private List<Specialty> specialties;
    
    private String specialtyName;
    private String specialtyDescription;
    private int specialtyId;
    
    @PostConstruct
    public void init() {
        fillSpecialtiesList();
    }
    
    public void fillSpecialtiesList() {
        specialties = specialtyService.getAll();
    }
    
    public void addSpecialty() {
        Specialty newSpecialty = new Specialty(specialtyName, specialtyDescription);
        specialtyService.add(newSpecialty);
    }
    
    public void modifySpecialty() {
        Specialty currentSpecialty = new Specialty(specialtyId, specialtyName, specialtyDescription);
        specialtyService.update(currentSpecialty);
    }
    
    public void removeSpecialty() {
        specialtyService.delete(specialtyId);
    }
    
    public void reload() throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    }

    /* Getters and Setters */
    
    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public String getSpecialtyDescription() {
        return specialtyDescription;
    }

    public void setSpecialtyDescription(String specialtyDescription) {
        this.specialtyDescription = specialtyDescription;
    }

    public int getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }
}
