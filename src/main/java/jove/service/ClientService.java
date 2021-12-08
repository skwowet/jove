package jove.service;

import java.util.List;

import jove.entity.Client;
import jove.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client getClientById(int id) {
        return clientRepository.findById(id).isPresent() ? clientRepository.findById(id).get() : null;
    }

    @Transactional
    public void addClient(Client client) {
        clientRepository.save(client);
    }

    @Transactional
    public void updateClient(Client client) {
        clientRepository.save(client);
    }

    @Transactional
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}