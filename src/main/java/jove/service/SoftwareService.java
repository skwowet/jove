package jove.service;
import java.util.List;
import java.util.Optional;

import jove.entity.Software;

import jove.repository.SoftwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SoftwareService {

    @Autowired
    private SoftwareRepository softwareRepository;

    @Transactional
    public List<Software> getAllSoftware() {
        return softwareRepository.findAll();
    }

    @Transactional
    public Software getSoftwareById(int id) {
        return softwareRepository.findById(id).isPresent() ? softwareRepository.findById(id).get() : null;
    }

    @Transactional
    public void addSoftware(Software software) {
        softwareRepository.save(software);
    }

    @Transactional
    public void updateSoftware(Software software) {
        softwareRepository.save(software);
    }

    @Transactional
    public void deleteSoftware(int id) {
        softwareRepository.deleteById(id);
    }

}
