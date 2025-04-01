package maps;

/**
 * Représente un pays avec un nom, un nombre d'habitants et un continent.
 */
public class Pays {
    private String nom;
    private long nbHabitants;  // Utilisation de 'long' pour pouvoir stocker des valeurs importantes
    private String continent;

    /**
     * Constructeur de la classe Pays.
     *
     * @param nom          Le nom du pays.
     * @param nbHabitants  Le nombre d'habitants.
     * @param continent    Le continent auquel appartient le pays.
     */
    public Pays(String nom, long nbHabitants, String continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public long getNbHabitants() {
        return nbHabitants;
    }

    public String getContinent() {
        return continent;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(long nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * Redéfinition de la méthode toString pour un affichage lisible de l'objet.
     */
    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", continent='" + continent + '\'' +
                '}';
    }
}
