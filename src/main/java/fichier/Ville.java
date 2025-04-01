package fichier;

/**
 * Représente une Ville avec ses principales caractéristiques.
 *
 * <p>
 * Chaque ville est définie par :
 * <ul>
 *   <li>Un code de région</li>
 *   <li>Un nom de région</li>
 *   <li>Un code de département</li>
 *   <li>Un code de commune</li>
 *   <li>Un nom de commune</li>
 *   <li>Une population</li>
 * </ul>
 * </p>
 *
 * @author
 */
public class Ville {

    /**
     * Code de la région.
     */
    private String codeRegion;

    /**
     * Nom de la région.
     */
    private String nomRegion;

    /**
     * Code du département.
     */
    private String codeDepartement;

    /**
     * Code de la commune.
     */
    private String codeCommune;

    /**
     * Nom de la commune.
     */
    private String nomCommune;

    /**
     * Population de la commune.
     */
    private int population;

    /**
     * Constructeur complet de la classe Ville.
     *
     * @param codeRegion      Code de la région.
     * @param nomRegion       Nom de la région.
     * @param codeDepartement Code du département.
     * @param codeCommune     Code de la commune.
     * @param nomCommune      Nom de la commune.
     * @param population      Population de la commune.
     */
    public Ville(String codeRegion, String nomRegion, String codeDepartement,
                 String codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    /**
     * @return le code de la région
     */
    public String getCodeRegion() {
        return codeRegion;
    }

    /**
     * @param codeRegion définit le code de la région
     */
    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    /**
     * @return le nom de la région
     */
    public String getNomRegion() {
        return nomRegion;
    }

    /**
     * @param nomRegion définit le nom de la région
     */
    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    /**
     * @return le code du département
     */
    public String getCodeDepartement() {
        return codeDepartement;
    }

    /**
     * @param codeDepartement définit le code du département
     */
    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    /**
     * @return le code de la commune
     */
    public String getCodeCommune() {
        return codeCommune;
    }

    /**
     * @param codeCommune définit le code de la commune
     */
    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    /**
     * @return le nom de la commune
     */
    public String getNomCommune() {
        return nomCommune;
    }

    /**
     * @param nomCommune définit le nom de la commune
     */
    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    /**
     * @return la population de la commune
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @param population définit la population de la commune
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * Retourne une chaîne de caractères représentant la ville.
     *
     * @return description textuelle de la Ville
     */
    @Override
    public String toString() {
        return "Ville [codeRegion=" + codeRegion +
                ", nomRegion=" + nomRegion +
                ", codeDepartement=" + codeDepartement +
                ", codeCommune=" + codeCommune +
                ", nomCommune=" + nomCommune +
                ", population=" + population + "]";
    }
}
