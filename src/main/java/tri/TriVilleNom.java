package tri;

import tri.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe de test pour trier les villes par nom (ordre alphabétique).
 */
public class TriVilleNom {

    public static void main(String[] args) {
        // Création de la liste des villes
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Toulouse", 493000));
        villes.add(new Ville("Marseille", 861635));
        villes.add(new Ville("Lyon", 515695));
        villes.add(new Ville("Paris", 2148000));
        villes.add(new Ville("Nice", 340017));

        // Tri par nom (implémenté dans compareTo de Ville)
        Collections.sort(villes);

        // Affichage du résultat
        System.out.println("Villes triées par nom (ordre alphabétique) :");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
