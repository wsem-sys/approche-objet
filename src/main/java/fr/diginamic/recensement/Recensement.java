package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe qui contient la liste de toutes les villes chargées depuis le fichier CSV.
 * Elle est utilisée comme base de données en mémoire.
 */
public class Recensement {

    private List<Ville> villes;

    /**
     * Constructeur avec la liste des villes.
     * @param villes Liste de toutes les villes
     */
    public Recensement(List<Ville> villes) {
        this.villes = villes;
    }

    /**
     * Renvoie la liste des villes.
     * @return liste des villes
     */
    public List<Ville> getVilles() {
        return villes;
    }

    /**
     * Modifie la liste des villes.
     * @param villes nouvelle liste des villes
     */
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}
