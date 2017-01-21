package hei.tp03.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="validee")
    private Boolean validee;

    @ManyToOne
    private Client client;

    //il peut y avoir plusieurs produit pour une commande
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="commande")
    private List<Produit> produit;

    public Commande(Client client){

    }

    public Commande(Boolean validee, Client client){
        this.validee = validee;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public Boolean getValidee() {
        return validee;
    }

    public void setValidee(Boolean validee) {
        this.validee = validee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }
}
