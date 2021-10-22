import java.util.ArrayList;

public class Practice{
	ArrayList<Consultant> collectionOfConsultants = new ArrayList<Consultant>();

	public Practice(){

	}

	public Practice(ArrayList<Consultant> collectionOfConsultants){
		this.collectionOfConsultants = collectionOfConsultants;
	}

	//Getter
	public ArrayList<Consultant> getCollectionOfConsultants(){
		return this.collectionOfConsultants;
	}
	//Setter
	public void setCollectionOfConsultants(ArrayList<Consultant> collectionOfConsultants){
		this.collectionOfConsultants = collectionOfConsultants;
	}


	public void addConsultant(Consultant consultant){
		this.collectionOfConsultants.add(consultant);
	}

	public void removeConsultant(String phone_number){
		// phone number for removing consultant as it is unique
		for (int i = 0; i < this.getCollectionOfConsultants().size(); i++){
			if (this.getCollectionOfConsultants().get(i).getPhone().equals(phone_number)){
				this.collectionOfConsultants.remove(i);
				break;
			}
		}

	}

	public Consultant getConsultant(String email){ // email = unique to individual too
		for (int i = 0; i < this.getCollectionOfConsultants().size(); i++){
			if (this.getCollectionOfConsultants().get(i).getEmail().equals(email)){
				return this.getCollectionOfConsultants().get(i);
			}
		}
		return null;
	}

	public Patient getPatient(String email){
		for (int i = 0; i < this.getCollectionOfConsultants().size(); i++){
			Consultant consultant = this.getCollectionOfConsultants().get(i);

			for (int j = 0; j < consultant.getCollectionOfPatients().size(); j++){
				if (consultant.getCollectionOfPatients().get(j).getEmail().equals(email)){
					return consultant.getCollectionOfPatients().get(j);
				}

			}
		}
		return null;
	}

	public ArrayList<Patient> getPatientsByName(Name name){//Search for patient given patient first, middle, last names.
		/*
		Creates an empty array list of patients.
		Searches through all the patients. If a patient matches the name given then it is added to the matching arrayList.
		At the end the matching ArrayList is returned.
		 */
		ArrayList<Patient> matching = new ArrayList<Patient>();

		for (int i = 0; i < this.getCollectionOfConsultants().size(); i++){
			Consultant consultant = this.getCollectionOfConsultants().get(i);

			for (int j = 0; j < consultant.getCollectionOfPatients().size(); j++){
				Patient tempPatient = consultant.getCollectionOfPatients().get(j);
				Name patientName = tempPatient.getName();
				if (name.getFirstName().equals(patientName.getFirstName()) &&
						name.getMiddleName().equals(patientName.getMiddleName()) &&
						name.getLastName().equals(patientName.getLastName())){

					matching.add(tempPatient);
				}

			}
		}
		return matching;
	}

	public ArrayList<Consultant> getConsultantsByName(Name name){
		/*
		Creates an empty array list of consultants.
		Searches through all the consultants. If a consultant matches the name given then it is added to the matching arrayList.
		At the end the matching ArrayList is returned
		 */
		ArrayList<Consultant> matching = new ArrayList<Consultant>();

		for (int i = 0; i < this.getCollectionOfConsultants().size(); i++){
			Consultant consultant = this.getCollectionOfConsultants().get(i);
			Name consultantName = consultant.getName();

			if (name.getFirstName().equals(consultantName.getFirstName()) &&
					name.getMiddleName().equals(consultantName.getMiddleName()) &&
					name.getLastName().equals(consultantName.getLastName())){

				matching.add(consultant);
			}

		}
		return matching;
	}
}