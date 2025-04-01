package maps;

/**
 * Classe Ville représentant une ville avec son nom et son nombre d'habitants.
 */
public class Ville {
    private String nom;
    private int nbHabitants;

    // Constructeur
    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    // Méthode toString pour un affichage clair
    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}
