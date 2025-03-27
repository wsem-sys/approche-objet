package fr.diginamic.entites;

/**
 * La classe {@code Theatre} représente un établissement ayant un nom,
 * une capacité maximale, un total de clients inscrits et une recette
 * totale (en euros).
 */
public class Theatre {

    /** Nom du théâtre */
    private String nom;
    /** Capacité max du théâtre (en nombre de personnes) */
    private int capaciteMax;
    /** Nombre total de clients déjà inscrits */
    private int totalClientsInscrits;
    /** Recette totale de l'établissement (en euros) */
    private double recetteTotale;

    /**
     * Constructeur
     *
     * @param nom Nom du théâtre
     * @param capaciteMax Capacité maximale (nb de places)
     */
    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0; // Par défaut, aucun client
        this.recetteTotale = 0.0;      // Pas de recette initialement
    }

    /**
     * Méthode permettant d'inscrire un certain nombre de clients à un prix donné,
     * si la capacité max du théâtre n'est pas dépassée.
     *
     * @param nbClients le nombre de clients à inscrire
     * @param prixPlace le prix unitaire de la place
     */
    public void inscrire(int nbClients, double prixPlace) {
        // Vérification si la capacité max est déjà atteinte ou si on va la dépasser
        if (totalClientsInscrits + nbClients <= capaciteMax) {
            // On met à jour le total de clients inscrits
            totalClientsInscrits += nbClients;
            // On calcule la recette correspondante
            recetteTotale += nbClients * prixPlace;
        } else {
            // Si la capacité max est (ou serait) dépassée, on affiche un message d'erreur
            System.out.println("Capacité maximale atteinte ou dépassée ! " +
                    "Impossible d'inscrire ces " + nbClients + " clients supplémentaires.");
        }
    }

    /** Accesseur pour le nom du théâtre */
    public String getNom() {
        return nom;
    }

    /** Mutateur pour le nom (optionnel) */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /** Accesseur pour la capacité maximale */
    public int getCapaciteMax() {
        return capaciteMax;
    }

    /** Mutateur pour la capacité max  */
    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    /** Accesseur pour le total de clients inscrits */
    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    /** Accesseur pour la recette totale */
    public double getRecetteTotale() {
        return recetteTotale;
    }
}
