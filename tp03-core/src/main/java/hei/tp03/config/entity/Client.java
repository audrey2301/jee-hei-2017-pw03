package hei.tp03.config.entity;

import java.util.List;

/**
 * Created by audrey on 17/01/2017.
 */

public class Client {

    private String nom;
    private String prenom;
    private List<Commande> commandes;

    public Client(){

    }

    public Client(String nom, String prenom, List<Commande> commandes){
        this.nom = nom;
        this.prenom = prenom;
        this.commandes = commandes;
    }

}
