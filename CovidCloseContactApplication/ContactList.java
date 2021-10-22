/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.File;


public class ContactList {



	//*****************************************************************
	//Create ArrayList to store the list of contacts
	//*****************************************************************

	public ArrayList<Contact> closeContacts;
	String contact = " ";


	//Start the list
	public ContactList() {

		closeContacts = new ArrayList<Contact>();

	}

	//*****************************************************************
	//Populate the arrayList with information (for testing)
	//*****************************************************************
	public void populateContactListFile(){


		Contact contact1 = new Contact("Daniel", "McCarthy", "12345", "0883014071");
		closeContacts.add(contact1);
		Contact contact2 = new Contact("Dara", "Daly", "12335", "0883015181");
		closeContacts.add(contact2);

	}
/*//TODO
	//*****************************************************************
	//Create clone of closeContacts to save and load from file
	//*****************************************************************

	public Contact[] getContactList() {

		return (Contact[]) closeContacts.clone();

	}
*/


	//*****************************************************************
	//Method to keep track of the number of contacts
	//*****************************************************************

	public int amountOfContacts() {

		return closeContacts.size();

	}



	//*****************************************************************
	//Display the list of contacts 
	//*****************************************************************

	public ArrayList<Contact> getListOfCloseContacts() {

		return closeContacts;

	}


	//*****************************************************************
	//Remove a contact from the list 
	//*****************************************************************
	public void removeCloseContactFromList() {

		closeContacts.remove(closeContacts.size() - 1);
		

	}



	//*****************************************************************
	//Add a contact to the list 
	//*****************************************************************
	public void addCloseContactToList(Contact details) {

		closeContacts.add(details);

	}



	//*****************************************************************
	//Method to return contacts
	//*****************************************************************

	public Contact getCloseContacts(int i) {

		if ((i >= 0) && (i < closeContacts.size()))
			return closeContacts.get(i);

		else{

			return null;

		}


	}

	//*****************************************************************
	//Write closeContacts to file
	//*****************************************************************
	
	public void saveFile(){

		try
		{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt"));
			{
				outputStream.writeObject(closeContacts);
			}

			outputStream.close();

		}catch(Exception e){
			System.out.println("Could not save file");
			e.printStackTrace();
		}
	}
	
	
	//*****************************************************************
	//Load closeContacts from file
	//*****************************************************************
	@SuppressWarnings("unchecked")//A warning by which the compiler indicates that it cannot ensure type safety.
	public void loadFile(){

		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt"));

			closeContacts = (ArrayList<Contact>) inputStream.readObject();
			System.out.println("Here is the loaded list of close contacts" + closeContacts.size());


			inputStream.close();

		}catch(Exception e){
			System.out.println("Could not load file");
			e.printStackTrace();
		}

	}
	

}