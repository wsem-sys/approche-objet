package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * Classe de test pour les classes Salarie et Pigiste.
 */
public class TestIntervenant {

    public static void main(String[] args) {

        // Instance d'un Salarié
        Salarie salarie = new Salarie("Ishinigami", "Wsem", 2500.0);
        System.out.println("Salaire du salarie: " + salarie.getSalaire());

        System.out.println("\n=== Donnees salarie ===");
        salarie.afficherDonnees();

        // Instance d'un Pigiste
        Pigiste pigiste = new Pigiste("Uzumaki", "luffy", 12, 85.0);
        System.out.println("\nSalaire du pigiste: " + pigiste.getSalaire());

        System.out.println("\n=== Donnees pigiste ===");
        pigiste.afficherDonnees();
    }
}
