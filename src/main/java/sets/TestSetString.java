package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe de test pour manipuler un Set de String.
 *
 * <p>
 * Exercice 2 :
 * - Créer un HashSet de String contenant plusieurs pays.
 * - Rechercher le pays ayant le plus grand nombre de lettres.
 * - Supprimer ce pays du Set.
 * - Afficher le contenu de la collection modifiée.
 * </p>
 *
 * @author
 *   (Votre nom ou identifiant)
 *
 * @version 1.0
 */
public class TestSetString {

    /**
     * Méthode principale (point d'entrée) du programme.
     *
     * @param args
     *     non utilisé dans ce programme
     */
    public static void main(String[] args) {

        // 1) Instanciation d'un HashSet de String
        Set<String> pays = new HashSet<>();

        // 2) Ajout des éléments spécifiés dans le sujet
        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        // 3) Recherche du pays ayant le plus grand nombre de lettres
        String paysPlusLong = null;
        for (String p : pays) {
            if (paysPlusLong == null || p.length() > paysPlusLong.length()) {
                paysPlusLong = p;
            }
        }
        System.out.println("Le pays avec le plus grand nombre de lettres est : " + paysPlusLong);

        // 4) Suppression de ce pays du Set
        pays.remove(paysPlusLong);

        // 5) Affichage du contenu du set après suppression
        System.out.println("\n=== Contenu du HashSet après suppression du pays le plus long ===");
        for (String p : pays) {
            System.out.println(p);
        }
    }
}
