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

    public int  getX() { return x; }
    public void setX(int pX) { x = pX; }
    
    public int  getY() { return y; }
    public void setY(int pY) { y = pY; }

    public int  getZ() { return z; }
    public void setZ(int pZ) { z = pZ; }
}
