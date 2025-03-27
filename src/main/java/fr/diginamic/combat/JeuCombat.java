package fr.diginamic.combat;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe principale avec le main et le menu pour lancer le jeu de combat.
 */
public class JeuCombat {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Personnage personnage = null; // On n'a pas de perso au début
        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("\n=== MENU ===");
            System.out.println("1) Creer un personnage");
            System.out.println("2) Combattre une creature");
            System.out.println("3) Afficher le score");
            System.out.println("4) Sortir");
            System.out.print("Votre choix : ");

            int choix = lireInt();

            switch (choix) {
                case 1:
                    // CREER PERSONNAGE
                    personnage = new Personnage();
                    System.out.println("Nouveau personnage créé !");
                    System.out.println("Force = " + personnage.getForce()
                            + ", PV = " + personnage.getPointsDeVie()
                            + ", Score = " + personnage.getScore());
                    break;

                case 2:
                    // COMBATTRE UNE CREATURE
                    if (personnage == null || personnage.getPointsDeVie() <= 0) {
                        System.out.println("Votre personnage est indisponible (mort ou non créé).");
                        System.out.println("Veuillez créer un nouveau personnage.");
                    } else {
                        combattreUneCreature(personnage);
                    }
                    break;

                case 3:
                    // AFFICHER SCORE
                    if (personnage == null) {
                        System.out.println("Aucun personnage créé pour le moment.");
                    } else {
                        System.out.println("Score du personnage : " + personnage.getScore());
                    }
                    break;

                case 4:
                    // SORTIR
                    System.out.println("Au revoir !");
                    continuer = false;
                    break;

                default:
                    System.out.println("Choix invalide. Reessayez.");
            }
        }

        scanner.close();
    }

    /**
     * Methode qui gere le choix/creation d'une creature et lance le combat.
     * @param perso le personnage qui va combattre
     */
    private static void combattreUneCreature(Personnage perso) {

        // On va tirer au hasard la creature a combattre : Loup, Gobelin, ou Troll
        Creature creature = creerCreatureAleatoire();
        System.out.println("\nLe personnage affronte un " + creature.getType()
                + " (Force = " + creature.getForce()
                + ", PV = " + creature.getPointsDeVie() + ")");

        // Combat tour par tour
        while (perso.getPointsDeVie() > 0 && creature.getPointsDeVie() > 0) {
            int attPerso = perso.attaquer();
            int attCreature = creature.attaquer();

            if (attPerso > attCreature) {
                // Personnage gagne le tour
                int degats = attPerso - attCreature;
                int newPV = creature.getPointsDeVie() - degats;
                creature.setPointsDeVie(newPV);
            } else if (attCreature > attPerso) {
                // Creature gagne le tour
                int degats = attCreature - attPerso;
                int newPV = perso.getPointsDeVie() - degats;
                perso.setPointsDeVie(newPV);
            } else {
                // Egalite, pas de degats
            }
        }

        // On verifie qui est mort
        if (perso.getPointsDeVie() <= 0) {
            // Personnage mort => partie finie
            System.out.println("\nVotre personnage est décédé !");
            System.out.println("Il avait un score de " + perso.getScore() + ".");
            System.out.println("Veuillez créer un nouveau personnage pour continuer...");
        } else {
            // Creature morte => le perso a gagné
            System.out.println("\nLe personnage a vaincu le " + creature.getType() + " !");
            // On augmente le score suivant le type
            int bonus = 0;
            switch (creature.getType()) {
                case "Loup":
                    bonus = 1;
                    break;
                case "Gobelin":
                    bonus = 2;
                    break;
                case "Troll":
                    bonus = 5;
                    break;
            }
            int nouveauScore = perso.getScore() + bonus;
            perso.setScore(nouveauScore);
            System.out.println("Nouveau score : " + nouveauScore);
        }
    }

    /**
     * Methode qui cree une creature aleatoire (Loup, Gobelin ou Troll)
     */
    private static Creature creerCreatureAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3); // 0..2
        switch (choix) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            default:
                return new Troll();
        }
    }

    /**
     * Lit un entier au clavier (gestion simple d'erreur)
     */
    private static int lireInt() {
        while (!scanner.hasNextInt()) {
            scanner.next(); // on jette la saisie invalide
            System.out.println("Veuillez saisir un entier.");
        }
        return scanner.nextInt();
    }
}
