package entites;

public class AdressePostale {
    private int numeroRue;
    private String libelleRue;
    private int codePostal;
    private String ville;

    // Constructeur avec paramètres
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getters et Setters
    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }
}
