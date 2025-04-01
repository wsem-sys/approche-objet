package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {
        // Création d'une HashMap pour stocker le nom de l'employé (String) et son salaire (Integer).
        Map<String, Integer> mapSalaire = new HashMap<>();

        // Insertion des employés et de leur salaire respectif dans la map.
        mapSalaire.put("Paul", 1750);
        mapSalaire.put("Hicham", 1825);
        mapSalaire.put("Yu", 2250);
        mapSalaire.put("Ingrid", 2015);
        mapSalaire.put("Chantal", 2418);

        // Affichage de la taille de la map (c'est-à-dire le nombre d'entrées).
        System.out.println("Taille de la mapSalaire : " + mapSalaire.size());

        //  Affichage de toutes les paires (clé/valeur) pour vérifier l'insertion.
        System.out.println("\nListe des employés et de leurs salaires :");
        for (Map.Entry<String, Integer> entry : mapSalaire.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " - Salaire : " + entry.getValue());
        }

        //  Affichage séparé des clés et des valeurs.
        System.out.println("\nClés (noms d'employés) dans la map :");
        for (String nom : mapSalaire.keySet()) {
            System.out.println(nom);
        }

        System.out.println("\nValeurs (salaires) dans la map :");
        for (Integer salaire : mapSalaire.values()) {
            System.out.println(salaire);
        }
    }
}
