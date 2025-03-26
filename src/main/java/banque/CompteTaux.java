package banque;

/**
 * Représente un compte rémunéré, spécialisé de la classe Compte.
 * Il possède un taux de rémunération en plus.
 */
public class CompteTaux extends Compte {

    /** Taux de rémunération du compte (ex: 0.03 pour 3%) */
    private double tauxRemuneration;

    /**
     * Constructeur avec numéro de compte, solde et taux de rémunération.
     * @param numeroCompte numéro de compte
     * @param solde solde initial
     * @param tauxRemuneration taux de rémunération
     */
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        // Appel au constructeur de la classe mère (Compte)
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Redéfinition de la méthode toString() pour ajouter le taux de rémunération.
     * On utilise super.toString() pour récupérer la chaîne de la classe mère,
     * puis on concatène le taux de rémunération.
     *
     * @return une chaîne de caractères contenant les infos du compte + taux
     */
    @Override
    public String toString() {
        // super.toString() retourne : "Compte [numeroCompte=..., solde=...]"
        return super.toString() + " - Taux de rémunération = " + tauxRemuneration;
    }
}

