package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de générer un fichier contenant uniquement
 * les villes de plus de 25 000 habitants
 *
 * @author wsem
 *
 */
public class GenererFichier {

    /**
     * Méthode principale pour exécuter le programme
     *
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        // Définition du chemin du fichier source
        Path sourcePath = Paths.get("ressources/recensement.csv");

        // Définition du chemin du fichier de destination
        Path destPath = Paths.get("ressources/grandes_villes.csv");

        // Seuil de population
        final int SEUIL_POPULATION = 25000;

        try {
            // Création d'une ArrayList pour stocker les villes
            ArrayList<Ville> toutesVilles = new ArrayList<>();

            // Lecture du contenu du fichier avec encoding UTF-8
            List<String> lines = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);

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
                toutesVilles.add(ville);
            }

            // Filtrer les villes ayant plus de 25 000 habitants
            ArrayList<Ville> grandesVilles = new ArrayList<>();
            for (Ville ville : toutesVilles) {
                if (ville.getPopulationTotale() > SEUIL_POPULATION) {
                    grandesVilles.add(ville);
                }
            }

            // Préparer le contenu du fichier de sortie
            List<String> outputLines = new ArrayList<>();

            // Ajout de la ligne d'en-tête
            outputLines.add("Nom;Code département;Nom de la région;Population totale");

            // Ajout des données des grandes villes
            for (Ville ville : grandesVilles) {
                String ligne = ville.getNom() + ";"
                        + ville.getCodeDepartement() + ";"
                        + ville.getNomRegion() + ";"
                        + ville.getPopulationTotale();
                outputLines.add(ligne);
            }

            // Écriture dans le fichier de destination
            Files.write(destPath, outputLines, StandardCharsets.UTF_8);

            System.out.println("Génération réussie !");
            System.out.println("Nombre de villes trouvées : " + toutesVilles.size());
            System.out.println("Nombre de grandes villes (> " + SEUIL_POPULATION + " habitants) : " + grandesVilles.size());
            System.out.println("Fichier généré : " + destPath);

        } catch (IOException e) {
            // Gestion des exceptions d'entrée/sortie
            System.err.println("Erreur lors de la manipulation des fichiers : " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // Gestion des erreurs de format numérique
            System.err.println("Erreur lors de la conversion des données : " + e.getMessage());
            e.printStackTrace();
        }
    }
}