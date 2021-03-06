package hei.tp03.service;


import hei.tp03.entity.Produit;

import java.util.List;

/**
 * Created by audrey on 21/01/2017.
 */
public interface ProduitService {

    List<Produit> findByNom(String nom);

    Produit saveProduit(Produit produit);

    List<Produit> findAll();

    //On crée une méthode qui trouve le produit selon l'id de la commande
    List<Produit> findByCommande(int id);
}
