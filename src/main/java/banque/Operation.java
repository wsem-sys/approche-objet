package banque;
/**
 * Classe abstraite représentant une opération sur un compte bancaire.
 * Une opération possède une date (String) et un montant (double).
 * Elle déclare une méthode abstraite getType() à implémenter dans les classes filles.
 */
public abstract class Operation {

    /** Date de l'opération (format String, ex: "2025-03-26") */
    private String date;

    /** Montant de l'opération (ex: 150.0) */
    private double montant;

    /**
     * Constructeur de la classe Operation.
     *
     * @param date    date de l'opération
     * @param montant montant de l'opération
     */
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    /**
     * Méthode abstraite qui renverra le type d'opération.
     * Sera redéfinie dans les classes filles (Credit et Debit).
     *
     * @return "CREDIT" ou "DEBIT"
     */
    public abstract String getType();

    /**
     * Getter pour la date de l'opération.
     *
     * @return date de l'opération
     */
    public String getDate() {
        return date;
    }

    /**
     * Getter pour le montant de l'opération.
     *
     * @return montant de l'opération
     */
    public double getMontant() {
        return montant;
    }
}
