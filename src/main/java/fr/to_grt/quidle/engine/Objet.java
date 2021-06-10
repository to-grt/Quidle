package src.main.java.fr.to_grt.quidle.engine;

public class Objet {
    
    private String      nom;
    private int         poids;
    private int         valeur;
    private String      type;
    private Stat        masque;

    public Objet() {

        nom =       "Not defined";
        poids =     0;
        valeur =    0;
        type =      "Null";
        masque =    new Stat();
    }

    public Objet(String pNom, int pPoids, int pValeur, String pType, Stat pMasque) {

        nom =       pNom;
        poids =     pPoids;
        valeur =    pValeur;
        type =      pType;
        masque =    pMasque;
    }

    public String   getNom() { return nom; }
    public void     setNom(String pNom) { nom = pNom; }

    public int      getPoids() { return poids; }
    public void     setPoids(int pPoids) { poids = pPoids; }    
    
    public int      getPoidsObjet() { return poids; }
    public void     setPoidsObjet(int pPoids) { poids = pPoids; }

    public int      getValeur() { return valeur; }
    public void     setValeur(int pValeur) { valeur = pValeur; }

    public String   getType() { return type; }
    public void     setType(String pType) { type = pType; }

    public Stat     getMasque() { return masque; }
    public void     setMasque(Stat pMasque) { masque = pMasque; }
}
