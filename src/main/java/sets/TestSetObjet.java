package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe de test pour manipuler un Set de Pays.
 *
 * <p>
 * Exercice 3 :
 * 1) Créer un HashSet de pays (objets Pays) avec leurs données
 *    (nom, nb d'habitants, PIB/hab).
 * 2) Rechercher le pays avec le PIB/habitant le plus important.
 * 3) Rechercher le pays avec le PIB total le plus important.
 * 4) Mettre en majuscule le pays qui a le PIB total le plus petit.
 * 5) Supprimer le pays dont le PIB total est le plus grand.
 * 6) Afficher l'ensemble des pays ainsi modifiés (nom, nb d'habitants, PIB total).
 * </p>
 *
 * @author
 *   (Votre nom ou identifiant)
 *
 * @version 1.0
 */
public class TestSetObjet {

    /**
     * Méthode principale (point d'entrée) du programme.
     *
     * @param args
     *     non utilisé dans ce programme
     */
    public static void main(String[] args) {

        // 1) Création du HashSet de Pays
        Set<Pays> paysSet = new HashSet<>();

        // Ajout des pays avec des valeurs approximatives pour nbHabitants et pib/hab
        paysSet.add(new Pays("USA", 328_200_000L, 59_500));
        paysSet.add(new Pays("France", 66_990_000L, 43_550));
        paysSet.add(new Pays("Allemagne", 82_790_000L, 50_206));
        paysSet.add(new Pays("UK", 66_650_000L, 43_620));
        paysSet.add(new Pays("Italie", 60_590_000L, 34_318));
        paysSet.add(new Pays("Japon", 126_800_000L, 41_300));
        paysSet.add(new Pays("Chine", 1_386_000_000L, 8_123));
        paysSet.add(new Pays("Russie", 146_690_000L, 11_288));
        paysSet.add(new Pays("Inde", 1_339_000_000L, 1_985));

        // 2) Rechercher le pays avec le PIB/habitant le plus important
        Pays paysPibHabPlusFort = null;
        for (Pays p : paysSet) {
            if (paysPibHabPlusFort == null
                    || p.getPibParHabitant() > paysPibHabPlusFort.getPibParHabitant()) {
                paysPibHabPlusFort = p;
            }
        }
        System.out.println("Pays avec le PIB/hab le plus important : " + paysPibHabPlusFort);

        // 3) Rechercher le pays avec le PIB total (nbHabitants * pib/habitant) le plus important
        Pays paysPibTotalPlusGrand = null;
        for (Pays p : paysSet) {
            if (paysPibTotalPlusGrand == null
                    || p.getPibTotal() > paysPibTotalPlusGrand.getPibTotal()) {
                paysPibTotalPlusGrand = p;
            }
        }
        System.out.println("\nPays avec le PIB total le plus grand : " + paysPibTotalPlusGrand);

        // 4) Trouver le pays avec le PIB total le plus petit pour mettre son nom en majuscules
        Pays paysPibTotalPlusPetit = null;
        for (Pays p : paysSet) {
            if (paysPibTotalPlusPetit == null
                    || p.getPibTotal() < paysPibTotalPlusPetit.getPibTotal()) {
                paysPibTotalPlusPetit = p;
            }
        }
        // Mise à jour du nom en MAJUSCULE
        if (paysPibTotalPlusPetit != null) {
            paysPibTotalPlusPetit.setNom(paysPibTotalPlusPetit.getNom().toUpperCase());
        }

        // 5) Supprimer le pays dont le PIB total est le plus grand du set
        if (paysPibTotalPlusGrand != null) {
            paysSet.remove(paysPibTotalPlusGrand);
        }

        // 6) Afficher l'ensemble des pays ainsi modifiés
        System.out.println("\n=== Liste des pays après modifications ===");
        for (Pays p : paysSet) {
            // On affiche les détails (nom, nb d'habitants, PIB total)
            System.out.println(p.toString());
        }
    }
}
