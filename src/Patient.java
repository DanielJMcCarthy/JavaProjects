import java.util.ArrayList;
import java.util.Date;

class Patient extends Person{
	private String condition;
	private Integer severity;
	private ArrayList<Visit> collectionOfVisits = new ArrayList<Visit>();

	public Patient(Name name, String phone, String email, String condition, int severity){
		super(name, phone , email);

		if ( severity < 1){
			System.out.println("Severity is too low");
			System.out.println("Severity set to 1");
			severity = 1;
		} else if( severity > 5){
			System.out.println("Severity is too high");
			System.out.println("Severity set to 5");
			severity = 5;
		}

		this.condition = condition;
		this.severity = severity; //wrapper class???


	}
	//Getters
	public String getCondition(){
		return this.condition;
	}
	public int getSeverity(){
		return this.severity;
	}
	public ArrayList<Visit> getCollectionOfVisits(){
		return this.collectionOfVisits;
	}
	//Setters
	public void setCondition(String condition){
		this.condition = condition;
	}
	public void setSeverity(int severity){
		this.severity = severity;
	}
	public void setCollectionOfVisits(ArrayList<Visit> collectionOfVisits){
		this.collectionOfVisits = collectionOfVisits;
	}


	public void addVisit(Visit visit){
		this.collectionOfVisits.add(visit);
	}

	public void removeVisit(Date date){
		for (int i = 0; i < this.getCollectionOfVisits().size(); i++){
			if (this.getCollectionOfVisits().get(i).getDate().equals(date)){
				this.collectionOfVisits.remove(i);
				break;
			}
		}
	}


	@Override
	public String toString() {
		return "Patient - " + this.getName().toString();
	}
}