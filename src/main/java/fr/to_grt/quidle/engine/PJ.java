package src.main.java.fr.to_grt.quidle.engine;
import java.util.Scanner;  // Import the Scanner class

public class PJ extends Joueur{
    
    private String          name;
    private Emplacement     emplacement;
    private Competences     competences;
    private Inventaire      inventaire;

    public PJ(String pNomDuMonde){

        name =          fillName();
        emplacement =   new Emplacement(0,0,0,pNomDuMonde);
        competences =   new Competences();
        inventaire =    new Inventaire();
    }
    
    public String       getName() { return name; }
    public void         setName(String pName) { name = pName; }

    public Emplacement  getEmplacement() { return emplacement; }
    public void         setEmplacement(Emplacement pEmplacement) { emplacement = pEmplacement; }

    public Competences  getCompetence() { return competences; }
    public void         setCompetence(Competences pCompetences) { competences = pCompetences; }
    
    public Inventaire   getInventaire() { return inventaire; }
    public void         setInventaire(Inventaire pInventaire) { inventaire = pInventaire; }


    private String fillName(){

        try ( Scanner scanner = new Scanner(System.in); ) {

            System.out.println("Renseignez le nom de votre Personnage");
            return scanner.nextLine();
        } 
        catch (Exception e) {
            return "WOWOWOWOWO le scanner n'a pas fonctionner";
        }
    }

}
