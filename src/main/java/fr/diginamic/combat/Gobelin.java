package fr.diginamic.combat;

public class Gobelin extends Creature {

    public Gobelin() {
        // force entre 5 et 10
        this.force = getRandomInt(5, 10);
        // pv entre 10 et 15
        this.pointsDeVie = getRandomInt(10, 15);
    }

    @Override
    public String getType() {
        return "Gobelin";
    }
}
