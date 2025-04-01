package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {
    public static void main(String[] args) {
        // Création d'une HashMap pour associer un code (Integer) à une ville (String).
        Map<Integer, String> mapVilles = new HashMap<>();

        // Insertion des villes initiales
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout d'autres villes (optionnel selon les consignes)
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Affichage de toutes les clés (codes postaux ou département)
        System.out.println("Liste des clés (codes) :");
        for (Integer code : mapVilles.keySet()) {
            System.out.println(code);
        }

        // Affichage de toutes les valeurs (noms des villes)
        System.out.println("\nListe des valeurs (villes) :");
        for (String ville : mapVilles.values()) {
            System.out.println(ville);
        }

        // Affichage de la taille de la map
        System.out.println("\nTaille de la mapVilles : " + mapVilles.size());

        //  Suppression d'une entrée, par exemple la ville avec le code 13 (Marseille)
        mapVilles.remove(13);

        //  Affichage de la map après suppression
        System.out.println("\nContenu de la mapVilles après suppression de la clé 13 :");
        for (Map.Entry<Integer, String> entry : mapVilles.entrySet()) {
            System.out.println("Code : " + entry.getKey() + " - Ville : " + entry.getValue());
        }
    }
}
