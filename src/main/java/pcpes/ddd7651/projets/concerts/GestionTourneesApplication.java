package pcpes.ddd7651.projets.concerts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pcpes.ddd7651.projets.concerts.model.Concert;

@SpringBootApplication
@RestController
public class GestionTourneesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionTourneesApplication.class, args);

	}

	@GetMapping("/concertsPrevus")
	public List<Concert> concertsPrevus() {

		List<Concert> concertsPrevus = new ArrayList<Concert>();

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
			String dateInString = "31/08/2021";
			Date dateConcert = sdf.parse(dateInString);

			Concert concert01 = new Concert(dateConcert);
			concertsPrevus.add(concert01);

		} catch (ParseException e) {
			System.out.println("Erreur lors d'une tentative de creation de date. ");
			e.printStackTrace();

		}
		return concertsPrevus;

	}

}
