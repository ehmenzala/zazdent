package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "extraoral_exam")
public class ExtraoralExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "skull")
    private String skull;
    
    @Column(name = "ganglion")
    private String ganglion;
    
    @Column(name = "face")
    private String face;
    
    @Column(name = "skin")
    private String skin;
    
    @Column(name = "facial_symmetry")
    private String facialSymmetry;
    
    @Column(name = "atm")
    private String atm;
    
    @Column(name = "mouth_opening")
    private String mouthOpening;
    
    @Column(name = "chewing_muscles")
    private String chewingMuscles;
    
    @OneToOne(mappedBy = "extraoralExam")
    private StomatologicalExam stomatologicalExam;

    public ExtraoralExam(int id, String skull, String ganglion, String face, String skin, String facialSymmetry, String atm, String mouthOpening, String chewingMuscles, StomatologicalExam stomatologicalExam) {
        this.id = id;
        this.skull = skull;
        this.ganglion = ganglion;
        this.face = face;
        this.skin = skin;
        this.facialSymmetry = facialSymmetry;
        this.atm = atm;
        this.mouthOpening = mouthOpening;
        this.chewingMuscles = chewingMuscles;
        this.stomatologicalExam = stomatologicalExam;
    }
    
    public ExtraoralExam(String skull, String ganglion, String face, String skin, String facialSymmetry, String atm, String mouthOpening, String chewingMuscles) {
        this.skull = skull;
        this.ganglion = ganglion;
        this.face = face;
        this.skin = skin;
        this.facialSymmetry = facialSymmetry;
        this.atm = atm;
        this.mouthOpening = mouthOpening;
        this.chewingMuscles = chewingMuscles;
    }
    
    public ExtraoralExam() {}

    public int getId() {
        return id;
    }

    public String getSkull() {
        return skull;
    }

    public String getGanglion() {
        return ganglion;
    }

    public String getFace() {
        return face;
    }

    public String getSkin() {
        return skin;
    }

    public String getFacialSymmetry() {
        return facialSymmetry;
    }

    public String getAtm() {
        return atm;
    }

    public String getMouthOpening() {
        return mouthOpening;
    }

    public String getChewingMuscles() {
        return chewingMuscles;
    }
    
    public StomatologicalExam getStomatologicalExam() {
        return stomatologicalExam;
    }
}
