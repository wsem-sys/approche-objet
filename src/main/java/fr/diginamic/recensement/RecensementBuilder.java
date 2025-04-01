package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe utilitaire qui lit un fichier CSV de recensement et retourne un objet Recensement.
 */
public class RecensementBuilder {

    /**
     * Charge un fichier CSV et retourne un objet Recensement.
     * @param filePath chemin vers le fichier .csv
     * @return Recensement
     * @throws IOException en cas d'erreur de lecture
     */
    public static Recensement charger(String filePath) throws IOException {
        List<Ville> villes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String ligne;
            // Lire la première ligne (en-têtes) et l’ignorer
            reader.readLine();

            while ((ligne = reader.readLine()) != null) {
                String[] tokens = ligne.split(";", -1); // -1 pour garder toutes les colonnes

                // Vérification minimale
                if (tokens.length < 10 || tokens[6].isEmpty()) continue;

                try {
                    String codeRegion = tokens[0].trim();
                    String nomRegion = tokens[1].trim();
                    String codeDepartement = tokens[2].trim();
                    String codeCommune = tokens[5].trim();
                    String nomCommune = tokens[6].trim();
                    int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", "").trim());

                    Ville ville = new Ville(codeRegion, nomRegion, codeDepartement,
                            codeCommune, nomCommune, populationTotale);
                    villes.add(ville);
                } catch (NumberFormatException e) {
                    System.err.println("Erreur parsing population, ligne ignorée : " + ligne);
                }
            }
        }

        return new Recensement(villes);
    }
}
