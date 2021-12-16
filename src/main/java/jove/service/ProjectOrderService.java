package jove.service;
import java.util.List;

import jove.entity.ProjectOrder;
//import jove.entity.Review;
import jove.repository.ProjectOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectOrderService {

    @Autowired
    private ProjectOrderRepository projectOrderRepository;

    @Transactional
    public List<ProjectOrder> getAllProjectOrder() {
        return projectOrderRepository.findAll();
    }

    @Transactional
    public ProjectOrder getProjectOrderById(int id) {
        return projectOrderRepository.findById(id).isPresent() ? projectOrderRepository.findById(id).get() : null;
    }

    @Transactional
    public void addProjectOrder(ProjectOrder project) {
        projectOrderRepository.save(project);
    }

    @Transactional
    public void updateProjectOrder(ProjectOrder project) {
        projectOrderRepository.save(project);
    }

    @Transactional
    public void deleteProjectOrder(ProjectOrder projectOrder) {
        projectOrderRepository.delete(projectOrder);
    }

}

