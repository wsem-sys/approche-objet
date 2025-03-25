package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 25;
        adresse1.libelleRue = "tokyo";
        adresse1.codePostal = 30456;
        adresse1.ville = "Montfrin";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 454;
        adresse2.libelleRue = "Avenue Jean Suiton";
        adresse2.codePostal = 545648;
        adresse2.ville = "Suna";
    }
}
