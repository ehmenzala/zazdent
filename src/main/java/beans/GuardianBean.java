package beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import services.GuardianService;
import models.Guardian;

@Named
@RequestScoped
public class GuardianBean {
    
    @Inject
    private GuardianService guardianService;
    private List<Guardian> guardians;
    
    private int guardianId;
    private String guardianName;
    private String guardianLastNameFather;
    private String guardianLastNameMother;
    private String guardianDni;
    private String guardianRelationship;
    
    @PostConstruct
    public void init() {
        fillGuardiansList();
    }
    
    public void fillGuardiansList() {
        guardians = guardianService.getAll();
    }
    
    public void addGuardian() {
        Guardian guardian = new Guardian(guardianLastNameFather, guardianLastNameMother, guardianName, guardianDni, guardianRelationship);
        guardianService.add(guardian);
    }
    
    public void updateGuardian() {
        Guardian guardian = new Guardian(guardianId, guardianLastNameFather, guardianLastNameMother, guardianName, guardianDni, guardianRelationship);
        guardianService.update(guardian);
    }
    
    public void removeGuardian() {
        guardianService.delete(guardianId);
    }
    
    /* Getters and Setters */

    public List<Guardian> getGuardians() {
        return guardians;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianLastNameFather() {
        return guardianLastNameFather;
    }

    public void setGuardianLastNameFather(String guardianLastNameFather) {
        this.guardianLastNameFather = guardianLastNameFather;
    }

    public String getGuardianLastNameMother() {
        return guardianLastNameMother;
    }

    public void setGuardianLastNameMother(String guardianLastNameMother) {
        this.guardianLastNameMother = guardianLastNameMother;
    }

    public String getGuardianDni() {
        return guardianDni;
    }

    public void setGuardianDni(String guardianDni) {
        this.guardianDni = guardianDni;
    }

    public String getGuardianRelationship() {
        return guardianRelationship;
    }

    public void setGuardianRelationship(String guardianRelationship) {
        this.guardianRelationship = guardianRelationship;
    }

    public int getGuardianId() {
        return guardianId;
    }

    public void setGuardianId(int guardianId) {
        this.guardianId = guardianId;
    }
}
