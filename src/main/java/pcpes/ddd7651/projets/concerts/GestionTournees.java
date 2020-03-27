package pcpes.ddd7651.projets.concerts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pcpes.ddd7651.projets.concerts.model.Concert;

@SpringBootApplication
@RestController
public class GestionTournees {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}

	@GetMapping("/concertsPrevus")
	public List<Concert> concertsPrevus() {
		return null;		

	}
	
}
