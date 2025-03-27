package fr.diginamic.salaire;

/**
 * Classe fille de Intervenant representant un salarie (CDD ou CDI).
 */
public class Salarie extends Intervenant {

    /** Montant du salaire mensuel (encapsulation avec private) */
    private double salaireMensuel;

    /**
     * Constructeur
     *
     * @param nom            nom du salarie
     * @param prenom         prenom du salarie
     * @param salaireMensuel montant du salaire mensuel
     */
    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    /**
     * Implementation de la methode abstraite getSalaire()
     * @return le salaire mensuel
     */
    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

    /**
     * Implementation de la methode abstraite getStatut()
     * @return "Salarié"
     */
    @Override
    public String getStatut() {
        return "Salarié";
    }

    /** Getter optionnel si vous souhaitez accéder à salaireMensuel directement */
    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    /** Setter optionnel si vous souhaitez modifier le salaireMensuel */
    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }
}
