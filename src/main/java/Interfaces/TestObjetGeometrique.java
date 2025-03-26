package Interfaces;

/**
 * Classe exécutable pour tester l'interface ObjetGeometrique
 * et ses implémentations (Cercle, Rectangle).
 */
public class TestObjetGeometrique {

    public static void main(String[] args) {

        //  Créer un tableau d'ObjetsGeometriques avec 1 cercle et 1 rectangle
        ObjetGeometrique[] formes = new ObjetGeometrique[2];
        formes[0] = new Cercle(5.0);            // rayon = 5
        formes[1] = new Rectangle(10.0, 3.0);   // longueur = 10, largeur = 3

        //  Boucle pour afficher la surface et le périmètre de chaque forme
        for (int i = 0; i < formes.length; i++) {
            ObjetGeometrique forme = formes[i];

            System.out.println("=== Forme " + (i + 1) + " ===");
            System.out.println("Périmètre : " + forme.perimetre());
            System.out.println("Surface   : " + forme.surface());
            System.out.println();
        }
    }
}