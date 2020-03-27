package pcpes.ddd7651.projets.concerts.model;

import java.util.Date;

public class Concert {

	private Date date;

	public Concert() {
		super();
	}

	public Concert(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
