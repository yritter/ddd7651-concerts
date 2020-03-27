package pcpes.ddd7651.projets.concerts.model;

public class Tournee {

	private String nom;
	private Groupe groupe;

	public Tournee(String nom, Groupe groupe) {
		super();
		this.nom = nom;
		this.groupe = groupe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
}
