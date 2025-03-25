package entites;

public class TestPersonne {
    public static void main(String[] args) {
        // Utilisation du 1er constructeur (nom et prénom)
        Personne personne1 = new Personne("Ishigami", "Wissem");

        AdressePostale adresse2 = new AdressePostale(5, "Boulevard fgh", 30490, "Tokyo");
        // Utilisation du 2ème constructeur (nom, prénom, adresse)
        Personne personne2 = new Personne("Son", "Goku", adresse2);

        System.out.println(personne1.getPrenom() + " " + personne1.getNom());
        System.out.println(personne2.getPrenom() + " " + personne2.getNom() + ", " +
                personne2.getAdressePostale().getLibelleRue() + ", " +
                personne2.getAdressePostale().getVille());
    }
}
