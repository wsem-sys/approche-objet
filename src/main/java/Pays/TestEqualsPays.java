package Pays;

/**
 * Classe de test pour la méthode equals() de la classe Pays.
 * Montre également la différence entre equals() et l'opérateur "==".
 */
public class TestEqualsPays {

    public static void main(String[] args) {

        // Création de plusieurs instances de Pays
        Pays p1 = new Pays("France", 67000000);
        Pays p2 = new Pays("France", 67000000);
        Pays p3 = new Pays("Allemagne", 83000000);

        // Test de la méthode equals()
        System.out.println("== Test de equals() ==");

        // p1 vs p2 : mêmes attributs (France, 67000000) => devrait être true
        System.out.println("p1.equals(p2) ? " + p1.equals(p2));

        // p1 vs p3 : attributs différents => devrait être false
        System.out.println("p1.equals(p3) ? " + p1.equals(p3));

        // Différence entre equals() et "=="
        System.out.println("\n== Différence entre equals() et == ==");
        System.out.println("p1 == p2 ? " + (p1 == p2));
        // false car p1 et p2 sont deux instances différentes en mémoire

        System.out.println("p1 == p1 ? " + (p1 == p1));
        // true car c'est la même référence

        // Modification d'un attribut pour montrer le comportement
        System.out.println("\n== Modification d'un attribut ==");
        p2.setPopulation(68000000);
        System.out.println("p1.equals(p2) après modification ? " + p1.equals(p2));
        // devrait maintenant être false, car population différente

        // Conclusion
        System.out.println("\nConclusion :");
        System.out.println("- equals() compare la valeur des attributs (contenu).");
        System.out.println("- '==' compare l'adresse mémoire (référence).");
    }
}

