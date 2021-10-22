//************************************************************************************
//I was going to make this an abstract class with abstract methods for its subclasses.
//It fully functions with only the public modifier though.
//For further comments on the classes, see test.java .
//************************************************************************************
public class Person{ 
	private Name name;
	private String phone;
	private String email;

	public Person(){
		this.name = new Name();
		this.phone = "";
		this.email = "";
	}

	public Person(Name name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;

	}

	public Name getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getEmail(){
		return this.email;
	}
	public void setName(Name name){
		this.name = name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setEmail(String email){
		this.email = email;
	}

}