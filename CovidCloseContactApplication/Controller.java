/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

//import java.io.File;

public class Controller {


	private ContactList contactList;
	//private ContactListFile contactListFile;

	public Controller() {
		contactList = new ContactList();
		//contactListFile = new ContactListFile();//TODO
	}



	//*****************************************************************
	//Method to add a contact to ArrayList<Contact>
	//*****************************************************************

	public void addContact(String firstName, String lastName, String uniqueID, String phoneNumber) {

		Contact contact = new Contact(firstName, lastName, uniqueID, phoneNumber);
		contactList.addCloseContactToList(contact);

	}



	//*****************************************************************
	//Method to return contacts from ArrayList
	//*****************************************************************

	public String listOfContacts() {

		String allContacts = " ";
		for (int i = 0; i < contactList.amountOfContacts(); i++) {
			allContacts = allContacts + contactList.getCloseContacts(i);

		}

		return allContacts;

	}


	//*****************************************************************
	//Method to remove contact from ArrayList
	//*****************************************************************

	public void removeLastContact() {

		contactList.removeCloseContactFromList();
		return;

	}



	//*****************************************************************
	//Populate ContactList in ContactListFile
	//*****************************************************************
	public void populate(){

		contactList.populateContactListFile();

	}
	//TODO
	//*****************************************************************
	//Method to return loadFile from ContactListFile
	//*****************************************************************

	public void loadFileFromContactListFile(){

		contactList.loadFile();

	}
 
	//*****************************************************************
	//Method to saveFile
	//*****************************************************************

	public void saveFileFromContactListFile(){

		contactList.saveFile();

	}
	
}

