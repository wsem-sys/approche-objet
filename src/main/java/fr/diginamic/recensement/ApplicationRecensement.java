package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe principale de l'application. Affiche un menu utilisateur et exécute les traitements demandés.
 */
public class ApplicationRecensement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Recensement recensement = null;

        try {
            recensement = RecensementBuilder.charger("ressources/recensement.csv");
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement du fichier : " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Population d'une ville");
            System.out.println("2. Population d’un département");
            System.out.println("3. Population d’une région");
            System.out.println("4. Top 10 des régions les plus peuplées");
            System.out.println("5. Top 10 des départements les plus peuplés");
            System.out.println("6. Top 10 des villes les plus peuplées d’une région");
            System.out.println("7. Top 10 des villes les plus peuplées d’un département");
            System.out.println("8. Top 10 des villes les plus peuplées de France");
            System.out.println("9. Quitter");
            System.out.print("Choix : ");

            int choix = Integer.parseInt(scanner.nextLine());
            MenuService service = null;

            switch (choix) {
                case 1:
                    service = new RecherchePopulationVille();
                    break;
                case 2:
                    service = new RecherchePopulationDepartement();
                    break;
                case 3:
                    service = new RecherchePopulationRegion();
                    break;
                case 4:
                    service = new Top10RegionsPop();
                    break;
                case 5:
                    service = new Top10DepartementsPop();
                    break;
                case 6:
                    service = new Top10VillesRegion();
                    break;
                case 7:
                    service = new Top10VillesDepartement();
                    break;
                case 8:
                    service = new Top10VillesFrance();
                    break;
                case 9:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide !");
                    break;
            }

            if (service != null) {
                service.traiter(recensement, scanner);
            }
        }
    }
}
