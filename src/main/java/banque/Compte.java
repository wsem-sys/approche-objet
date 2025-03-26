package banque;

/**
 * Classe Compte représentant un compte bancaire.
 * Elle contient un numéro de compte et un solde.
 * On y redéfinit la méthode toString() afin d'afficher
 * ces informations de manière lisible.
 */
public class Compte {

    /** Numéro de compte (ex : "12345") */
    private String numeroCompte;

    /** Solde du compte (ex : 1000.0) */
    private double solde;

    /**
     * Constructeur permettant d'initialiser un Compte
     * avec son numéro de compte et son solde initial.
     *
     * @param numeroCompte Le numéro de compte (String)
     * @param solde        Le solde initial (double)
     */
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    /**
     * Getter pour le numéro de compte.
     *
     * @return le numéro de compte (String)
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Setter pour le numéro de compte.
     *
     * @param numeroCompte nouveau numéro de compte
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * Getter pour le solde du compte.
     *
     * @return le solde (double)
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter pour le solde du compte.
     *
     * @param solde nouveau solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Redéfinition (override) de la méthode toString()
     * afin d’afficher les informations du compte de manière lisible.
     *
     * @return Une chaîne de caractères contenant
     *         le numéro de compte et le solde.
     */
    @Override
    public String toString() {
        return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
    }
}
