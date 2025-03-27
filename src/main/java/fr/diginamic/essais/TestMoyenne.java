package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * Classe de test pour la classe {@link CalculMoyenne}.
 */
public class TestMoyenne {

    public static void main(String[] args) {

        // Premier test
        System.out.println("=== Premier test de CalculMoyenne ===");
        CalculMoyenne cm1 = new CalculMoyenne();
        cm1.ajout(10);
        cm1.ajout(20);
        cm1.ajout(30);
        double moyenne1 = cm1.calcul();
        System.out.println("Moyenne cm1 = " + moyenne1 + " (attendu: 20.0)");

        // Deuxième test
        System.out.println("\n=== Deuxième test de CalculMoyenne ===");
        CalculMoyenne cm2 = new CalculMoyenne();
        cm2.ajout(5.5);
        cm2.ajout(2.3);
        cm2.ajout(7.2);
        cm2.ajout(9.0);
        double moyenne2 = cm2.calcul();
        System.out.println("Moyenne cm2 = " + moyenne2);

        // Optionnel Test d'un tableau vide
        System.out.println("\n=== Test CalculMoyenne sur un tableau vide ===");
        CalculMoyenne cm3 = new CalculMoyenne();
        double moyenne3 = cm3.calcul();
        System.out.println("Moyenne cm3 = " + moyenne3 + " (tableau vide)");
    }
}
