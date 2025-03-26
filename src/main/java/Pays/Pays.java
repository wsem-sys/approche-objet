package Pays;

/**
 * Classe Pays représentant un pays avec un nom et une population.
 * Redéfinition de la méthode equals() pour comparer deux instances.
 */
public class Pays {

    /** Nom du pays (ex : "France") */
    private String nom;

    /** Population du pays (ex : 67000000 pour la France) */
    private int population;

    /**
     * Constructeur pour initialiser le nom et la population d'un pays.
     *
     * @param nom nom du pays
     * @param population population du pays
     */
    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    /**
     * Redéfinition de la méthode equals().
     * Cette méthode vérifie :
     *  - si l'objet comparé est la même instance (==),
     *  - si l'objet n'est pas de la même classe, on retourne false,
     *  - si c'est un Pays, on compare nom et population.
     *
     * @param obj l'objet à comparer
     * @return true si les attributs nom et population sont identiques,
     *         false sinon
     */
    @Override
    public boolean equals(Object obj) {
        // Vérifier si c'est la même référence
        if (this == obj) {
            return true;
        }

        // Vérifier si obj est nul ou d'une classe différente
        if (obj == null || !(obj instanceof Pays)) {
            return false;
        }

        // Convertir l'objet en Pays
        Pays other = (Pays) obj;

        // Comparer les attributs nom et population
        //    (pour le nom, on suppose la comparaison sensible à la casse)
        return this.nom.equals(other.nom) && this.population == other.population;
    }

    /**
     * Getter pour le nom du pays.
     * @return le nom du pays
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour la population du pays.
     * @return la population du pays
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Setter pour le nom du pays.
     * @param nom nouveau nom du pays
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Setter pour la population du pays.
     * @param population nouvelle population du pays
     */
    public void setPopulation(int population) {
        this.population = population;
    }
}

