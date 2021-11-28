package jove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jove.entity.Course;
import jove.service.CourseService;
import jove.service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;

	@Override
	public void run(String... args) throws Exception 
	{
		// Student student = new Student("werewfwer");
		// studentService.save(student);
		Course course = new Course("sdfdsfsd");
		courseService.save(course);
		// student.addCourse(course);
		// studentService.save(student);
		// course.addStudent(student);
		// courseService.save(course);
	}

}

