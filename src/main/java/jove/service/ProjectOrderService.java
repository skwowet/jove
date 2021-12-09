package jove.service;
import java.util.List;

import jove.entity.ProjectOrder;
import jove.repository.ProjectOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectService {

    @Autowired
    private ProjectOrderRepository projectOrderRepository;

    @Transactional
    public List<ProjectOrder> getAllProject() {
        return projectOrderRepository.findAll();
    }

    @Transactional
    public ProjectOrder getProjectById(int id) {
        return projectOrderRepository.findById(id).isPresent() ? projectOrderRepository.findById(id).get() : null;
    }

    @Transactional
    public void addProject(ProjectOrder project) {
        projectOrderRepository.save(project);
    }

    @Transactional
    public void updateProject(ProjectOrder project) {
        projectOrderRepository.save(project);
    }

    @Transactional
    public void deleteProject(int id) {
        projectOrderRepository.deleteById(id);
    }
}

