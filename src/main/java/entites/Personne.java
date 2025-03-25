package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    // Premier constructeur : nom et prénom uniquement
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Deuxième constructeur : nom, prénom et adresse
    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
}
