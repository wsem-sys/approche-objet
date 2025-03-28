package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe illustre la création et l'utilisation d'une ArrayList d'entiers.
 */
public class CreationListe {

    /**
     * Méthode principale qui va créer une liste d'entiers et afficher sa taille.
     *
     * @param args Arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Création d'une liste d'entiers (Integer) en utilisant ArrayList
        List<Integer> listeEntiers = new ArrayList<>();

        // Boucle pour ajouter les nombres de 1 à 100 dans la liste
        for (int i = 1; i <= 100; i++) {
            listeEntiers.add(i);
        }

        // Affichage de la taille de la liste grâce à la méthode size()
        System.out.println("La taille de la liste est : " + listeEntiers.size());
    }
}
