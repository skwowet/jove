package jove;

import jove.entity.*;
import jove.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private ClientService clientService;

	@Autowired
	private ProjectOrderService projectOrderService;

	@Autowired
	private SoftwareService softwareService;

	@Autowired
	private ProjectLeadService projectLeadService;

	@Autowired
	private ProgrammerService programmerService;

	@Override
	public void run(String... args) throws Exception 
	{
		// Student student = new Student("werewfwer");
		// studentService.save(student);
//
//		Course course = new Course("Chumma oru course");
//		courseService.save(course);

		Client client = new Client("Thara", "123456789", "thara133", "password");
		clientService.addClient(client);

		ProjectOrder project = new ProjectOrder("SoftwareName", "General", "12-23-2302", "12-04-2020", client);
		projectOrderService.addProject(project);

//		Create a software project
		Software software = new Software("Hello", "23-09-2003", "30-02-2005", project);
		softwareService.addSoftware(software);

		Programmer programmer = new Programmer("TharaDas", 5, "Java, Python", "Software dev", "12-23-2020", software);
		programmerService.addProgrammer(programmer);

		ProjectLead projectLead = new ProjectLead("Kishore", 9, "Java, SpringBoot", "Web dev", "12-03-2009", software);
		projectLeadService.addProjectLead(projectLead);



	}

}

