package tri;

/**
 * Représente une ville avec un nom et un nombre d'habitants.
 * Implémente Comparable pour permettre un tri alphabétique par nom.
 */
public class Ville implements Comparable<Ville> {

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

    /**
     * Getter pour le nom de la ville.
     * @return nom de la ville
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom de la ville.
     * @param nom nom de la ville
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour le nombre d'habitants.
     * @return nombre d'habitants
     */
    public int getNbHabitants() {
        return nbHabitants;
    }

    /**
     * Setter pour le nombre d'habitants.
     * @param nbHabitants nouveau nombre d'habitants
     */
    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    /**
     * Compare deux villes par leur nom (ordre alphabétique, insensible à la casse).
     * @param autreVille l'autre ville à comparer
     * @return un entier négatif, nul ou positif selon l'ordre alphabétique
     */
    @Override
    public int compareTo(Ville autreVille) {
        return this.nom.compareToIgnoreCase(autreVille.getNom());
    }

    /**
     * Représente la ville sous forme de chaîne de caractères.
     * @return nom et nombre d'habitants de la ville
     */
    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " hab.)";
    }
}
