package src.main.java.fr.to_grt.quidle;
import java.util.Scanner;

class MonScanner {

    Scanner leScanner;

    public MonScanner() {

        leScanner = new Scanner(System.in);
    }

    public String prochaineLigne() {

        return leScanner.nextLine();
    }

}