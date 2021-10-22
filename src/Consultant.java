import java.util.ArrayList;

public class Consultant extends Person {

	private String expertise;
	private ArrayList<Patient> collectionOfPatients = new ArrayList<Patient>();

	public Consultant(Name name, String phone, String email, String expertise) {
		super(name, phone, email);
		this.expertise = expertise;
	}

	//Getters
	public String getExpertise() {
		return this.expertise;
	}
	public ArrayList<Patient> getCollectionOfPatients() {
		return this.collectionOfPatients;
	}
	//Setters
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public void setCollectionOfPatients(ArrayList<Patient> collectionOfPatients) {
		this.collectionOfPatients = collectionOfPatients;
	}


	public void addPatient(Patient patient) {
		this.collectionOfPatients.add(patient);
	}

	public void removePatient(String phone_number){
		for (int i = 0; i < this.getCollectionOfPatients().size(); i++){
			if (this.getCollectionOfPatients().get(i).getPhone().equals(phone_number)){
				this.getCollectionOfPatients().remove(i);
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "Consultant - " + this.getName().toString();
	}
}