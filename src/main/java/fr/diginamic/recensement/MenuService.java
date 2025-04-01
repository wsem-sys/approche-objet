package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe abstraite représentant un service du menu.
 * Toutes les fonctionnalités du menu devront hériter de cette classe.
 */
public abstract class MenuService {

    /**
     * Méthode abstraite qui exécute le traitement de chaque menu.
     * Elle sera implémentée dans chaque sous-classe (ex: RecherchePopulationVille).
     *
     * @param recensement objet contenant les villes chargées
     * @param scanner pour lire l'entrée utilisateur
     */
    public abstract void traiter(Recensement recensement, Scanner scanner);
}
