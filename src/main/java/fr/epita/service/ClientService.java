package fr.epita.service;


import fr.epita.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getClients();
    Optional<Client> getClientById(Long id);

    Client createClient(Client client);
    Client updateClient(Client client);

}
