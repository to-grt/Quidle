package src.main.java.fr.to_grt.quidle;
import src.main.java.fr.to_grt.quidle.engine.PJ;
import java.util.Scanner;

public class LancementJeu {

    public static void main(String[] args) {

        boucleDeJeu();
    }

    public static void boucleDeJeu() {

        String commande;
        PJ myPersonnage = new PJ("Monde de base !");
        afficheMessage(myPersonnage.hi());
        
        while(true) {
            commande = entreeUtilisateur("Quelle est votre prochaine action ?");
            afficheMessage("La commande entrée est : " + commande);
            if(commande.equals("quit")) {
                afficheMessage("On quitte le jeu :)");
                return;
            }
        }
    }

    public static String entreeUtilisateur(String message) {

        Scanner scanner = new Scanner(System.in);
        afficheMessage(message);
        return scanner.nextLine();
    }

    public static void afficheMessage(String message) {

        System.out.println(message);
    }
}