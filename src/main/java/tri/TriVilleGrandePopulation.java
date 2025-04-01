package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe de test pour trier les villes de plus de 25000 habitants
 * par ordre décroissant de population.
 */
public class TriVilleGrandePopulation {

    public static void main(String[] args) {
        // Liste complète des villes
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Toulouse", 493000));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Lyon", 515695));
        villes.add(new Ville("Paris", 2148000));
        villes.add(new Ville("Nice", 340017));
        villes.add(new Ville("Montfrin", 1000));
        villes.add(new Ville("Uzès", 8500));

        // Filtrage : seulement les villes de +25 000 habitants
        List<Ville> grandesVilles = villes.stream()
                .filter(v -> v.getNbHabitants() > 25000)
                .collect(Collectors.toList());

        // Tri décroissant
        grandesVilles.sort(Comparator.comparingInt(Ville::getNbHabitants).reversed());

        // Affichage du résultat
        System.out.println("Villes de plus de 25000 habitants triées par population décroissante :");
        for (Ville ville : grandesVilles) {
            System.out.println(ville);
        }
    }
}
