package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

/**
 * Service qui affiche la population totale d’un département donné.
 */
public class RecherchePopulationDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print(" Entrez le code du département : ");
        String codeDept = scanner.nextLine().trim();

        int populationTotale = 0;
        boolean trouve = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDept)) {
                populationTotale += ville.getPopulationTotale();
                trouve = true;
            }
        }

        if (trouve) {
            System.out.println(" Population totale du département " + codeDept + " : " + populationTotale);
        } else {
            System.out.println("Aucun département trouvé avec ce code : " + codeDept);
        }
    }
}
