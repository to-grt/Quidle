package src.main.java.fr.to_grt.quidle.engine;

public class Membre {
    
    private String  nom;
    private String  compabilite;
    private Objet   objet;

    public Membre() {

        nom =           "";
        compabilite =   "";
        objet =         null;
    }

    public Membre(String pNom) {

        nom =   pNom;
        objet = null;

        if( nom.equals("bras droit")) {

            compabilite = "epee";
        }
        else if( nom.equals("bras gauche")) {

            compabilite = "bouclier";
        }
    }

    public String   getNom() { return nom; }
    public void     setNom(String pNom) { nom = pNom; }

    public String   getCompabilite() { return compabilite; }
    public void     setCompabilite(String pCompabilite) { compabilite = pCompabilite; }

    public Objet    getObjet() { return objet; }
    public void     setObjet(Objet pObjet) { objet = pObjet; }

    public boolean estCompatible(Objet pObjet) {

        return pObjet.getType().equals(compabilite);
    }

    public void equiperObjet(Objet pObjet) {

        objet = pObjet;
    }

    public Objet enleverObjet() {

        var ancienObjet = objet;
        objet = null;
        return ancienObjet;
    }
}
