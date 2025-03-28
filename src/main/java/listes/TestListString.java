package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe permet de manipuler une liste de noms de villes
 * en effectuant : recherche de la plus longue, mise en majuscules
 * et suppression conditionnelle.
 */
public class TestListString {

    public static void main(String[] args) {
        //  Création de la liste de chaînes de caractères
        List<String> villes = new ArrayList<>();

        //  Ajout des noms de villes EXACTS
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        //  Recherche de la ville la plus longue
        String villeLaPlusLongue = villes.get(0);
        for (String ville : villes) {
            if (ville.length() > villeLaPlusLongue.length()) {
                villeLaPlusLongue = ville;
            }
        }
        System.out.println("La ville la plus longue est : " + villeLaPlusLongue);

        //  Mise en MAJUSCULES de toutes les villes
        for (int i = 0; i < villes.size(); i++) {
            // On transforme chaque nom en majuscules
            villes.set(i, villes.get(i).toUpperCase());
        }

        //  Suppression des villes dont le nom commence par 'N'
        // (après les avoir mises en majuscules)
        villes.removeIf(ville -> ville.startsWith("N"));

        // Affichage de la liste finale
        System.out.println("Liste finale : " + villes);
    }
}
