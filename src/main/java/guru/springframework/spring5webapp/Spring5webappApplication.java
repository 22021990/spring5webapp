package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

	/*
	after we added Publisher

	when we run this application, spring is initializing. It's going to bring up Hibernate.
	Hibernate is going to see your JPA configuration, creates out database,
	the bootstrap class runs and inserts data into H2.
	 */
}
