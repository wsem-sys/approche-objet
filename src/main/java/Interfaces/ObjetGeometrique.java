package Interfaces;


/**
 * Représente un objet géométrique qui doit fournir
 * au minimum un périmètre et une surface.
 */
public interface ObjetGeometrique {

    /**
     * Calcule et retourne le périmètre de la forme.
     * @return périmètre (double)
     */
    double perimetre();

    /**
     * Calcule et retourne la surface de la forme.
     * @return surface (double)
     */
    double surface();
}

