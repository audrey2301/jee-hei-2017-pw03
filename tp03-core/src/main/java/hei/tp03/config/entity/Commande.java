package hei.tp03.config.entity;

import java.util.List;

/**
 * Created by audrey on 17/01/2017.
 */
public class Commande {

    private Boolean validee;
    private Client client;
    private List<Produit> produit;

    public Commande(){

    }

    public Commande(Boolean validee, Client client, List<Produit> produit){
        this.validee = validee;
        this.client = client;
        produit = produit;
    }
}
