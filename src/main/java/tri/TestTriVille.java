package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe de test pour le tri des objets Ville.
 */
public class TestTriVille {

    /**
     * Méthode principale permettant de tester le tri d'une liste de villes.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        // 1. Création d'une liste de Ville
        List<Ville> listeVilles = new ArrayList<>();

        // 2. Ajout d'instances de Ville
        listeVilles.add(new Ville("Lyon", 515695));
        listeVilles.add(new Ville("Marseille", 861635));
        listeVilles.add(new Ville("Paris", 2148327));
        listeVilles.add(new Ville("Bordeaux", 257068));
        listeVilles.add(new Ville("Nice", 342637));

        // Affichage initial (non trié)
        System.out.println("Liste de villes avant tri :");
        for (Ville ville : listeVilles) {
            System.out.println(" - " + ville);
        }

        // 3. Tri de la liste (appel implicite de Ville.compareTo)
        Collections.sort(listeVilles);

        // Affichage après tri par nom
        System.out.println("\nListe de villes après tri par nom (ordre alphabétique) :");
        for (Ville ville : listeVilles) {
            System.out.println(" - " + ville);
        }
    }
}
