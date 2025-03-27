package fr.diginamic.operations;

/**
 * Classe utilitaire proposant une méthode statique de calcul sur 2 valeurs double.
 */
public class Operations {

    /**
     * Méthode de classe (statique) pour effectuer une opération arithmétique
     * (+, -, *, /) sur deux nombres de type double.
     *
     * @param a        première valeur
     * @param b        deuxième valeur
     * @param operator l'opérateur à appliquer (+, -, *, /)
     * @return le résultat de l'opération, ou {@code Double.NaN} si l'opérateur n'est pas reconnu
     */
    public static double calcul(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                // Gestion d’une éventuelle division par zéro
                if (b == 0) {
                    System.out.println("Attention: division par zéro.");
                    return Double.NaN; // ou lever une exception
                }
                return a / b;
            default:
                System.out.println("Opérateur non reconnu: " + operator);
                return Double.NaN;
        }
    }
}
