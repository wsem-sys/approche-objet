package entites;

/**
 * Classe de test pour la classe Personne.
 */
public class TestPersonne {
    public static void main(String[] args) {

        // Utilisation du constructeur avec arguments (nom et prenom uniquement)
        Personne personne = new Personne("Ishigami", "wsem");

        // Création d'une nouvelle adresse postale
        AdressePostale adresse = new AdressePostale(10, "Rue djbjkds", 30490, "Montfrin");

        // Modification de l'adresse en utilisant la méthode prévue par les consignes
        personne.setAdressePostale(adresse);

        // Affichage du nom en majuscules et prénom pour vérifier la méthode dédiée
        personne.afficherNomPrenomMajuscule();

        // Affichage de l'adresse complète pour vérification
        System.out.println("Adresse de " + personne.getPrenom() + ": " + personne.getAdressePostale());
    }
}
