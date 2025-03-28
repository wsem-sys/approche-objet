package sets;

/**
 * Classe représentant un Pays avec un nom, un nombre d'habitants
 * et un PIB par habitant.
 *
 * @author
 *   (Votre nom ou identifiant)
 *
 * @version 1.0
 */
public class Pays {

    /** Nom du pays */
    private String nom;

    /** Nombre d'habitants du pays */
    private long nbHabitants;

    /** PIB par habitant du pays (en dollars) */
    private double pibParHabitant;

    /**
     * Constructeur permettant de créer un nouvel objet Pays.
     *
     * @param nom
     *     le nom du pays
     * @param nbHabitants
     *     le nombre d'habitants du pays
     * @param pibParHabitant
     *     le PIB par habitant en dollars
     */
    public Pays(String nom, long nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    /**
     * Retourne le nom du pays.
     *
     * @return nom du pays
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du pays.
     *
     * @param nom
     *     le nouveau nom du pays
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nombre d'habitants du pays.
     *
     * @return nombre d'habitants
     */
    public long getNbHabitants() {
        return nbHabitants;
    }

    /**
     * Modifie le nombre d'habitants du pays.
     *
     * @param nbHabitants
     *     le nouveau nombre d'habitants
     */
    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    /**
     * Retourne le PIB par habitant du pays en dollars.
     *
     * @return PIB par habitant
     */
    public double getPibParHabitant() {
        return pibParHabitant;
    }

    /**
     * Modifie le PIB par habitant du pays.
     *
     * @param pibParHabitant
     *     le nouveau PIB par habitant
     */
    public void setPibParHabitant(double pibParHabitant) {
        this.pibParHabitant = pibParHabitant;
    }

    /**
     * Calcule et retourne le PIB total du pays : nbHabitants * pibParHabitant.
     *
     * @return PIB total en dollars
     */
    public double getPibTotal() {
        return this.nbHabitants * this.pibParHabitant;
    }

    /**
     * Méthode toString() pour une représentation textuelle du pays.
     *
     * @return chaîne de caractères représentant le pays
     */
    @Override
    public String toString() {
        return "Pays{nom='" + nom + "', nbHabitants=" + nbHabitants
                + ", pibParHabitant=" + pibParHabitant
                + ", pibTotal=" + getPibTotal() + "}";
    }
}
