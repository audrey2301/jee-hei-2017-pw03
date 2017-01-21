package hei.tp03.service;

import hei.tp03.entity.Client;

import java.util.List;

public interface ClientService {

    List<Client> findByNom(String nom);

    Client saveClient(Client client);

    List<Client> findAll();
}
