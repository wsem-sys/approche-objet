package maps;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {
    public static void main(String[] args) {
        // Création d'une map associant le nom d'une ville (String) à un objet Ville
        Map<String, Ville> mapVilles = new HashMap<>();

        // Insertion de quelques villes avec leur nombre d'habitants
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        // 1) Afficher la liste des villes avant suppression
        System.out.println("Liste initiale des villes :");
        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            System.out.println("Clé : " + entry.getKey() + " -> " + entry.getValue());
        }

        // 2) Rechercher la ville qui a le moins d'habitants
        String villeMoinsHabitantsKey = null;
        int minHabitants = Integer.MAX_VALUE; // Valeur très élevée pour commencer la comparaison

        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            Ville currentVille = entry.getValue();
            if (currentVille.getNbHabitants() < minHabitants) {
                minHabitants = currentVille.getNbHabitants();
                villeMoinsHabitantsKey = entry.getKey();
            }
        }

        // 3) Supprimer la ville qui a le moins d'habitants
        if (villeMoinsHabitantsKey != null) {
            mapVilles.remove(villeMoinsHabitantsKey);
            System.out.println("\nVille avec le moins d'habitants supprimée : " + villeMoinsHabitantsKey);
        }

        // 4) Réafficher la liste des villes après suppression
        System.out.println("\nListe des villes après suppression :");
        for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {
            System.out.println("Clé : " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
