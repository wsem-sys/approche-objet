package entites;

/**
 * Classe représentant une adresse postale avec numéro, libellé de la rue, code postal et ville.
 */
public class AdressePostale {

    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String ville;

    /**
     * Constructeur pour initialiser tous les attributs d'une adresse postale.
     *
     * @param numeroRue  Numéro de la rue
     * @param libelleRue Nom de la rue
     * @param codePostal Code postal
     * @param ville      Ville
     */
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters
    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    // Setters
    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Méthode pour obtenir une représentation textuelle complète de l'adresse.
     *
     * @return L'adresse complète sous forme de String.
     */
    @Override
    public String toString() {
        return numeroRue + " " + libelleRue + ", " + codePostal + " " + ville;
    }
}
