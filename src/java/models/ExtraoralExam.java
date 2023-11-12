
package models;

public class ExtraoralExam {
    private final int id;
    private final String skull;
    private final String ganglion;
    private final String face;
    private final String skin;
    private final String facialSymmetry;
    private final String atm;
    private final String mouthOpening;
    private final String chewingMuscles;

    public ExtraoralExam(int id, String skull, String ganglion, String face, String skin, String facialSymmetry, String atm, String mouthOpening, String chewingMuscles) {
        this.id = id;
        this.skull = skull;
        this.ganglion = ganglion;
        this.face = face;
        this.skin = skin;
        this.facialSymmetry = facialSymmetry;
        this.atm = atm;
        this.mouthOpening = mouthOpening;
        this.chewingMuscles = chewingMuscles;
    }

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
    
}
