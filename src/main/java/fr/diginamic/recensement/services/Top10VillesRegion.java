package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

/**
 * Service qui affiche les 10 villes les plus peuplées d'une région donnée.
 */
public class Top10VillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine().trim();

        // Filtrage des villes appartenant à la région
        List<Ville> villesFiltrees = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                villesFiltrees.add(ville);
            }
        }

        if (villesFiltrees.isEmpty()) {
            System.out.println("Aucune ville trouvée dans la région : " + nomRegion);
            return;
        }

        // Tri décroissant par population
        villesFiltrees.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Affichage du top 10
        System.out.println("Top 10 des villes les plus peuplées de la région " + nomRegion + " :");
        for (int i = 0; i < Math.min(10, villesFiltrees.size()); i++) {
            Ville ville = villesFiltrees.get(i);
            System.out.printf("%d. %s - %d habitants\n", i + 1, ville.getNomCommune(), ville.getPopulationTotale());
        }
    }
}
