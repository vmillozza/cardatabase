package com.packt.cardatabase;

//import java.util.Arrays;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {

	/*@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository ownerepository;*/
	//private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		// LoggerFactory.getLogger(...): Questa è una chiamata a un metodo statico della
		// classe LoggerFactory che restituisce un'istanza di Logger. L'oggetto Logger
		// restituito sarà configurato per registrare messaggi per la classe fornita
		// come argomento, in questo caso CardatabaseApplication.class.

		// DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Date date = new Date();
		// After adding this comment the application is restarted
		SpringApplication.run(CardatabaseApplication.class, args);
		// log.info("Application started at:" +dateFormat.format(date));
	}


	@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to db 
		/*Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new  Owner("Mary" , "Robinson");
		ownerepository.saveAll(Arrays.asList(owner1, owner2));

		// Add car object and link to owners and save these to db
		Car car1 = new Car("Ford", "Mustang", "Red", 
				"ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", 
				"SSJ-3002", 2019, 29000, owner2);
		Car car3 = new Car("Toyota", "Prius", "Silver", 
				"KKO-0212", 2020, 39000, owner2);
		repository.saveAll(Arrays.asList(car1, car2, car3));
                  
		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}*/
	}
}
