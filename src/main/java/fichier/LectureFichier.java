package fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercice 1
 * Cette classe lit le contenu du fichier recensement.csv
 * et affiche chaque ligne dans la console.
 */
public class LectureFichier {

    public static void main(String[] args) {
        // Le fichier se trouve dans le package fichier (même dossier que la classe)
        // Vérifiez bien le chemin si nécessaire.
        File file = new File("src/main/java/fichier/recensement(in).csv");

        // Vérification de l'existence du fichier
        if (!file.exists()) {
            System.out.println("Le fichier " + file.getAbsolutePath() + " est introuvable.");
            return;
        }

        // Lecture du fichier et affichage
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String ligne = br.readLine(); // Lecture de la première ligne (souvent l'entête)
            while (ligne != null) {
                System.out.println(ligne);
                ligne = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
