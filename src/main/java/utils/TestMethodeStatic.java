package utils;

/**
 * La classe TestMethodeStatic démontre l'utilisation de deux méthodes statiques
 * de la classe {@link Integer} :
 * <p>
 * </p>
 *
 * wsem
 *
 */
public class TestMethodeStatic {

    /**
     * Point d'entrée du programme (méthode main).
     * @param args Arguments passés en ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {

        /*
         * 1) Déclarer une variable chaîne de type String
         *    Cette variable contient un nombre (sous forme de texte).
         *    Par exemple : "12"
         */
        String chaine = "12";

        /*
         * 2) Convertir la chaîne de caractères en entier
         *    en utilisant la méthode statique parseInt de la classe Integer.
         *    parseInt(String s) retourne un int, contrairement à valueOf(String s) qui retourne un Integer.
         */
        int valeurConvertie = Integer.parseInt(chaine);

        /*
         * 3) Déclarer deux variables de type int
         *    - premierEntier prend la valeur convertie depuis la chaîne
         *    - secondEntier est un nombre au choix (exemple : 25)
         */
        int premierEntier = valeurConvertie;
        int secondEntier = 25;

        /*
         * 4) Utiliser la méthode statique max(int a, int b) de la classe Integer
         *    pour déterminer la valeur maximale entre premierEntier et secondEntier.
         */
        int maximum = Integer.max(premierEntier, secondEntier);

        /*
         * 5) Afficher le résultat dans la console
         *    Grâce à System.out.println, on visualise la valeur du maximum.
         */
        System.out.println("Le maximum entre "
                + premierEntier
                + " et "
                + secondEntier
                + " est : "
                + maximum);

    }
}
