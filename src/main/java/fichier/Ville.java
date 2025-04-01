package fichier;

/**
 * Classe représentant une ville avec ses attributs
 *
 * @author wsem
 *
 */
public class Ville {
    /** Nom de la ville */
    private String nom;

    /** Code du département */
    private String codeDepartement;

    /** Nom de la région */
    private String nomRegion;

    /** Population totale */
    private int populationTotale;

    /**
     * Constructeur avec tous les attributs
     *
     * @param nom Nom de la ville
     * @param codeDepartement Code du département
     * @param nomRegion Nom de la région
     * @param populationTotale Population totale
     */
    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    /**
     * Retourne le nom de la ville
     *
     * @return le nom de la ville
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de la ville
     *
     * @param nom le nouveau nom de la ville
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le code du département
     *
     * @return le code du département
     */
    public String getCodeDepartement() {
        return codeDepartement;
    }

    /**
     * Définit le code du département
     *
     * @param codeDepartement le nouveau code du département
     */
    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    /**
     * Retourne le nom de la région
     *
     * @return le nom de la région
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * Définit le nom de la région
     *
     * @param nomRegion le nouveau nom de la région
     */
    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    /**
     * Retourne la population totale
     *
     * @return la population totale
     */
    public int getPopulationTotale() {
        return populationTotale;
    }

    /**
     * Définit la population totale
     *
     * @param populationTotale la nouvelle population totale
     */
    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "Ville [nom=" + nom + ", codeDepartement=" + codeDepartement + ", nomRegion=" + nomRegion
                + ", populationTotale=" + populationTotale + "]";
    }
}