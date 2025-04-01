package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Classe de test pour trier les villes par nombre d'habitants (ordre croissant).
 */
public class TriVillePopulation {

    public static void main(String[] args) {
        // Création de la liste des villes
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Toulouse", 493000));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Lyon", 515695));
        villes.add(new Ville("Paris", 2148000));
        villes.add(new Ville("Nice", 340017));

        // Tri croissant par population
        villes.sort(Comparator.comparingInt(Ville::getNbHabitants));

        // Affichage du résultat
        System.out.println("Villes triées par population croissante :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
