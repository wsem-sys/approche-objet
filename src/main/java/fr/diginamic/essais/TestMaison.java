package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        // 1) Creation de la maison
        Maison maison = new Maison();

        // 2) Ajout de pieces
        maison.ajouterPiece(new Chambre(12.5, 0));     // RDC
        maison.ajouterPiece(new Chambre(14.0, 1));     // 1er etage
        maison.ajouterPiece(new Cuisine(9.0, 0));      // RDC
        maison.ajouterPiece(new Salon(20.0, 1));       // 1er etage
        maison.ajouterPiece(new WC(2.0, 0));           // RDC
        maison.ajouterPiece(new SalleDeBain(6.5, 1));  // 1er etage

        // 3) Test d'ajout d'une piece null
        maison.ajouterPiece(null);

        // 4) Test d'ajout d'une piece avec superficie negative
        maison.ajouterPiece(new WC(-2.0, 1));

        // 5) Verification des methodes
        double superficieTotale = maison.getSuperficieTotale();
        System.out.println("Superficie totale de la maison: " + superficieTotale);

        double superficieEtage0 = maison.getSuperficieEtage(0);
        System.out.println("Superficie etage 0 (RDC): " + superficieEtage0);

        double superficieEtage1 = maison.getSuperficieEtage(1);
        System.out.println("Superficie etage 1: " + superficieEtage1);

        double supChambres = maison.getSuperficieParType("Chambre");
        System.out.println("Superficie globale des Chambres: " + supChambres);

        int nbChambres = maison.getNbPiecesParType("Chambre");
        System.out.println("Nombre total de Chambres: " + nbChambres);

        double supCuisines = maison.getSuperficieParType("cuisine");
        System.out.println("Superficie globale des Cuisines: " + supCuisines);

        int nbCuisines = maison.getNbPiecesParType("CUISINE");
        System.out.println("Nombre total de Cuisines: " + nbCuisines);
    }
}
