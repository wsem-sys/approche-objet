package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;
import java.util.Map.Entry;

/**
 * Service qui affiche le top 10 des régions les plus peuplées.
 */
public class Top10RegionsPop extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Map : nom région -> population totale
        Map<String, Integer> mapRegion = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String region = ville.getNomRegion();
            int population = ville.getPopulationTotale();
            mapRegion.put(region, mapRegion.getOrDefault(region, 0) + population);
        }

        // Tri décroissant des entrées de la map par population
        List<Entry<String, Integer>> topRegions = new ArrayList<>(mapRegion.entrySet());
        topRegions.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Affichage du top 10
        System.out.println("Top 10 des régions les plus peuplées :");
        for (int i = 0; i < Math.min(10, topRegions.size()); i++) {
            Entry<String, Integer> entry = topRegions.get(i);
            System.out.printf("%d. %s - %d habitants\n", i + 1, entry.getKey(), entry.getValue());
        }
    }
}
