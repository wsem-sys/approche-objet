package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de lire un fichier de recensement et créer des objets Ville
 *
 * @author wsem
 *
 */
public class LectureFichier {

    /**
     * Méthode principale pour exécuter le programme
     *
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        // Création d'une ArrayList pour stocker les villes
        ArrayList<Ville> villes = new ArrayList<>();

        // Définition du chemin du fichier
        Path path = Paths.get("ressources/recensement.csv");

        try {
            // Lecture du contenu du fichier avec encoding UTF-8
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

            // Ignorer la première ligne (en-tête)
            boolean premiereLigne = true;

            for (String line : lines) {
                if (premiereLigne) {
                    premiereLigne = false;
                    continue;
                }

                // Découpage de la ligne en utilisant le séparateur ";"
                String[] tokens = line.split(";");

                // Nettoyage et extraction des données
                String nomCommune = tokens[6].trim();
                String codeDepartement = tokens[2].trim();
                String nomRegion = tokens[1].trim();

                // Conversion de la population (en retirant les espaces)
                String populationStr = tokens[9].trim().replace(" ", "");
                int population = Integer.parseInt(populationStr);

                // Création d'une instance de Ville et ajout à la liste
                Ville ville = new Ville(nomCommune, codeDepartement, nomRegion, population);
                villes.add(ville);
            }

            // Affichage des villes créées
            System.out.println("Nombre de villes chargées : " + villes.size());
            System.out.println("Voici les 10 premières villes :");

            for (int i = 0; i < Math.min(10, villes.size()); i++) {
                System.out.println(villes.get(i));
            }

        } catch (IOException e) {
            // Gestion des exceptions d'entrée/sortie
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Gestion des erreurs de format numérique
            System.err.println("Erreur lors de la conversion des données : " + e.getMessage());
            e.printStackTrace();
        }
    }
}