package Interfaces;

/**
 * Classe Cercle implémentant l'interface ObjetGeometrique.
 * Possède un attribut rayon.
 */
public class Cercle implements ObjetGeometrique {

    /** Rayon du cercle */
    private double rayon;

    /**
     * Constructeur pour initialiser le rayon du cercle.
     * @param rayon le rayon du cercle
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Calcul du périmètre d'un cercle : 2 * Math.PI * rayon
     * @return périmètre (double)
     */
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    /**
     * Calcul de la surface d'un cercle : Math.PI * rayon^2
     * @return surface (double)
     */
    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Getters / setters si nécessaire
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
