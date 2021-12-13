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

	@Autowired
	private OwnerService ownerService;

	@Override
	public void run(String... args) throws Exception 
	{
		// Student student = new Student("werewfwer");
		// studentService.save(student);
//
//		Course course = new Course("Chumma oru course");
//		courseService.save(course);

		Client client = new Client("Thara", "123456789", "thara133", "password", "23, james nagar, koramangala");
		clientService.addClient(client);

		ProjectOrder project = new ProjectOrder("SoftwareName", "General", "2020-11-15", "2023-11-15", client);
		projectOrderService.addProjectOrder(project);

//		Create a software project
		Software software = new Software("Hello",  "2025-11-15",  "2024-11-15", project);
		softwareService.addSoftware(software);

		Programmer programmer = new Programmer("TharaDas", 5, "Java, Python", "Software dev", "2017-11-15", "thara123", "password", software);
		programmerService.addProgrammer(programmer);

		Programmer programmer2 = new Programmer("Second Programmer", 5, "Java, Python", "Software dev", "2017-11-15", "thara123", "password", software);
		programmerService.addProgrammer(programmer2);

		ProjectLead projectLead = new ProjectLead("Kishore", 9, "Java, SpringBoot", "Web dev", "2002-11-15","thara123", "password", software);
		projectLeadService.addProjectLead(projectLead);

		Owner owner = new Owner("Balaji", "balaji1234");
		ownerService.addOwner(owner);

	}

}

