package pcpes.ddd7651.projets.concerts.model;

import java.util.Date;

public class Concert {

	private Tournee tournee;
	private Salle salle;
	private Date date;

	public Concert() {
		super();
	}

	public Tournee getTournee() {
		return tournee;
	}

	public void setTournee(Tournee tournee) {
		this.tournee = tournee;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
