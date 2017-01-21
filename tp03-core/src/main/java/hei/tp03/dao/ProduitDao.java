package hei.tp03.dao;

import hei.tp03.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitDao extends JpaRepository<Produit, Long> {

    List<Produit> findByNom(String nom);
}
