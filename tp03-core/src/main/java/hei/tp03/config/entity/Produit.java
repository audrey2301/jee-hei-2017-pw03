package hei.tp03.config.entity;

/**
 * Created by audrey on 17/01/2017.
 */
public class Produit {

    private String nom;
    private Commande commande;

    public Produit(){

    }

    public Produit(String nom, Commande commande){
        this.nom = nom;
        this.commande = commande;
    }
}
