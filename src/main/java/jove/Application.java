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

		//	Default data

		Client client1 = new Client("John Doe", 9894007234L, "john123", "examplepassword", "23, New Street, New York, NY, USA");
		clientService.addClient(client1);

		Client client2 = new Client("Jane Jose", 9894107234L, "jane123", "dummypassword", "34, Lake Street, New York, NY, USA");
		clientService.addClient(client2);

		Client client3 = new Client("Jack Dane", 9894207234L, "jack123", "hellworld@123", "45, Central Street, New York, NY, USA");
		clientService.addClient(client3);

		Client client4 = new Client("Jill JollyD", 9894307234L, "jill123", "kidding@raj", "56, Park Street, New York, NY, USA");
		clientService.addClient(client4);



		ProjectOrder project1 = new ProjectOrder("Jove", "General", "IN-PROGRESS","2020-11-15", "2023-11-15", client1);
		projectOrderService.addProjectOrder(project1);

		ProjectOrder project2 = new ProjectOrder("Craykon", "Finance", "DONE","2020-12-55", "2021-11-15", client2);
		projectOrderService.addProjectOrder(project2);



		Software software1 = new Software("IN_PROGRESS",  "2023-10-15",  "2020-12-15", project1);
		softwareService.addSoftware(software1);

		Software software2 = new Software("DONE",  "2023-10-15",  "2020-12-15", project2);
		softwareService.addSoftware(software2);



		Programmer programmer1 = new Programmer("Kene", 5, "Java, Python", "Web development", "2017-11-15", "kene1234", "kenpass", software1);
		programmerService.addProgrammer(programmer1);

		Programmer programmer2 = new Programmer("Lakshmi Sundar", 3, "Python, Go", "App development", "2015-04-05", "lakshmi12", "sundar@2334", software1);
		programmerService.addProgrammer(programmer2);

		Programmer programmer3 = new Programmer("Raj", 4, "HTML, CSS, JavaScript", "Software development", "2019-11-15", "raj1234", "rajpass", software2);
		programmerService.addProgrammer(programmer3);



		ProjectLead projectLead1 = new ProjectLead("Kishore", 9, "Java, SpringBoot", "Web development", "2010-11-15","thara123", "chummaorupass", software1);
		projectLeadService.addProjectLead(projectLead1);

		ProjectLead projectLead2 = new ProjectLead("Rajesh", 9, "JavaScript, React", "Desktop development", "2008-05-20","raj123", "hello@password", software2);
		projectLeadService.addProjectLead(projectLead2);



		Owner owner = new Owner("Ram Kumar", "ramkumar");
		ownerService.addOwner(owner);

	}

}

