package fr.diginamic.combat;

import java.util.Random;

/**
 * Classe abstraite representant une creature ennemie.
 */
public abstract class Creature {

    protected int force;
    protected int pointsDeVie;

    public Creature() {
        // Le constructeur concret sera dans chaque sous-classe
        // pour initialiser la force et les PV aux bons intervalles
    }

    /**
     * Calcul de l'attaque : force + random(1..10)
     * @return valeur d'attaque
     */
    public int attaquer() {
        int bonus = getRandomInt(1, 10);
        return force + bonus;
    }

    /** Methode utilitaire pour creer un int aleatoire */
    protected int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    /**
     * Methode abstraite pour le "type" de creature (Loup, Gobelin, Troll)
     */
    public abstract String getType();
}
