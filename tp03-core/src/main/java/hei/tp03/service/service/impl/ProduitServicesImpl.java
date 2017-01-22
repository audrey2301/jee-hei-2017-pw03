package hei.tp03.service.service.impl;

import hei.tp03.dao.ProduitDao;
import hei.tp03.entity.Produit;
import hei.tp03.service.ProduitService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class ProduitServicesImpl implements ProduitService {

    @Inject
    private ProduitDao produitDao;

    @Override
    public List<Produit> findByNom(String nom) {
        return produitDao.findByNom(nom);
    }

    @Override
    public Produit saveProduit(Produit produit) {
        return produitDao.save(produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    @Override
    public List<Produit> findByCommande(int id) {
        return findByCommande(id);
    }
}
