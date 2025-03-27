package fr.diginamic.combat;

public class Loup extends Creature {

    public Loup() {
        // force entre 3 et 8
        this.force = getRandomInt(3, 8);
        // pv entre 5 et 10
        this.pointsDeVie = getRandomInt(5, 10);
    }

    @Override
    public String getType() {
        return "Loup";
    }
}
