package fr.diginamic.salaire;

/**
 * Classe fille de Intervenant representant un pigiste,
 * paye a la journee.
 */
public class Pigiste extends Intervenant {

    /** Nombre de jours travailles durant le mois (private pour encapsulation) */
    private int nbJoursTravailles;

    /** Montant journalier de remuneration (private) */
    private double montantJournalier;

    /**
     * Constructeur
     *
     * @param nom               nom de l'intervenant
     * @param prenom            prenom de l'intervenant
     * @param nbJoursTravailles nombre de jours travailles
     * @param montantJournalier montant journalier
     */
    public Pigiste(String nom, String prenom, int nbJoursTravailles, double montantJournalier) {
        super(nom, prenom);
        this.nbJoursTravailles = nbJoursTravailles;
        this.montantJournalier = montantJournalier;
    }

    /**
     * Implementation de la methode abstraite getSalaire()
     * @return nbJoursTravailles * montantJournalier
     */
    @Override
    public double getSalaire() {
        return nbJoursTravailles * montantJournalier;
    }

    /**
     * Implementation de la methode abstraite getStatut()
     * @return "Pigiste"
     */
    @Override
    public String getStatut() {
        return "Pigiste";
    }

    // Getters et Setters optionnels
    public int getNbJoursTravailles() {
        return nbJoursTravailles;
    }

    public void setNbJoursTravailles(int nbJoursTravailles) {
        this.nbJoursTravailles = nbJoursTravailles;
    }

    public double getMontantJournalier() {
        return montantJournalier;
    }

    public void setMontantJournalier(double montantJournalier) {
        this.montantJournalier = montantJournalier;
    }
}
