package banque;

/**
 * Classe exécutable de test pour les opérations bancaires abstraites (Credit et Debit).
 * Respecte les consignes du TP : affichage des informations et calcul du montant global.
 */
public class TestOperation {

    public static void main(String[] args) {

        // Créer un tableau d'opérations avec AU MOINS 4 opérations de crédits et débits
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2025-03-25", 100.0);   // Crédit
        operations[1] = new Debit("2025-03-26", 40.0);     // Débit
        operations[2] = new Credit("2025-03-27", 60.0);    // Crédit
        operations[3] = new Debit("2025-03-28", 30.0);     // Débit

        //  Initialisation du montant global
        double montantGlobal = 0.0;

        //  Boucle sur le tableau pour afficher :
        System.out.println("Liste des opérations :\n");

        for (int i = 0; i < operations.length; i++) {
            Operation op = operations[i];

            //  Affichage de la date de l'opération
            //  Affichage du montant de l'opération
            //  Affichage également du type de l'opération (via getType())
            System.out.println("Date : " + op.getDate()
                    + " | Montant : " + op.getMontant()
                    + " | Type : " + op.getType());

            //  Calcul du montant global :
            //     Si DEBIT, on soustrait
            //     Si CREDIT, on additionne
            if ("CREDIT".equals(op.getType())) {
                montantGlobal += op.getMontant();
            } else if ("DEBIT".equals(op.getType())) {
                montantGlobal -= op.getMontant();
            }
        }

        // Affichage final du total
        System.out.println("\nMontant global de toutes les opérations : " + montantGlobal);
    }
}

