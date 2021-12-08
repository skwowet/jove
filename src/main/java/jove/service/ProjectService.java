package jove.service;
import java.util.List;

import jove.entity.Client;
import jove.entity.Project;
import jove.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Transactional
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Transactional
    public Project getProjectById(int id) {
        return projectRepository.findById(id).isPresent() ? projectRepository.findById(id).get() : null;
    }

    @Transactional
    public void addProject(Project project) {
        projectRepository.save(project);
    }

    @Transactional
    public void updateProject(Project project) {
        projectRepository.save(project);
    }

    @Transactional
    public void deleteProject(int id) {
        projectRepository.deleteById(id);
    }
}

