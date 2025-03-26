package banque;

/**
 * Classe Debit qui hérite d'Operation.
 * Représente une opération débitrice.
 */
public class Debit extends Operation {

    /**
     * Constructeur de la classe Debit.
     *
     * @param date    date de l'opération
     * @param montant montant de l'opération
     */
    public Debit(String date, double montant) {
        // Appel au constructeur de la classe mère (Operation)
        super(date, montant);
    }

    /**
     * Redéfinition de la méthode getType() pour renvoyer "DEBIT".
     *
     * @return "DEBIT"
     */
    @Override
    public String getType() {
        return "DEBIT";
    }
}

