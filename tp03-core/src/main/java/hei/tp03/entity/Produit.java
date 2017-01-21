package hei.tp03.entity;

import javax.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="nom")
    private String nom;

    //il peut y avoir une commande pour plusieurs produits
    @ManyToOne
    private Commande commande;

    public Produit(){

    }

    public Produit(String nom, Commande commande){
        this.nom = nom;
        this.commande = commande;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
