package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cette classe permet de manipuler une liste d'entiers
 * en effectuant diverses opérations : affichage, recherche de min/max,
 * suppression et modification des négatifs en positifs.
 */
public class TestListInt {

    public static void main(String[] args) {
        //  Instanciation de la liste d'entiers (Integer)
        List<Integer> listeEntiers = new ArrayList<>();

        //  Ajout EXACT des éléments : -1, 5, 7, 3, -2, 4, 8, 5
        listeEntiers.add(-1);
        listeEntiers.add(5);
        listeEntiers.add(7);
        listeEntiers.add(3);
        listeEntiers.add(-2);
        listeEntiers.add(4);
        listeEntiers.add(8);
        listeEntiers.add(5);

        //  Affichage de tous les éléments
        System.out.println("Éléments de la liste : " + listeEntiers);

        //  Affichage de la taille de la liste
        System.out.println("Taille de la liste : " + listeEntiers.size());

        //  Recherche et affichage du plus grand élément
        int max = Collections.max(listeEntiers);
        System.out.println("Le plus grand élément : " + max);

        // Recherche du plus petit élément
        int min = Collections.min(listeEntiers);
        System.out.println("Le plus petit élément : " + min);

        //  Suppression du plus petit élément
        // Attention à bien enlever l'Integer de valeur 'min'
        listeEntiers.remove(Integer.valueOf(min));
        System.out.println("Liste après suppression du plus petit élément : " + listeEntiers);

        //  Rendre positifs tous les éléments négatifs
        for (int i = 0; i < listeEntiers.size(); i++) {
            int valeur = listeEntiers.get(i);
            if (valeur < 0) {
                listeEntiers.set(i, -valeur);  // on inverse le signe
            }
        }

        // 8) Affichage de la liste résultante
        System.out.println("Liste après conversion des négatifs en positifs : " + listeEntiers);
    }
}
