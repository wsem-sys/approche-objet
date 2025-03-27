package fr.diginamic.combat;

public class Troll extends Creature {

    public Troll() {
        // force entre 10 et 15
        this.force = getRandomInt(10, 15);
        // pv entre 20 et 30
        this.pointsDeVie = getRandomInt(20, 30);
    }

    @Override
    public String getType() {
        return "Troll";
    }
}
