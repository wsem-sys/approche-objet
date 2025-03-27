package fr.diginamic.combat;

import java.util.Random;

/**
 * Classe representant le personnage joueur.
 */
public class Personnage {

    private int force;
    private int pointsDeVie;
    private int score;

    /** Constructeur : crée un personnage avec stats aléatoires */
    public Personnage() {
        this.force = getRandomInt(12, 18);
        this.pointsDeVie = getRandomInt(20, 50);
        this.score = 0;
    }

    /**
     * Methode qui calcule la valeur d'attaque du personnage.
     * La regle : force + nombre aleatoire entre 1 et 10
     *
     * @return valeur d'attaque
     */
    public int attaquer() {
        int bonus = getRandomInt(1, 10);
        return force + bonus;
    }

    /** Méthode utilitaire pour générer un entier aléatoire [min..max]. */
    private int getRandomInt(int min, int max) {
        Random rand = new Random();
        // nextInt((max-min)+1) => [0..(max-min)], on ajoute min
        return rand.nextInt((max - min) + 1) + min;
    }

    // Getters et Setters
    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
