package entites;

/**
 * Classe représentant une personne avec nom, prénom et adresse postale.
 */
public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    /**
     * Constructeur avec nom et prénom uniquement.
     *
     * @param nom Nom de famille
     * @param prenom Prénom
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Constructeur avec nom, prénom et adresse.
     *
     * @param nom Nom de famille
     * @param prenom Prénom
     * @param adressePostale Adresse complète
     */
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    /**
     * Affiche le nom en majuscules suivi du prénom.
     */
    public void afficherNomPrenomMajuscule() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    /**
     * Modifie le nom.
     *
     * @param nom nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Modifie le prénom.
     *
     * @param prenom nouveau prénom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Modifie l'adresse postale.
     *
     * @param adressePostale nouvelle adresse
     */
    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    /**
     * Retourne le nom.
     *
     * @return nom de la personne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prénom.
     *
     * @return prénom de la personne
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne l'adresse postale.
     *
     * @return adresse postale de la personne
     */
    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
}
