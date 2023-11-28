package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "intraoral_exam")
public class IntraoralExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lips")
    private String lips;

    @Column(name = "salivary_glands")
    private String salivaryGlands;

    @Column(name = "cheeks")
    private String cheeks;

    @Column(name = "hard_palate")
    private String hardPalate;

    @Column(name = "tongue")
    private String tongue;

    @Column(name = "soft_palate")
    private String softPalate;

    @Column(name = "frenulae")
    private String frenulae;

    @Column(name = "oropharynx")
    private String oropharynx;

    @Column(name = "floor_of_mouth")
    private String floorOfMouth;

    @Column(name = "gums")
    private String gums;

    @OneToOne(mappedBy = "intraoralExam")
    private StomatologicalExam stomatologicalExam;

    public IntraoralExam(int id, String lips, String salivaryGlands, String cheeks, String hardPalate, String tongue, String softPalate, String frenulae, String oropharynx, String floorOfMouth, String gums, StomatologicalExam stomatologicalExam) {
        this.id = id;
        this.lips = lips;
        this.salivaryGlands = salivaryGlands;
        this.cheeks = cheeks;
        this.hardPalate = hardPalate;
        this.tongue = tongue;
        this.softPalate = softPalate;
        this.frenulae = frenulae;
        this.oropharynx = oropharynx;
        this.floorOfMouth = floorOfMouth;
        this.gums = gums;
        this.stomatologicalExam = stomatologicalExam;
    }

    public IntraoralExam(String lips, String salivaryGlands, String cheeks, String hardPalate, String tongue, String softPalate, String frenulae, String oropharynx, String floorOfMouth, String gums) {
        this.lips = lips;
        this.salivaryGlands = salivaryGlands;
        this.cheeks = cheeks;
        this.hardPalate = hardPalate;
        this.tongue = tongue;
        this.softPalate = softPalate;
        this.frenulae = frenulae;
        this.oropharynx = oropharynx;
        this.floorOfMouth = floorOfMouth;
        this.gums = gums;
    }
    
    public IntraoralExam() {}

    public int getId() {
        return id;
    }

    public String getLips() {
        return lips;
    }

    public String getSalivaryGlands() {
        return salivaryGlands;
    }

    public String getCheeks() {
        return cheeks;
    }

    public String getHardPalate() {
        return hardPalate;
    }

    public String getTongue() {
        return tongue;
    }

    public String getSoftPalate() {
        return softPalate;
    }

    public String getFrenulae() {
        return frenulae;
    }

    public String getOropharynx() {
        return oropharynx;
    }

    public String getFloorOfMouth() {
        return floorOfMouth;
    }

    public String getGums() {
        return gums;
    }

    public StomatologicalExam getStomatologicalExam() {
        return stomatologicalExam;
    }
}
