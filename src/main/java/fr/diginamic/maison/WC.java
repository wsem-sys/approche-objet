package fr.diginamic.maison;

public class WC extends Piece {

    public WC(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String getType() {
        return "WC";
    }
}
