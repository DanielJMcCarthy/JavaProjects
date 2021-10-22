/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

public class Contact {

	//*****************************************************************
	//Declare variables used in Contact details
	//*****************************************************************
	private String firstName;
	private String surname;

	private String uniqueID;
	private String phoneNumber;



	//*****************************************************************
	//Initialise variables for use in Contact methods
	//*****************************************************************
	public Contact (String fname, String sname, String id, String phone){
		firstName = fname;
		surname = sname;
		uniqueID = id;
		phoneNumber = phone;
	}




	//*****************************************************************
	//Display the information to TextArea
	//*****************************************************************
	public String toString ()
	{
		String format = 
				"*****************************************************************" + "\n" +
						"\t" + "The name of the contact is "+ firstName + " " + surname + ". " + "\n" +
						"\t" + "The ID number of the contact is " + uniqueID + ". " + "\n" +
						"\t" + "The phone number of the contact is " + phoneNumber + "." + "\n" +
						"*****************************************************************" + "\n";

		return format;
	}


}
