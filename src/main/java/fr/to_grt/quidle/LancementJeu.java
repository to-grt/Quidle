package src.main.java.fr.to_grt.quidle;
import src.main.java.fr.to_grt.quidle.engine.PJ;
import src.main.java.fr.to_grt.quidle.engine.Objet;
import src.main.java.fr.to_grt.quidle.engine.Stat;

public class LancementJeu {

    static MonScanner scanner = new MonScanner();

    public static void main(String[] args) {

        boucleDeJeu();
    }

    public static void boucleDeJeu() {

        String  commande;
        effaceConsole();
        String  nom = prochaineLigne("Quel est votre nom ?");
        PJ      myPersonnage = new PJ(nom, "Monde de base !");
        afficheMessage(myPersonnage.hi());
        afficheMessage("Nous allons maintenant au tutoriel du jeu");
        attenteEntree();
        Objet epee = tutoriel();
        Objet bouclier = new Objet("bouclier", 1, 1, "bouclier", new Stat(1,0,1,0,0,0,0,0,0,0,0,0));
        myPersonnage.ajouter(epee);
        myPersonnage.ajouter(bouclier);
        attenteEntree();
        
        while(true) {
            effaceConsole();
            commande = prochaineLigne("Quelle est votre prochaine action ?");
            afficheMessage("La commande entrée est : " + commande);
            if(commande.equals("quitter")) {
                afficheMessage("On quitte le jeu :)  Appuie sur entrer pour quitter.");
                attenteEntree();
                return;
            }
            if(commande.equals("inventaire")) {
                myPersonnage.listeInventaire();
            }
            attenteEntree();
        }
    }
    
    public static void attenteEntree() {
        prochaineLigne("\nAppuie sur entrer pour continuer");
    }
    
    public static void effaceConsole() {

        afficheMessage("\033[H\033[2J");
    }

    public static void afficheMessage(String message) {

        System.out.println(message);
    }

    public static String prochaineLigne(String message) {

        afficheMessage(message);
        return scanner.prochaineLigne();
    }

    public static Objet tutoriel() {
        
        afficheMessage("Bienvenue dans le tutoriel, je vais vous apprendre les bases du jeu dans ce court tutoriel");
        afficheMessage("Tout d'abord pour quitter le jeu, renseignez la commande \"quitter\".");
        afficheMessage("Je vais maintenant vous donner une épée en bois :)");
        return new Objet("épée en bois", 1, 1, "épée", new Stat(0,0,1,0,0,0,0,0,0,0,0,0));
    }
}