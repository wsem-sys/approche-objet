package fr.diginamic.maison;

public class Chambre extends Piece {

    /**
     * Constructeur
     * @param superficie superficie de la chambre
     * @param etage numero d'etage
     */
    public Chambre(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "Chambre";
    }
}
