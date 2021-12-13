package jove.service;

import java.util.List;

import jove.entity.Client;
import jove.entity.Owner;
import jove.repository.ClientRepository;
import jove.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Transactional
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }

    @Transactional
    public Owner getOwnerById(int id) {
        return ownerRepository.findById(id).isPresent() ? ownerRepository.findById(id).get() : null;
    }

    @Transactional
    public void addOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Transactional
    @Modifying
    public void updateOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Transactional
    public void deleteOwner(int id) {
        ownerRepository.deleteById(id);
    }
}