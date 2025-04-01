package fichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Cette classe lit le contenu du fichier CSV (recensement(in).csv),
 * instancie pour chaque ligne un objet {@link Ville},
 * et stocke tous ces objets dans une {@link ArrayList}.
 *
 * <p>
 * Le fichier CSV doit respecter le format suivant (séparateur : ';') :
 * <ul>
 *   <li>Code Région</li>
 *   <li>Nom Région</li>
 *   <li>Code Département</li>
 *   <li>Code Commune</li>
 *   <li>Nom Commune</li>
 *   <li>Population</li>
 * </ul>
 * </p>
 *
 * @author
 */
public class LireFichierAvecInstanciation {

    /**
     * Point d'entrée de l'application.
     *
     * @param args Arguments de la ligne de commande (non utilisés).
     */
    public static void main(String[] args) {

        // 1) Définir le chemin vers le fichier CSV.
        //    Ajustez ce chemin en fonction de l'emplacement réel de votre fichier.
        File file = new File("src/main/java/fichier/recensement(in).csv");

        // 2) Vérifier si le fichier existe pour éviter toute erreur.
        if (!file.exists()) {
            System.err.println("Le fichier " + file.getAbsolutePath() + " est introuvable.");
            return; // On arrête l'exécution si le fichier est introuvable
        }

        // 3) Déclarer une liste pour stocker toutes les villes lues.
        ArrayList<Ville> listeVilles = new ArrayList<>();

        // 4) Lecture du fichier et instanciation des objets Ville.
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            // Lecture de la première ligne (en-tête), si nécessaire
            String ligne = br.readLine(); // On suppose que la première ligne est l'en-tête

            // Parcourir le fichier ligne par ligne
            while ((ligne = br.readLine()) != null) {
                // Séparer la ligne en différents champs grâce au séparateur ';'
                String[] tokens = ligne.split(";");

                // Vérifier qu'on a bien le nombre de colonnes attendu
                if (tokens.length < 6) {
                    // Si la ligne est incomplète, on peut décider de l'ignorer ou d'afficher un avertissement
                    System.err.println("Ligne ignorée (données incomplètes) : " + ligne);
                    continue;
                }

                // Récupérer chaque champ (en supposant l'ordre défini dans l'exercice)
                String codeRegion      = tokens[0];
                String nomRegion       = tokens[1];
                String codeDepartement = tokens[2];
                String codeCommune     = tokens[3];
                String nomCommune      = tokens[4];
                int population         = 0;

                // Tenter de parser la population (conversion String -> int)
                try {
                    population = Integer.parseInt(tokens[5]);
                } catch (NumberFormatException e) {
                    System.err.println("Population non valide sur la ligne : " + ligne);
                    // On peut continuer ou ignorer cette ligne selon le besoin
                    continue;
                }

                // 5) Instancier un objet Ville avec ces données
                Ville ville = new Ville(
                        codeRegion,
                        nomRegion,
                        codeDepartement,
                        codeCommune,
                        nomCommune,
                        population
                );

                // 6) Ajouter cet objet Ville à la liste
                listeVilles.add(ville);
            }

        } catch (IOException e) {
            // Afficher la pile d'erreurs si un problème de lecture survient
            e.printStackTrace();
        }

        // 7) Vérifier le contenu de la liste (ex. affichage dans la console)
        System.out.println("Nombre de villes lues : " + listeVilles.size());
        for (Ville v : listeVilles) {
            System.out.println(v);
        }
    }
}
