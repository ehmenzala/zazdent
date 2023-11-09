package models;

public class IntraoralExam {

    private final int id;
    private final String lips;
    private final String salivaryGlands;
    private final String cheeks;
    private final String hardPalate;
    private final String tongue;
    private final String softPalate;
    private final String frenulae;
    private final String oropharynx;
    private final String floorOfMouth;
    private final String gums;

    public IntraoralExam(int id, String lips, String salivaryGlands, String cheeks, String hardPalate, String tongue, String softPalate, String frenulae, String oropharynx, String floorOfMouth, String gums) {
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
    }

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
    
    
    
}
