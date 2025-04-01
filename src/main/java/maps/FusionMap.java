package maps;

import java.util.HashMap;
import java.util.Map;

public class FusionMap {
    public static void main(String[] args) {
        // Création de la première map (map1)
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");

        // Création de la deuxième map (map2)
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Bleu");
        map2.put(5, "Jaune");
        map2.put(6, "Orange");

        // TODO Développements à réaliser ci-dessous
        // 1) Créer une map appelée map3 qui contient l'ensemble des données
        //    des deux maps précédentes
        Map<Integer, String> map3 = new HashMap<>();

        //  Fusionner map1 et map2 dans map3
        map3.putAll(map1);
        map3.putAll(map2);

        //  Afficher le contenu de map3
        System.out.println("Contenu de map3 après fusion :");
        for (Map.Entry<Integer, String> entry : map3.entrySet()) {
            System.out.println("Clé : " + entry.getKey() + " - Valeur : " + entry.getValue());
        }

        // Affichage de la taille de map3
        System.out.println("\nTaille de map3 : " + map3.size());
    }
}
