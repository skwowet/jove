package jove.service;
import java.util.List;

import jove.entity.ProjectLead;
import jove.repository.ProjectLeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectLeadService {

    @Autowired
    private ProjectLeadRepository projectLeadRepository;

    @Transactional
    public List<ProjectLead> getAllProjectLead() {
        return projectLeadRepository.findAll();
    }

    @Transactional
    public ProjectLead getProjectLeadById(int id) {
        return projectLeadRepository.findById(id).isPresent() ? projectLeadRepository.findById(id).get() : null;
    }

    @Transactional
    public void addProjectLead(ProjectLead projectLead) {
        projectLeadRepository.save(projectLead);
    }

    @Transactional
    public void updateProjectLead(ProjectLead projectLead) {
        projectLeadRepository.save(projectLead);
    }

    @Transactional
    public void deleteProjectLead(int id) {
        projectLeadRepository.deleteById(id);
    }
}

