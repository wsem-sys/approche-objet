package fr.diginamic.salaire;

/**
 * Classe mere representant un intervenant du journal.
 * Possede un nom et un prenom, et declare des methodes abstraites
 * pour le salaire et le statut.
 */
public abstract class Intervenant {

    /** Nom de l'intervenant (encapsulation avec private) */
    private String nom;

    /** Prenom de l'intervenant (encapsulation avec private) */
    private String prenom;

    /**
     * Constructeur permettant d'initialiser nom et prenom
     *
     * @param nom    nom de l'intervenant
     * @param prenom prenom de l'intervenant
     */
    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * Accesseur pour le nom (obligatoire si on veut y acceder dans les sous-classes
     * ou ailleurs tout en gardant l'encapsulation)
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accesseur pour le prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Methode abstraite qui doit retourner le salaire de l'intervenant.
     *
     * @return le salaire en double
     */
    public abstract double getSalaire();

    /**
     * Methode abstraite qui doit retourner le statut
     * (ex: "Salarié" ou "Pigiste").
     */
    public abstract String getStatut();

    /**
     * Methode qui affiche toutes les donnees concernant un intervenant:
     *  - son nom
     *  - son prenom
     *  - son salaire (via getSalaire())
     *  - son statut (via getStatut())
     */
    public void afficherDonnees() {
        System.out.println("Nom : " + getNom());
        System.out.println("Prenom : " + getPrenom());
        System.out.println("Salaire : " + getSalaire());
        System.out.println("Statut : " + getStatut());
    }
}

