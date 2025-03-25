package banque;

/**
 * La classe Compte représente un compte bancaire avec un numéro de compte
 * et un solde. Elle illustre les principes d'encapsulation en Java :
 * <ul>
 *   <li>Attributs privés (numeroCompte, solde)</li>
 *   <li>Getters et setters pour contrôler l'accès et la modification</li>
 *   <li>Constructeur pour initialiser l'état de l'objet</li>
 * </ul>
 */
public class Compte {

    /**
     * Le numéro du compte (identifiant unique sous forme de chaîne de caractères).
     */
    private String numeroCompte;

    /**
     * Le solde du compte (de type double pour gérer les montants).
     */
    private double solde;

    /**
     * Constructeur qui initialise le numéro de compte et le solde.
     *
     * @param numeroCompte le numéro unique du compte
     * @param solde le solde initial du compte
     */
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    /**
     * Getter pour récupérer le numéro de compte.
     *
     * @return le numéro de compte sous forme de String
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Setter pour modifier le numéro de compte.
     *
     * @param numeroCompte le nouveau numéro de compte
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * Getter pour récupérer le solde du compte.
     *
     * @return le solde actuel du compte
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter pour modifier le solde du compte.
     *
     * @param solde la nouvelle valeur du solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
