package fr.diginamic.operations;

import java.util.Arrays;

/**
 * Classe permettant de stocker des valeurs dans un tableau dynamique
 * et de calculer la moyenne de ces valeurs.
 */
public class CalculMoyenne {

    /** Tableau qui contient les valeurs. Initialisé à vide. */
    private double[] valeurs;

    /**
     * Constructeur par défaut: crée un tableau vide (longueur 0).
     */
    public CalculMoyenne() {
        this.valeurs = new double[0];
    }

    /**
     * Ajoute une nouvelle valeur au tableau en l'agrandissant.
     *
     * @param valeur la valeur à ajouter
     */
    public void ajout(double valeur) {
        // On copie l'ancien tableau dans un nouveau, plus grand d'une case
        double[] tableauPlusGrand = Arrays.copyOf(valeurs, valeurs.length + 1);

        // On place la nouvelle valeur dans la dernière case
        tableauPlusGrand[tableauPlusGrand.length - 1] = valeur;

        // On remplace l'ancien tableau par le nouveau
        this.valeurs = tableauPlusGrand;
    }

    /**
     * Calcule la moyenne des valeurs du tableau.
     *
     * @return la moyenne, ou {@code Double.NaN} si le tableau est vide
     */
    public double calcul() {
        if (valeurs.length == 0) {
            System.out.println("Le tableau est vide, calcul impossible.");
            return Double.NaN;
        }
        double somme = 0;
        for (double val : valeurs) {
            somme += val;
        }
        return somme / valeurs.length;
    }

    // Getter pour le tableau si besoin
    public double[] getValeurs() {
        return valeurs;
    }
}
