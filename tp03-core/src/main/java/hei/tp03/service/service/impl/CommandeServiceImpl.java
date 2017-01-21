package hei.tp03.service.service.impl;

import hei.tp03.dao.CommandeDao;
import hei.tp03.entity.Commande;
import hei.tp03.service.CommandeService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class CommandeServiceImpl implements CommandeService {

    @Inject
    private CommandeDao commandeDao;

    @Override
    public List<Commande> findByNom(String nom) {
        return commandeDao.findByNom(nom);
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeDao.save(commande);
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }
}
