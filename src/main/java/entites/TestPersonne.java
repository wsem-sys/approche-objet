package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 49;
        adresse1.libelleRue = "Rue djbnjk";
        adresse1.codePostal = 30490;
        adresse1.ville = "Montfrin";

        Personne personne1 = new Personne();
        personne1.nom = "Ishigami";
        personne1.prenom = "Wsem";
        personne1.adressePostale = adresse1;

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 5;
        adresse2.libelleRue = "Boulevard ";
        adresse2.codePostal = 75009;
        adresse2.ville = "Paris";

        Personne personne2 = new Personne();
        personne2.nom = "Son";
        personne2.prenom = "Goku";
        personne2.adressePostale = adresse2;
    }
}
