package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * Classe de test pour la classe {@link Operations}.
 */
public class TestOperations {

    public static void main(String[] args) {

        double a = 12.5;
        double b = 3.5;

        System.out.println("=== Test des différentes opérations ===");

        // Test addition
        double resultatAddition = Operations.calcul(a, b, '+');
        System.out.println(a + " + " + b + " = " + resultatAddition);

        // Test soustraction
        double resultatSoustraction = Operations.calcul(a, b, '-');
        System.out.println(a + " - " + b + " = " + resultatSoustraction);

        // Test multiplication
        double resultatMultiplication = Operations.calcul(a, b, '*');
        System.out.println(a + " * " + b + " = " + resultatMultiplication);

        // Test division
        double resultatDivision = Operations.calcul(a, b, '/');
        System.out.println(a + " / " + b + " = " + resultatDivision);

        // Test d'un opérateur inconnu
        System.out.println("\n=== Test opérateur inconnu ===");
        double resultatInconnu = Operations.calcul(a, b, '%');
        System.out.println("Opérateur % => " + resultatInconnu);

        // Test d'une division par zéro
        System.out.println("\n=== Test division par zéro ===");
        double resultatDivZero = Operations.calcul(a, 0, '/');
        System.out.println(a + " / 0 = " + resultatDivZero);
    }
}
