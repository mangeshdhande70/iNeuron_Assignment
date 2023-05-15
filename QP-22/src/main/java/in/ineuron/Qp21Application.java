package in.ineuron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ineuron.controller.UserController;



@SpringBootApplication
public class Qp21Application implements CommandLineRunner {
	
	@Autowired
	private UserController controller;

	public static void main(String[] args) {
		SpringApplication.run(Qp21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		controller.registerUser();
		
//		controller.order();
		
		
	}

}
