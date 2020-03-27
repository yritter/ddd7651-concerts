package pcpes.ddd7651.projets.concerts.model;

import java.util.List;

public class Groupe {

	private String nom;
	private List<Musicien> musiciens;

	public Groupe() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Musicien> getMusiciens() {
		return musiciens;
	}

	public void setMusiciens(List<Musicien> musiciens) {
		this.musiciens = musiciens;
	}

}
