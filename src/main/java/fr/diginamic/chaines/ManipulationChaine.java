package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

/**
 * Classe executable de manipulation de chaines de caracteres.
 */
public class ManipulationChaine {

    public static void main(String[] args) {

        //  Déclaration de la chaîne
        String chaine = "Durand;Marcel;2 523.5";

        //  Afficher le premier caractère de la chaîne (charAt(0))
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        //  Afficher la longueur de la chaîne (length())
        int longueur = chaine.length();
        System.out.println("Longueur de la chaîne: " + longueur);

        // Afficher l’index du premier ‘;’ (indexOf)
        int indexPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier ';': " + indexPointVirgule);

        //  Extraire le nom de famille avec substring et indexOf
        // Le nom est "Durand", qui va de l’index 0 à l’index du premier ';'
        String nom = chaine.substring(0, indexPointVirgule);
        System.out.println("Nom de famille extrait: " + nom);

        //  Afficher le nom de famille en majuscules (toUpperCase)
        String nomMajuscules = nom.toUpperCase();
        System.out.println("Nom en MAJUSCULES: " + nomMajuscules);

        //  Afficher le nom de famille en minuscules (toLowerCase)
        String nomMinuscules = nom.toLowerCase();
        System.out.println("Nom en minuscules: " + nomMinuscules);

        // Utiliser la méthode split pour découper la chaîne sur le caractère ‘;’
        String[] morceaux = chaine.split(";");
        // Affichage du tableau obtenu
        System.out.println("=== Résultat du split ===");
        for (int i = 0; i < morceaux.length; i++) {
            System.out.println("morceaux[" + i + "]: " + morceaux[i]);
        }
        // Normalement, on obtient [ "Durand", "Marcel", "2 523.5" ]

        //  Création d’une instance de Salarie à partir des 3 morceaux
        //    - nom = "Durand"
        //    - prénom = "Marcel"
        //    - salaire = convertir "2 523.5" en double en enlevant l’espace

        // Le 3e morceau contient un espace, on le remplace par rien
        String salaireString = morceaux[2].replace(" ", "");
        // On convertit en double
        double salaire = Double.parseDouble(salaireString);

        // Instanciation de Salarie
        Salarie salarie = new Salarie(morceaux[0], morceaux[1], salaire);

        // Affichage de l’objet Salarie
        System.out.println("\n=== Affichage de l'objet Salarie ===");
        System.out.println(salarie);
        // ou bien :
        // System.out.println("Nom: " + salarie.getNom() +
        //                    ", Prénom: " + salarie.getPrenom() +
        //                    ", Salaire: " + salarie.getSalaire());
    }
}
