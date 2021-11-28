package jove.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jove.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
	
}
