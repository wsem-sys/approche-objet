package fr.diginamic.maison;

import java.util.Arrays;

/**
 * Classe representant une maison avec un tableau de pieces.
 */
public class Maison {

    /** Tableau de pieces */
    private Piece[] pieces;

    /**
     * Constructeur : initialise un tableau vide (longueur 0)
     */
    public Maison() {
        this.pieces = new Piece[0];
    }

    /**
     * Methode pour ajouter une piece a la maison.
     * @param piece la piece a ajouter
     * Methode pour ajouter une piece a la maison.
     *
     * Question: Que se passe-t-il si on passe null en paramètre ?
     * Réponse: On affiche un message d'erreur et on ne l'ajoute pas.
     *
     *
     * Contrôles:
     *  - piece != null
     *  - piece.superficie > 0
     */
    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            System.out.println("Impossible d'ajouter une piece null.");
            return;
        }
        if (piece.getSuperficie() <= 0) {
            System.out.println("Impossible d'ajouter une piece avec une superficie <= 0.");
            return;
        }

        // Agrandissement du tableau
        this.pieces = Arrays.copyOf(pieces, pieces.length + 1);
        this.pieces[pieces.length - 1] = piece;
    }

    /**
     * Retourne la superficie totale de la maison
     * @return sum de toutes les superficies
     */
    public double getSuperficieTotale() {
        double somme = 0;
        for (Piece p : pieces) {
            // si pieces est vide, la boucle est ignorée
            somme += p.getSuperficie();
        }
        return somme;
    }

    /**
     * Retourne la superficie d'un etage donné
     * @param etage l'etage a filtrer
     * @return somme des superficies des pieces qui sont a l'etage
     */
    public double getSuperficieEtage(int etage) {
        double somme = 0;
        for (Piece p : pieces) {
            if (p.getEtage() == etage) {
                somme += p.getSuperficie();
            }
        }
        return somme;
    }

    /**
     * Retourne la superficie totale pour un type de piece donné
     * ex: "Chambre", "WC", etc.
     *
     * @param typePiece type a rechercher
     * @return somme des superficies
     */
    public double getSuperficieParType(String typePiece) {
        double somme = 0;
        for (Piece p : pieces) {
            if (p.getType().equalsIgnoreCase(typePiece)) {
                somme += p.getSuperficie();
            }
        }
        return somme;
    }

    /**
     * Retourne le nombre de pieces d'un type donné
     * ex: "Chambre", "WC", etc.
     *
     * @param typePiece type a rechercher
     * @return le nombre de pieces de ce type
     */
    public int getNbPiecesParType(String typePiece) {
        int count = 0;
        for (Piece p : pieces) {
            if (p.getType().equalsIgnoreCase(typePiece)) {
                count++;
            }
        }
        return count;
    }

    /** Getter pour le tableau si besoin */
    public Piece[] getPieces() {
        return pieces;
    }
}
