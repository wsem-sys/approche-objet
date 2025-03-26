package banque;

/**
 * Classe de test permettant de vérifier l'héritage et l'affichage des comptes.
 */
public class TestBanque {

    public static void main(String[] args) {

        // 1) Création d'un tableau de comptes (2 cases)
        Compte[] comptes = new Compte[2];

        // 2) À l'index 0 : instance de Compte (compte courant)
        comptes[0] = new Compte("CPT-001", 1000.0);

        // 3) À l'index 1 : instance de CompteTaux (compte rémunéré)
        comptes[1] = new CompteTaux("CPT-002", 2000.0, 0.03);

        // 4) Boucle pour afficher les informations de chaque compte
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
            // L'instruction ci-dessus appelle toString() sur l'objet
        }

        // Vérifiez que l'affichage correspond bien aux informations
        // attendues (numéro de compte, solde et taux pour le CompteTaux).
    }
}
