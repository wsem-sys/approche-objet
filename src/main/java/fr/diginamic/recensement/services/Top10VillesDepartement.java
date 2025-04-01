package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

/**
 * Service qui affiche les 10 villes les plus peuplées d’un département donné.
 */
public class Top10VillesDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département : ");
        String codeDept = scanner.nextLine().trim();

        // Filtrage des villes du département
        List<Ville> villesFiltrees = new ArrayList<>();
        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDept)) {
                villesFiltrees.add(ville);
            }
        }

        if (villesFiltrees.isEmpty()) {
            System.out.println("Aucun résultat pour le département : " + codeDept);
            return;
        }

        // Tri décroissant par population
        villesFiltrees.sort((v1, v2) -> Integer.compare(v2.getPopulationTotale(), v1.getPopulationTotale()));

        // Affichage top 10
        System.out.println("Top 10 des villes les plus peuplées du département " + codeDept + " :");
        for (int i = 0; i < Math.min(10, villesFiltrees.size()); i++) {
            Ville ville = villesFiltrees.get(i);
            System.out.printf("%d. %s - %d habitants\n", i + 1, ville.getNomCommune(), ville.getPopulationTotale());
        }
    }
}
