package src.main.java.fr.to_grt.quidle.engine;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PJ extends Joueur{
    
    private String          nom;
    private Emplacement     emplacement;
    private Competences     competences;
    private Inventaire      inventaire;
    private List<Membre>    membres;

    public PJ(String pNom, String pNomDuMonde){

        nom =           pNom;
        emplacement =   new Emplacement(0,0,pNomDuMonde);
        competences =   new Competences();
        inventaire =    new Inventaire();
        membres =       new ArrayList<>();
        creerMembres();
    }
    
    public String       getNom() { return nom; }
    public void         setNom(String pNom) { nom = pNom; }

    public Emplacement  getEmplacement() { return emplacement; }
    public void         setEmplacement(Emplacement pEmplacement) { emplacement = pEmplacement; }

    public Competences  getCompetence() { return competences; }
    public void         setCompetence(Competences pCompetences) { competences = pCompetences; }
    
    public Inventaire   getInventaire() { return inventaire; }
    public void         setInventaire(Inventaire pInventaire) { inventaire = pInventaire; }

    public List<Membre> getMembres() { return membres; }
    public void         setMembres(List<Membre> pMembres) { membres = pMembres; }

    public String hi() { 
        String phrase = "Bonjour " + nom + " ! Heureux de faire ta connaissance mon petit loulou ! <3";
        return(phrase);
    }

    public void parler(String message) {

        System.out.println(message);
    }

    public void ajouter(Objet pObjet) {

        parler(inventaire.ajouterObjet(pObjet));
    }

    public void retirer(Objet pObjet) {

        parler(inventaire.retirerObjet(pObjet));
    }

    public void listeInventaire() {

        parler("J'ai dans mon inventaire :");
        parler(inventaire.listeInventaire());
    }

    public void creerMembres() {

        ajouterMembre("bras droit");
        ajouterMembre("bras gauche");
    }

    public void ajouterMembre(String pNomMembre) {

        membres.add( new Membre(pNomMembre) );
    }

    public void retirerMembre(Membre pMembre) {

        membres.remove(pMembre);
    }

    public void equiperObjet(String pNomObjet, String pMembre) {

        Objet objet = inventaire.objetParNom(pNomObjet);
        if( objet == null ) {
            parler("L'objet " + pNomObjet + " n'est pas présent dans votre inventaire, vous ne pouvez pas l'équiper.");
            return;
        }

        Iterator<Membre> iterator = membres.iterator();
        while (iterator.hasNext()) {
            
            Membre membre = iterator.next();
            if( membre.getNom().equals(pMembre) ) {

                if( membre.getObjet() != null ) {
                    parler("Je porte déjà quelque chose ici :/");
                    return;
                }

                if( membre.estCompatible(objet) ) {
                    inventaire.retirerObjet(objet);
                    membre.equiperObjet(objet);
                    parler( "L'objet " + objet.getNom() + " a bien été équipé sur " + membre.getNom() );
                    break;
                }
                else {
                    parler("Cet objet n'est pas compatible avec ce membre ;(");
                    break;
                }
            }
        }
    }

    public void desequiperObjet(String pNomObjet, String pMembre) {

        Iterator<Membre> iterator = membres.iterator();
        while (iterator.hasNext()) {
            
            Membre membre = iterator.next();
            if( membre.getNom().equals(pMembre) ) {

                if( membre.getObjet().getNom().equals(pNomObjet) ) {

                    Objet objet = membre.getObjet();
                    if( inventaire.peutAjouter(objet) ) {

                        membre.enleverObjet();
                        inventaire.ajouterObjet(objet);
                        parler( "L'objet " + objet.getNom() + " a bien été déséquipé sur " + membre.getNom() );
                        break;
                    }
                    else {
                        parler("Vous n'avez pas assez de place dans votre inventaire pour ça :/");
                        break;
                    }
                }
            }
        }
    }
}