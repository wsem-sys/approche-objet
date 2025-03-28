package listes;

/**
 * Représente une ville avec un nom et un nombre d'habitants.
 */
public class Ville {

    private String nom;
    private int nbHabitants;

    /**
     * Constructeur permettant d'initialiser la ville avec un nom et un nb d'habitants.
     *
     * @param nom le nom de la ville
     * @param nbHabitants le nombre d'habitants de la ville
     */
    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    // toString pour faciliter l'affichage
    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " hab.)";
    }
}
