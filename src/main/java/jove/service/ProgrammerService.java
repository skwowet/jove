package jove.service;

import java.util.List;
import java.util.Optional;

import jove.entity.Client;
import jove.entity.Programmer;

import jove.repository.ProgrammerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProgrammerService {

    @Autowired
    private ProgrammerRepository programmerRepository;

    @Transactional
    public List<Programmer> getAllProgrammer() {
        return programmerRepository.findAll();
    }

    @Transactional
    public Programmer getProgrammerById(int id) {
        return programmerRepository.findById(id).isPresent() ? programmerRepository.findById(id).get() : null;
    }

    @Transactional
    public void addProgrammer(Programmer programmer) {
        programmerRepository.save(programmer);
    }

    @Transactional
    public void updateProgrammer(Programmer programmer) {
        programmerRepository.save(programmer);
    }

    @Transactional
    public void deleteProgrammer(int id) {
        programmerRepository.deleteById(id);
    }
}