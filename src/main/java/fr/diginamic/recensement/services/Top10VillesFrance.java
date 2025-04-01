package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

/**
 * Service qui affiche les 10 villes les plus peuplées de France.
 */
public class Top10VillesFrance extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> villes = new ArrayList<>(recensement.getVilles());

        // Tri décroissant par population
        villes.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Affichage du top 10
        System.out.println("🇫🇷 Top 10 des villes les plus peuplées de France :");
        for (int i = 0; i < Math.min(10, villes.size()); i++) {
            Ville ville = villes.get(i);
            System.out.printf("%d. %s (%s) - %d habitants\n",
                    i + 1,
                    ville.getNomCommune(),
                    ville.getCodeDepartement(),
                    ville.getPopulationTotale()
            );
        }
    }
}
