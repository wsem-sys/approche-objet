package listes;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe illustre la fusion de deux listes de chaînes de caractères.
 */
public class FusionListe {

    /**
     * Méthode principale qui va fusionner deux listes de chaînes de caractères.
     *
     * @param args Arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Création et initialisation de la première liste
        List<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        // Création et initialisation de la deuxième liste
        List<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // TODO Développements
        // 1) Créer une liste qui contiendra les éléments de liste1 ainsi que ceux de liste2.

        // Création de la liste fusionnée
        List<String> listeFusionnee = new ArrayList<>();

        // Ajout de tous les éléments de liste1 dans la liste fusionnée
        listeFusionnee.addAll(liste1);

        // Ajout de tous les éléments de liste2 dans la liste fusionnée
        listeFusionnee.addAll(liste2);

        // Affichage de la liste fusionnée
        System.out.println("Contenu de la liste fusionnée : " + listeFusionnee);
    }
}
