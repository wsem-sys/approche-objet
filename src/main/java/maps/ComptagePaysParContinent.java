package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe exécutable qui crée une liste de pays et compte le nombre de pays par continent.
 */
public class ComptagePaysParContinent {
    public static void main(String[] args) {
        // 1) Création d'une liste de pays
        List<Pays> listePays = new ArrayList<>();

        // Ajout des pays dans la liste (valeurs approximatives)
        listePays.add(new Pays("France", 65_000_000, "Europe"));
        listePays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        listePays.add(new Pays("Belgique", 10_000_000, "Europe"));
        listePays.add(new Pays("Russie", 150_000_000, "Asie"));
        listePays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        listePays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        listePays.add(new Pays("Australie", 20_000_000, "Océanie"));

        // 2) Création d'une HashMap pour compter le nombre de pays par continent
        //    - Clé : String (nom du continent)
        //    - Valeur : Integer (nombre de pays dans ce continent)
        Map<String, Integer> comptageParContinent = new HashMap<>();

        // 3) Parcours de la liste pour alimenter la HashMap
        for (Pays pays : listePays) {
            String continent = pays.getContinent();
            // Si le continent existe déjà dans la map, on incrémente le compteur,
            // sinon on initialise le compteur à 1.
            if (comptageParContinent.containsKey(continent)) {
                int compteurActuel = comptageParContinent.get(continent);
                comptageParContinent.put(continent, compteurActuel + 1);
            } else {
                comptageParContinent.put(continent, 1);
            }
        }

        // 4) Affichage des pays pour vérifier la liste initiale
        System.out.println("Liste des pays :");
        for (Pays pays : listePays) {
            System.out.println(pays);
        }

        // 5) Affichage du résultat du comptage par continent
        System.out.println("\nComptage du nombre de pays par continent :");
        for (Map.Entry<String, Integer> entry : comptageParContinent.entrySet()) {
            System.out.println("Continent : " + entry.getKey() + " - Nombre de pays : " + entry.getValue());
        }
    }
}
