package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe exécutable permet de tester la liste d'objets Ville.
 */
public class TestVilles {

    public static void main(String[] args) {
        // La classe Ville est déjà créée

        //  Création et initialisation de l'ArrayList<Ville>
        List<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne", 47800));
        listeVilles.add(new Ville("Narbonne", 53400));
        listeVilles.add(new Ville("Lyon", 484000));
        listeVilles.add(new Ville("Foix", 9700));
        listeVilles.add(new Ville("Pau", 77200));
        listeVilles.add(new Ville("Marseille", 850700));
        listeVilles.add(new Ville("Tarbes", 40600));

        //  Recherche de la ville la plus peuplée
        Ville villeLaPlusPeuplee = listeVilles.get(0);
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
                villeLaPlusPeuplee = ville;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villeLaPlusPeuplee);

        // Suppression de la ville la moins peuplée
        Ville villeLaMoinsPeuplee = listeVilles.get(0);
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
                villeLaMoinsPeuplee = ville;
            }
        }
        listeVilles.remove(villeLaMoinsPeuplee);
        System.out.println("Après suppression de la moins peuplée (" + villeLaMoinsPeuplee + ") :");
        System.out.println(listeVilles);

        //  Passage en majuscules pour les villes de plus de 100000 habitants
        for (Ville ville : listeVilles) {
            if (ville.getNbHabitants() > 100000) {
                // On modifie le nom pour qu'il soit en majuscules
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        //  Affichage de la liste résultante
        System.out.println("Liste finale après modifications :");
        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }
    }
}
