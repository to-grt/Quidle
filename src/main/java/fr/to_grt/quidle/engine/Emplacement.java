package src.main.java.fr.to_grt.quidle.engine;

public class Emplacement {

    int     x;
    int     y;
    int     z;
    String  nomDuMonde; //en attendant la classe Monde :) ou autre

    public Emplacement(int pX, int pY, int pZ, String pNomDuMonde) {
        x = pX;
        y = pY;
        z = pZ;
        nomDuMonde = pNomDuMonde;
    }
    
}
