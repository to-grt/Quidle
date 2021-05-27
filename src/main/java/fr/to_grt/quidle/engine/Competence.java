package src.main.java.fr.to_grt.quidle.engine;

public class Competence {
    
    private String  nomCompetence;
    private int     coutCompetence;

    public Competence() {

        nomCompetence = "";
        coutCompetence = 0;
    }

    public Competence(String pNomCompetence, int pCoutCompetence) {

        nomCompetence = pNomCompetence;
        coutCompetence = pCoutCompetence;
    }

    public String getNomCompetence() { return nomCompetence; }
    public void setNomCompetence(String pNomCompetence) { nomCompetence = pNomCompetence; }

    public int getCoutCompetence() { return coutCompetence; }
    public void setCoutCompetence(int pCoutCompetence) { coutCompetence = pCoutCompetence; }
}