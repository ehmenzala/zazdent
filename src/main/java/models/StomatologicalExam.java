package models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class StomatologicalExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @OneToOne
    @JoinColumn(name = "extraoral_exam_id")
    private ExtraoralExam extraoralExam;
    
    @OneToOne
    @JoinColumn(name = "intraoral_exam_id")
    private IntraoralExam intraoralExam;
    
    @OneToOne(mappedBy = "somatologicalExam")
    private ClinicalExam clinicalExam;

    public StomatologicalExam(int id, IntraoralExam intraoralExam, ExtraoralExam extraoralExam, ClinicalExam clinicalExam) {
        this.id = id;
        this.intraoralExam = intraoralExam;
        this.extraoralExam = extraoralExam;
        this.clinicalExam = clinicalExam;
    }
    
    public StomatologicalExam(IntraoralExam intraoralExam, ExtraoralExam extraoralExam) {
        this.intraoralExam = intraoralExam;
        this.extraoralExam = extraoralExam;
    }
    
    public StomatologicalExam() {}

    public int getId() {
        return id;
    }

    public IntraoralExam getIntraoralExam() {
        return intraoralExam;
    }

    public ExtraoralExam getExtraoralExam() {
        return extraoralExam;
    }

    public ClinicalExam getClinicalExam() {
        return clinicalExam;
    }
}
