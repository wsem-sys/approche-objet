package fr.diginamic.entites;

/**
 * Classe representant un salarie avec un nom, un prenom et un salaire.
 */
public class Salarie {

    /** Nom du salarié */
    private String nom;
    /** Prénom du salarié */
    private String prenom;
    /** Salaire du salarié */
    private double salaire;

    /**
     * Constructeur avec paramètres
     *
     * @param nom nom du salarie
     * @param prenom prenom du salarie
     * @param salaire salaire du salarie
     */
    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    /** Getter pour le nom */
    public String getNom() {
        return nom;
    }

    /** Getter pour le prenom */
    public String getPrenom() {
        return prenom;
    }

    /** Getter pour le salaire */
    public double getSalaire() {
        return salaire;
    }

    /**
     * toString() pour afficher facilement les informations du salarie
     */
    @Override
    public String toString() {
        return "Salarie{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
