package Interfaces;

/**
 * Classe Rectangle implémentant l'interface ObjetGeometrique.
 * Possède 2 attributs : longueur et largeur.
 */
public class Rectangle implements ObjetGeometrique {

    /** Longueur du rectangle */
    private double longueur;

    /** Largeur du rectangle */
    private double largeur;

    /**
     * Constructeur pour initialiser la longueur et la largeur.
     * @param longueur longueur du rectangle
     * @param largeur  largeur du rectangle
     */
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Calcul du périmètre d'un rectangle : 2 * (longueur + largeur)
     * @return périmètre (double)
     */
    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    /**
     * Calcul de la surface d'un rectangle : longueur * largeur
     * @return surface (double)
     */
    @Override
    public double surface() {
        return longueur * largeur;
    }

    // Getters / setters si nécessaire
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}