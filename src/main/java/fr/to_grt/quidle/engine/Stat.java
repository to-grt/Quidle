package src.main.java.fr.to_grt.quidle.engine;

public class Stat {

    private int vitalite;
    private int taille;
    private int force;
    private int dexterite;
    private int intelligence;
    private int ame;            //quantite de mana
    private int chance;
    private int vitesse;
    private int endurance;
    private int mental;
    private int perception;
    private int cuisine;        //qualite des plats

    public Stat() {
        vitalite =      0;
        taille =        0;
        force =         0;
        dexterite =     0;
        intelligence =  0;
        ame =           0;
        chance =        0;
        vitesse =       0;
        endurance =     0;
        mental =        0;
        perception =    0;
        cuisine =       0;
    }

    public Stat(int pVitalite, int pTaille, int pForce, int pDexterite, int pIntelligence, int pAme, int pChance, int pVitesse, int pEndurance, int pMental, int pPerception, int pCuisine) {

        vitalite =      pVitalite;
        taille =        pTaille;
        force =         pForce;
        dexterite =     pDexterite;
        intelligence =  pIntelligence;
        ame =           pAme;
        chance =        pChance;
        vitesse =       pVitesse;
        endurance =     pEndurance;
        mental =        pMental;
        perception =    pPerception;
        cuisine =       pCuisine;
    }

    public int   getVitalite() { return vitalite; }
    public void  setVitalite(int pVitalite) { vitalite = pVitalite; }

    public int   getTaille() { return taille; }
    public void  setTaille(int pTaille) { taille = pTaille; }

    public int   getForce() { return force; }
    public void  setForce(int pForce) { force = pForce; }
    
    public int   getDexterite() { return dexterite; }
    public void  setDexterite(int pDexterite) { dexterite = pDexterite; }

    public int   getIntelligence() { return intelligence; }
    public void  setIntelligence(int pIntelligence) { intelligence = pIntelligence; }

    public int   getAme() { return ame; }
    public void  setAme(int pAme) { ame = pAme; }

    public int   getChance() { return chance; }
    public void  setChance(int pChance) { chance = pChance; }

    public int   getVitesse() { return vitesse; }
    public void  setVitesse(int pVitesse) { vitesse = pVitesse; }

    public int   getEndurance() { return endurance; }
    public void  setEndurance(int pEndurance) { endurance = pEndurance; }

    public int   getMental() { return mental; }
    public void  setMental(int pMental) { mental = pMental; }

    public int   getPerception() { return perception; }
    public void  setPerception(int pPerception) { perception = pPerception; }

    public int   getCuisine() { return cuisine; }
    public void  setCuisine(int pCuisine) { cuisine = pCuisine; }

    public void addition(Stat masque) {

        vitalite +=      masque.getVitalite();
        taille +=        masque.getTaille();
        force +=         masque.getForce();
        dexterite +=     masque.getDexterite();
        intelligence +=  masque.getIntelligence();
        ame +=           masque.getAme();
        chance +=        masque.getChance();
        vitesse +=       masque.getVitesse();
        endurance +=     masque.getEndurance();
        mental +=        masque.getMental();
        perception +=    masque.getPerception();
        cuisine +=       masque.getCuisine();
    }

    public void soustraction(Stat masque) {

        vitalite -=      masque.getVitalite();
        taille -=        masque.getTaille();
        force -=         masque.getForce();
        dexterite -=     masque.getDexterite();
        intelligence -=  masque.getIntelligence();
        ame -=           masque.getAme();
        chance -=        masque.getChance();
        vitesse -=       masque.getVitesse();
        endurance -=     masque.getEndurance();
        mental -=        masque.getMental();
        perception -=    masque.getPerception();
        cuisine -=       masque.getCuisine();
    }
}
