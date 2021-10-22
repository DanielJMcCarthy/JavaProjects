import java.util.Date;


public class Visit{
	private Date date;
	private Consultant consultant;

	public Visit(Date date, Consultant consultant) {
		this.date = date;
		this.consultant = consultant;
	}

	//Getters
	public Consultant getConsultant() {
		return consultant;
	}
	public Date getDate() {
		return date;
	}
	//Setters
	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return  "Visit - " + this.date;
	}
}
