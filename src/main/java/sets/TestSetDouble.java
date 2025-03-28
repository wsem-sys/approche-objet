package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

/**
 * Classe de test pour manipuler un Set de Double.
 *
 * <p>
 * Exercice 1 :
 * - Créer un HashSet de doubles et y insérer plusieurs valeurs.
 * - Afficher tous les éléments de la collection.
 * - Rechercher le plus grand élément de la collection.
 * - Supprimer le plus petit élément de la collection.
 * - Afficher le contenu de la collection modifiée.
 * </p>
 *
 * @author
 *   (Votre nom ou identifiant)
 *
 * @version 1.0
 */
public class TestSetDouble {

    /**
     * Méthode principale (point d'entrée) du programme.
     *
     * @param args
     *     non utilisé dans ce programme
     */
    public static void main(String[] args) {

        // 1) Instanciation d'un HashSet de Double
        Set<Double> doubleSet = new HashSet<>();

        // 2) Ajout des éléments spécifiés dans le sujet
        doubleSet.add(1.5);
        doubleSet.add(8.25);
        doubleSet.add(-7.32);
        doubleSet.add(13.3);
        doubleSet.add(-12.45);
        doubleSet.add(48.5);
        doubleSet.add(0.01);

        // 3) Affichage de tous les éléments de la collection
        System.out.println("=== Contenu initial du HashSet de Double ===");
        for (Double valeur : doubleSet) {
            System.out.println(valeur);
        }

        // 4) Recherche du plus grand élément
        Double plusGrand = Collections.max(doubleSet);
        System.out.println("\nLe plus grand élément du set est : " + plusGrand);

        // 5) Recherche du plus petit élément
        Double plusPetit = Collections.min(doubleSet);
        System.out.println("Le plus petit élément du set est : " + plusPetit);

        // 6) Suppression du plus petit élément de la collection
        doubleSet.remove(plusPetit);

        // 7) Affichage du contenu du set après suppression
        System.out.println("\n=== Contenu du HashSet après suppression du plus petit élément ===");
        for (Double valeur : doubleSet) {
            System.out.println(valeur);
        }
    }
}
