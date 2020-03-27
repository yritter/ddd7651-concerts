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
			
			String stringDate01 = "31/08/2021";
			Date dateConcert01 = sdf.parse(stringDate01);
			Concert concert01 = new Concert(dateConcert01);
			concertsPrevus.add(concert01);
			
			String stringDate02 = "15/09/2021";
			Date dateConcert02 = sdf.parse(stringDate02);
			Concert concert02 = new Concert(dateConcert02);
			concertsPrevus.add(concert02);
			
			String stringDate03 = "02/05/2021";
			Date dateConcert03 = sdf.parse(stringDate03);
			Concert concert03 = new Concert(dateConcert03);
			concertsPrevus.add(concert03);

		} catch (ParseException e) {
			System.out.println("Erreur lors d'une tentative de creation de date. ");
			e.printStackTrace();

		}
		return concertsPrevus;

	}

}
