package src.main.java.fr.to_grt.quidle.engine;
import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Objet> listeInventaire;
    private int         limitePoids;

    public Inventaire() {

        listeInventaire =   new ArrayList<>();
        limitePoids =       20;
    }

    public List<Objet>  getListeInventaire() { return listeInventaire; }
    public void         setListeInventaire(List<Objet> pListeInventaire) { listeInventaire = pListeInventaire; }

    public int          getLimitePoids() { return limitePoids; }
    public void         setLimitePoids(int pLimitePoids) { limitePoids = pLimitePoids; }
}
