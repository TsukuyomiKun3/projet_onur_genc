package fr.epita.service;

import fr.epita.entity.Client;
import fr.epita.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;


    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        Optional<Client> optionalClient = getClientById(client.getId());
        System.out.println("Inside the function");

        if (optionalClient.isPresent()) {
            return clientRepository.save(client);
        } else {
            return null;
        }
    }
}
