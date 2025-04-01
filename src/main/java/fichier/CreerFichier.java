package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant d'extraire et de créer un fichier contenant les 100 premières lignes
 * d'un fichier de recensement
 *
 * @author Étudiant
 *
 */
public class CreerFichier {

    /**
     * Méthode principale pour exécuter le programme
     *
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        // Définition du chemin du fichier source
        Path sourcePath = Paths.get("ressources/recensement.csv");

        // Définition du chemin du fichier de destination
        Path destPath = Paths.get("ressources/recensement_100.csv");

        try {
            // Lecture du contenu du fichier source
            List<String> allLines = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);

            // Création d'une liste pour stocker les 100 premières lignes
            List<String> first100Lines = new ArrayList<>();

            // Extraction des 100 premières lignes (ou moins si le fichier en contient moins)
            int linesToExtract = Math.min(100, allLines.size());

            for (int i = 0; i < linesToExtract; i++) {
                first100Lines.add(allLines.get(i));
            }

            // Écriture des 100 premières lignes dans le fichier de destination
            Files.write(destPath, first100Lines, StandardCharsets.UTF_8);

            System.out.println("Extraction réussie !");
            System.out.println(linesToExtract + " lignes ont été extraites et écrites dans le fichier " + destPath);

        } catch (IOException e) {
            // Gestion des exceptions d'entrée/sortie
            System.err.println("Erreur lors de la manipulation des fichiers : " + e.getMessage());
            e.printStackTrace();
        }
    }
}