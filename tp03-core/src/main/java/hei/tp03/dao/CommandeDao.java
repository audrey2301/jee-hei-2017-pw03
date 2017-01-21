package hei.tp03.dao;

import hei.tp03.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeDao extends JpaRepository<Commande, Long> {

    List<Commande> findByNom(String nom);

}
