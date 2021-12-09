package jove.repository;

import jove.entity.ProjectLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectLeadRepository extends JpaRepository<ProjectLead, Integer> {

}