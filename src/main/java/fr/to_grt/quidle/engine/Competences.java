package src.main.java.fr.to_grt.quidle.engine;
import java.util.ArrayList;
import java.util.List;

public class Competences {

    private List<Competence> listeCompetences;

    public Competences() {

        listeCompetences = new ArrayList<>();
    }

    public List<Competence> getCompetence() { return listeCompetences; }
    public void             setCompetence( List<Competence> pListeCompetences ) { listeCompetences = pListeCompetences; }
}
