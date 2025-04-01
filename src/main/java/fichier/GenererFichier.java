package fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Exercice GenererFichier
 * <p>
 * Cette classe lit le fichier recensement(in).csv, instancie des objets {@link Ville}
 * et génère un fichier de sortie contenant uniquement les villes dont la population
 * dépasse 25 000 habitants. Seules les informations utiles sont conservées dans le fichier :
 * <ul>
 *   <li>Nom (de la commune)</li>
 *   <li>Code département</li>
 *   <li>Nom de la région</li>
 *   <li>Population totale</li>
 * </ul>
 * La première ligne du fichier de sortie est une ligne d’entête.
 * </p>
 *
 * Quelques rappels :
 * <ul>
 *   <li>Découper une chaîne : <code>String[] tokens = maChaine.split(";");</code></li>
 *   <li>Retirer les espaces superflus : <code>maValeur = maValeur.trim().replaceAll(" ", "");</code></li>
 * </ul>
 */
public class GenererFichier {

    /**
     * Point d'entrée de l'application.
     *
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {
        // Chemin du fichier source
        File fichierSource = new File("src/main/java/fichier/recensement(in).csv");
        if (!fichierSource.exists()) {
            System.err.println("Le fichier " + fichierSource.getAbsolutePath() + " est introuvable.");
            return;
        }

        // Constitution de la liste de villes à partir du fichier source
        ArrayList<Ville> listeVilles = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichierSource))) {
            // Lecture de la ligne d'entête
            String ligne = br.readLine();

            // Lecture de chaque ligne du fichier
            while ((ligne = br.readLine()) != null) {
                // Découper la ligne en tokens en se basant sur le séparateur ';'
                String[] tokens = ligne.split(";");
                if (tokens.length < 6) {
                    System.err.println("Données incomplètes pour la ligne: " + ligne);
                    continue;
                }
                // Récupérer et nettoyer les données
                String codeRegion = tokens[0].trim().replaceAll(" ", "");
                String nomRegion = tokens[1].trim();
                String codeDepartement = tokens[2].trim().replaceAll(" ", "");
                String codeCommune = tokens[3].trim().replaceAll(" ", "");
                String nomCommune = tokens[4].trim();
                int population = 0;
                try {
                    population = Integer.parseInt(tokens[5].trim().replaceAll(" ", ""));
                } catch (NumberFormatException e) {
                    System.err.println("Population non valide pour la ligne: " + ligne);
                    continue;
                }

                // Instanciation d'un objet Ville
                Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, population);
                listeVilles.add(ville);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Affichage du nombre total de villes lues pour debug
        System.out.println("Nombre total de villes lues : " + listeVilles.size());

        // Filtrer les villes de plus de 25 000 habitants
        ArrayList<Ville> villesPlus25000 = new ArrayList<>();
        for (Ville v : listeVilles) {
            if (v.getPopulation() > 25000) {
                villesPlus25000.add(v);
            }
        }
        System.out.println("Nombre de villes avec plus de 25 000 habitants : " + villesPlus25000.size());

        // Génération du fichier de sortie
        File fichierSortie = new File("src/main/java/fichier/recensement_plus_25000.csv");

        try (FileWriter fw = new FileWriter(fichierSortie)) {
            // Écrire la ligne d'en-tête
            fw.write("Nom;Code département;Nom de la région;Population totale" + System.lineSeparator());

            // Écrire les villes filtrées
            for (Ville v : villesPlus25000) {
                fw.write(v.getNomCommune() + ";" +
                        v.getCodeDepartement() + ";" +
                        v.getNomRegion() + ";" +
                        v.getPopulation() + System.lineSeparator());
            }
            System.out.println("Fichier généré avec succès : " + fichierSortie.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
