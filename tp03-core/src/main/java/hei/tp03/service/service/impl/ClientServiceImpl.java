package hei.tp03.service.service.impl;

import hei.tp03.dao.ClientDao;
import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class ClientServiceImpl implements ClientService {

    @Inject
    private ClientDao clientDao;

    @Override
    public List<Client> findByNom(String nom) {
        //la méthode s'appelle elle-même et elle retourne findByNom de la DAO
        return clientDao.findByNom(nom);
    }

    @Override
    public Client saveClient(Client client) {
        //la méthode s'appelle elle-même et elle retourne save de la DAO
        return clientDao.save(client);
    }

    @Override
    public List<Client> findAll() {
        //la méthode s'appelle elle-même et elle retourne finAll de la DAO
        return clientDao.findAll();
    }
}
