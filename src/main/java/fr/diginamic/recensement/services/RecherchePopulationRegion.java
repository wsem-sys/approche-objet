package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

/**
 * Service qui affiche la population totale d’une région donnée.
 */
public class RecherchePopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("🔎 Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine().trim();

        int populationTotale = 0;
        boolean trouve = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationTotale += ville.getPopulationTotale();
                trouve = true;
            }
        }

        if (trouve) {
            System.out.println("Population totale de la région " + nomRegion + " : " + populationTotale);
        } else {
            System.out.println(" Aucune région trouvée avec ce nom : " + nomRegion);
        }
    }
}
