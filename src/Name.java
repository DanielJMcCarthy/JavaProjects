public class Name{
	private String firstName;
	private String middleName;
	private String lastName;

	public Name(){
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
	}

	public Name(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}


	public String getFirstName(){
		return this.firstName;
	}
	public String getMiddleName(){
		return this.middleName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName){
		this.middleName = middleName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}