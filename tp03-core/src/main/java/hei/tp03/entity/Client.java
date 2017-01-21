package hei.tp03.entity;

//import org.hibernate.javax.persistence.CascadeType;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    //il peut y avoir plusieurs commandes pour un client
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
    private List<Commande> commandes;

    public Client(){

    }

    public Client(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
