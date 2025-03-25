package banque;

/**
 * La classe TestCompteEncapsulation contient un point d'entrée (main)
 * pour tester la classe Compte et vérifier l'application des règles
 * d'encapsulation (attributs privés, getters et setters).
 */
public class TestCompteEncapsulation {

    /**
     * Méthode principale (point d'entrée du programme).
     * @param args arguments passés en ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        /*
         * 1) Création d'une instance de Compte.
         *    - Le numéro de compte est "123jsdbhjkfb".
         *    - Le solde initial est 1000.0.
         */
        Compte monCompte = new Compte("123jsdbhjkfb", 1000.0);

        /*
         * 2) Modification du solde du compte en utilisant le setter.
         *    Par exemple, on ajoute 500.0 à l'ancien solde (1000.0),
         *    ce qui donne un nouveau solde de 1500.0.
         */
        monCompte.setSolde(1500.0);

        /*
         * 3) Affichage du nouveau solde en utilisant le getter.
         *    On affiche également le numéro du compte pour plus de clarté.
         */
        System.out.println("Le nouveau solde du compte "
                + monCompte.getNumeroCompte()
                + " est : "
                + monCompte.getSolde());


    }
}
