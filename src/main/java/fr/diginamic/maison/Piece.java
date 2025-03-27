package fr.diginamic.maison;

/**
 * Classe abstraite representant une piece de la maison.
 */
public abstract class Piece {

    /** Superficie de la piece (en m²) */
    private double superficie;
    /** Numero d'etage (0 = RDC, 1 = 1er etage, etc.) */
    private int etage;

    /**
     * Constructeur
     * @param superficie superficie de la piece
     * @param etage numero d'etage
     */
    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    /**
     * Methode abstraite destinee a retourner le type
     * concret de la piece (ex: Chambre, Cuisine, etc.)
     */
    public abstract String getType();

    // Getters
    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}
