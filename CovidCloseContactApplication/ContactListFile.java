/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
/*
package CovidCloseContactApplication;


import java.io.File;

/*
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
*/

//public class ContactListFile {

	//public File covidContactListFile = 
	//		new File("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt");

/*//TODO

	//*****************************************************************
	//Create clone object of closeContacts
	//*****************************************************************
	ContactList contactListFile = new ContactList();
	Contact[] closeContactsForFile = contactListFile.getContactList();



	//*****************************************************************
	//Write closeContacts to file
	//*****************************************************************
	public void saveFile(){

		try
		{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt"));
			{
				outputStream.writeObject(closeContactsForFile);
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
	public void loadFile(){

		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt"));

			closeContactsForFile = (Contact[]) inputStream.readObject();
			System.out.println("Here is the loaded list of close contacts" + closeContactsForFile.length);


			inputStream.close();

		}catch(Exception e){
			System.out.println("Could not save file");
			e.printStackTrace();
		}

	}
*///TODO

//}