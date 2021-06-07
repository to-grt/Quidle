package src.main.java.fr.to_grt.quidle.engine;

public class PJ extends Joueur{
    
    private String          nom;
    private Emplacement     emplacement;
    private Competences     competences;
    private Inventaire      inventaire;

    public PJ(String pNom, String pNomDuMonde){

        nom =           pNom;
        emplacement =   new Emplacement(0,0,pNomDuMonde);
        competences =   new Competences();
        inventaire =    new Inventaire();
    }
    
    public String       getNom() { return nom; }
    public void         setNom(String pNom) { nom = pNom; }

    public Emplacement  getEmplacement() { return emplacement; }
    public void         setEmplacement(Emplacement pEmplacement) { emplacement = pEmplacement; }

    public Competences  getCompetence() { return competences; }
    public void         setCompetence(Competences pCompetences) { competences = pCompetences; }
    
    public Inventaire   getInventaire() { return inventaire; }
    public void         setInventaire(Inventaire pInventaire) { inventaire = pInventaire; }

    public String hi() { 
        String phrase = "Bonjour " + nom + " ! Heureux de faire ta connaissance mon petit loulou ! <3";
        return(phrase);
    }

    public void parler(String message) {

        System.out.println(message);
    }

    public void ajouter(Objet pObjet) {

        parler(inventaire.ajoutObjet(pObjet));
    }

    public void retirer(Objet pObjet) {

        parler(inventaire.retraitObjet(pObjet));
    }

    public void listeInventaire() {

        parler("J'ai dans mon inventaire :");
        parler(inventaire.listeInventaire());
    }
}