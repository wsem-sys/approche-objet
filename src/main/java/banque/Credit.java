package banque;
/**
 * Classe Credit qui hérite d'Operation.
 * Représente une opération créditrice.
 */
public class Credit extends Operation {

    /**
     * Constructeur de la classe Credit.
     *
     * @param date    date de l'opération
     * @param montant montant de l'opération
     */
    public Credit(String date, double montant) {
        // Appel au constructeur de la classe mère (Operation)
        super(date, montant);
    }

    /**
     * Redéfinition de la méthode getType() pour renvoyer "CREDIT".
     *
     * @return "CREDIT"
     */
    @Override
    public String getType() {
        return "CREDIT";
    }
}
