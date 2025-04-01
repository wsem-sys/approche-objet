package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;
import java.util.Map.Entry;

/**
 * Service qui affiche le top 10 des départements les plus peuplés.
 */
public class Top10DepartementsPop extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Map : code département -> population totale
        Map<String, Integer> mapDepartement = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String departement = ville.getCodeDepartement();
            int population = ville.getPopulationTotale();
            mapDepartement.put(departement, mapDepartement.getOrDefault(departement, 0) + population);
        }

        // Tri décroissant
        List<Entry<String, Integer>> topDepts = new ArrayList<>(mapDepartement.entrySet());
        topDepts.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Affichage top 10
        System.out.println(" Top 10 des départements les plus peuplés :");
        for (int i = 0; i < Math.min(10, topDepts.size()); i++) {
            Entry<String, Integer> entry = topDepts.get(i);
            System.out.printf("%d. Département %s - %d habitants\n", i + 1, entry.getKey(), entry.getValue());
        }
    }
}
