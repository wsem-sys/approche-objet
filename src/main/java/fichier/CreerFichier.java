package fichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exercice 2
 * Cette classe lit le fichier recensement.csv et crée un fichier resultat.csv
 * contenant les 100 premières lignes du recensement.
 */
public class CreerFichier {

    public static void main(String[] args) {
        File inputFile = new File("src/main/java/fichier/recensement(in).csv");
        File outputFile = new File("src/main/java/fichier/resultat.csv");

        if (!inputFile.exists()) {
            System.out.println("Le fichier " + inputFile.getAbsolutePath() + " est introuvable.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String ligne;
            int compteur = 0;

            // On lit et écrit tant qu'on n'a pas atteint 100 lignes
            while ((ligne = br.readLine()) != null && compteur < 100) {
                bw.write(ligne);
                bw.newLine();
                compteur++;
            }

            System.out.println("Fichier resultat.csv créé avec les " + compteur + " premières lignes.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
