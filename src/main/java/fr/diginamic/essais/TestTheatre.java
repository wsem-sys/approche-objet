package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

/**
 * Classe de test pour la classe {@link Theatre}.
 */
public class TestTheatre {

    public static void main(String[] args) {

        // Création d'une instance de Theatre
        Theatre theatre = new Theatre("Le Grand Rex", 100);

        // On effectue plusieurs inscriptions jusqu'à atteindre (ou dépasser) la capacité
        System.out.println("=== Inscriptions au théâtre " + theatre.getNom() + " ===");

        // Premier appel: on inscrit 30 clients à 12€ la place
        theatre.inscrire(30, 12.0);

        // Deuxième appel: on inscrit 50 clients à 12.5€ la place
        theatre.inscrire(50, 12.5);

        // Troisième appel: on tente d'inscrire 25 clients, ce qui devrait dépasser la capacité (30+50+25=105 > 100)
        theatre.inscrire(25, 10.0);

        // Affichage du total de clients inscrits
        System.out.println("\nTotal de clients inscrits: " + theatre.getTotalClientsInscrits());

        // Affichage de la recette totale
        System.out.println("Recette totale de l'établissement: " + theatre.getRecetteTotale() + " €");
    }
}
