package models;

public class StomatologicalExam {

    private final int id;
    private final IntraoralExam intraoralExam;
    private final ExtraoralExam extraoralExam;

    public StomatologicalExam(int id, IntraoralExam intraoralExam, ExtraoralExam extraoralExam) {
        this.id = id;
        this.intraoralExam = intraoralExam;
        this.extraoralExam = extraoralExam;
    }

    public int getId() {
        return id;
    }

    public IntraoralExam getIntraoralExam() {
        return intraoralExam;
    }

    public ExtraoralExam getExtraoralExam() {
        return extraoralExam;
    }

}
