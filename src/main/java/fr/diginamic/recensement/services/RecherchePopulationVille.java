package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

/**
 * Service qui affiche la population d'une ville donnée.
 */
public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine().trim();

        boolean trouvee = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + ville.getPopulationTotale());
                trouvee = true;
                break;
            }
        }

        if (!trouvee) {
            System.out.println("Ville non trouvée : " + nomVille);
        }
    }
}
