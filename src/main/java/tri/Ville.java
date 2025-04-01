package tri;

/**
 * Représente une ville avec un nom et un nombre d'habitants.
 * Implémente l'interface Comparable pour permettre le tri par nom.
 */
public class Ville implements Comparable<Ville> {

    /**
     * Nom de la ville
     */
    private String nom;

    /**
     * Nombre d'habitants de la ville
     */
    private int nbHabitants;

    /**
     * Constructeur permettant d'initialiser la ville avec un nom et un nombre d'habitants.
     *
     * @param nom          le nom de la ville
     * @param nbHabitants  le nombre d'habitants de la ville
     */
    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    /**
     * Retourne le nom de la ville
     *
     * @return nom de la ville
     */
    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom de la ville
     *
     * @param nom nouveau nom de la ville
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nombre d'habitants de la ville
     *
     * @return nombre d'habitants
     */
    public int getNbHabitants() {
        return nbHabitants;
    }

    /**
     * Modifie le nombre d'habitants de la ville
     *
     * @param nbHabitants nouveau nombre d'habitants
     */
    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    /**
     * Retourne une représentation textuelle de la ville
     *
     * @return une chaîne de caractères avec le nom et le nombre d'habitants
     */
    @Override
    public String toString() {
        return nom + " (" + nbHabitants + " hab.)";
    }

    /**
     * Compare cette ville à une autre ville selon leur nom (ordre alphabétique).
     *
     * @param autreVille l'autre ville à comparer
     * @return un entier négatif, nul ou positif selon l'ordre alphabétique des noms
     */
    @Override
    public int compareTo(Ville autreVille) {
        // Tri alphabétique basé sur le nom
        // Si vous souhaitez ignorer la casse, utilisez compareToIgnoreCase
        return this.nom.compareTo(autreVille.nom);
    }
}
