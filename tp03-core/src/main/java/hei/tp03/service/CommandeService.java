package hei.tp03.service;

import hei.tp03.entity.Commande;

import java.util.List;

public interface CommandeService {

    List<Commande> findByNom(String nom);

    Commande saveCommande(Commande commande);

    List<Commande> findAll();
}
