package src.main.java.fr.to_grt.quidle.engine;

public class Objet {
    
    static String[] listeType = {"épée", "lance", "bouclier", "gants", "bottes", "plastron", "jambières", "robe", "collants", "dagues", "claymore", "casque", "capuche", "anneaux", "bague", "collier", "bracelet"}
    private String  nom;
    private int     poids;
    private int     valeur;
    private String  type;
    static String[] listeMateriaux = {"bois", "silex", "pierre", "bronze", "fer", "fer", "fer renforcé", "en fer"};

    public Objet() {

        nom =       "Not defined";
        poids =     0;
        valeur =    0;
        type =      "Null";
    }

    public Objet(String pNom, int pPoids, int pValeur) {

        nom =      pNom;
        poids =    pPoids;
        valeur =   pValeur;
    }

    public String   getNom() { return nom; }
    public void     setNom(String pNom) { nom = pNom; } 
s
    public int      getPoidsObjet() { return poids; }
    public void     setPoidsObjet(int pPoids) { poids = pPoids; }

    public int      getValeur() { return valeur; }
    public void     setValeur(int pValeur) { valeur = pValeur; }
}
