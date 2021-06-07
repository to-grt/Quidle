package src.main.java.fr.to_grt.quidle.engine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventaire {

    private List<Objet> listeInventaire;
    private int         poids;
    private int         limitePoids;

    public Inventaire() {

        listeInventaire =   new ArrayList<>();
        poids =             0;
        limitePoids =       20;
    }

    public List<Objet>  getListeInventaire() { return listeInventaire; }
    public void         setListeInventaire(List<Objet> pListeInventaire) { listeInventaire = pListeInventaire; }

    public int          getPoids() { return poids; }
    public void         setPoids(int pPoids) { poids = pPoids; }

    public int          getLimitePoids() { return limitePoids; }
    public void         setLimitePoids(int pLimitePoids) { limitePoids = pLimitePoids; }



    public String ajoutObjet(Objet pObjet) {

        if( poids + pObjet.getPoidsObjet() <= limitePoids) {
            listeInventaire.add(pObjet);
            poids += pObjet.getPoidsObjet();
            return "L'objet à été ajouté à l'inventaire";
        }
        return "L'objet est trop lourd !";
    }

    public String retraitObjet(Objet pObjet) {

        listeInventaire.remove(pObjet);
        poids -= pObjet.getPoidsObjet();
        return "L'objet à été retiré de l'inventaire";
    }

    public String listeInventaire() {

        Iterator<Objet> iterator = listeInventaire.iterator();
        String liste = "";
        while (iterator.hasNext()) {
            liste += iterator.next().getNom() + ", ";
        }
        return liste;
    }
}
