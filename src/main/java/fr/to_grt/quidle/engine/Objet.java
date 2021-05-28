package src.main.java.fr.to_grt.quidle.engine;

public class Objet {
    

    private String  nomObjet;
    private int     poidsObjet;

    public Objet() {

        nomObjet = "Not defined";
        poidsObjet = 0;
    }

    public Objet(String pNomObjet, int pPoidsObjet) {

        nomObjet = pNomObjet;
        poidsObjet = pPoidsObjet;
    }

    public String   getNomObjet() { return nomObjet; }
    public void     setNomObjet(String pNomObjet) { nomObjet = pNomObjet; } 

    public int      getPoidsObjet() { return poidsObjet; }
    public void     setPoidsObjet(int pPoidsObjet) { poidsObjet = pPoidsObjet; }

}
