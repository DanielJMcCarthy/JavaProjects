/* STUDENT DETAILS:
 * Name: 		Daniel John McCarthy
 * Student ID: 	R00151837
 * Autumn 2020 Repeat Project.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		{

			Practice practice = new Practice();

			//String reader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//userChoice scanner
			Scanner in = new Scanner(System.in);

			//Variables
			boolean running = true;

			String months[] = 
				{
						"Jan","Feb","Mar","Apr","May","Jun",
						"Jul","Aug","Sep","Oct","Nov","Dec"         
				};
			//Create Calendar for display of Date + Time
			Calendar calendar = Calendar.getInstance();

			//Welcome Banner
			System.out.println("===========================================================");
			System.out.println("-----------------------------------------------------------");
			System.out.println("\t" + "Welcome To The Hospital Consultancy System");
			System.out.println("-----------------------------------------------------------");
			System.out.println("===========================================================");
			//Date and time function
			System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] 
					+ " " + calendar.get(Calendar.DATE) 
					+ " " + calendar.get(Calendar.YEAR));
			System.out.println("\t\t\t\tTime: " + calendar.get(Calendar.HOUR) 
			+ ":" + calendar.get(Calendar.MINUTE));
			System.out.println("-----------------------------------------------------------");

			APPLICATION:
				while(running){

					System.out.println("-----------------------------------------------------------");

					//Choose an option from menu
					System.out.println("\n\t" + "Select an option from the menu below:" + "\n");

					//List of options
					System.out.println("\t" + "1.	Create a new Consultant");
					System.out.println("\t" + "2.	Create a new Patient linked to a Consultant");
					System.out.println("\t" + "3.	Record a Patient�s visit with their Consultant. ");
					System.out.println("\t" + "4.	Display all visits by a Patient given the Patients name.");
					System.out.println("\t" + "5.	Display all Patients of a particular Consultant.");
					System.out.println("\t" + "6.	Display all Consultants followed by their Patients followed by their visits.");
					System.out.println("\t" + "7.	Save all information to a file.");
					System.out.println("\t" + "8.	Load information from a file. ");
					System.out.println("\t" + "9.	Quit");

					//Get user input option.
					int userChoice = in.nextInt();

					switch (userChoice){

					case 1:{//Create a new Consultant.
						System.out.println("Enter First Name");
						String firstName = br.readLine();
						System.out.println("Enter Middle Name");
						String middleName = br.readLine();
						System.out.println("Enter Last Name");
						String lastName = br.readLine();

						System.out.println("Enter Phone Number");
						String phoneNumber = br.readLine();

						System.out.println("Enter Email");
						String email = br.readLine();

						System.out.println("Enter Expertise");
						String expertise = br.readLine();

						Consultant consultant = new Consultant(
								new Name(firstName, middleName, lastName),
								phoneNumber,
								email,
								expertise
								);

						practice.addConsultant(consultant);

						continue APPLICATION; //Label for main menu.
					}
					case 2:{ //Create a new Patient linked to a Consultant.
						System.out.println("Enter First Name");
						String firstName = br.readLine();
						System.out.println("Enter Middle Name");
						String middleName = br.readLine();
						System.out.println("Enter Last Name");
						String lastName = br.readLine();

						System.out.println("Enter Phone Number");
						String phoneNumber = br.readLine();

						System.out.println("Enter Email");
						String email = br.readLine();

						System.out.println("Enter Condition");
						String condition = br.readLine();

						System.out.println("Enter Severity");
						int severity = Integer.parseInt(br.readLine());

						Patient patient = new Patient(
								new Name(firstName, middleName, lastName),
								phoneNumber,
								email,
								condition,
								severity
								);

						System.out.println("Enter Consultants Email");
						String consultant_email = br.readLine();

						Consultant consultant = practice.getConsultant(consultant_email);
						consultant.addPatient(patient);

						continue APPLICATION;

					}
					case 3:{//Record a Patient’s visit with their Consultant.
						System.out.println("Enter Patients Email");
						String patientsEmail = br.readLine();

						System.out.println("Enter Consultants Email");
						String consultantsEmail = br.readLine();

						Patient patient = practice.getPatient(patientsEmail);
						Consultant consultant = practice.getConsultant(patientsEmail);

						System.out.println("Enter Visit in the format dd/mm/yyyy");
						String date_string = br.readLine();
						Date date = new SimpleDateFormat("dd/mm/yyyy").parse(date_string);

						Visit visit = new Visit(date, consultant);
						patient.addVisit(visit);

						continue APPLICATION;

					}
					case 4:{//Display all visits by a Patient given the Patients name.
						System.out.println("Enter First Name");
						String firstName = br.readLine();
						System.out.println("Enter Middle Name");
						String middleName = br.readLine();
						System.out.println("Enter Last Name");
						String lastName = br.readLine();

						Name name = new Name(firstName, middleName, lastName);
						ArrayList<Patient> matching = practice.getPatientsByName(name);
						for (int i = 0; i < matching.size(); i++){
							Patient patient = matching.get(i);
							for (int x = 0; x < patient.getCollectionOfVisits().size(); x++){
								Visit visit_temp = patient.getCollectionOfVisits().get(x);
								System.out.println(visit_temp.toString());
							}
						}
						continue APPLICATION;
					}
					case 5:{//Display all Patients of a particular Consultant.
						System.out.println("Enter First Name");
						String firstName = br.readLine();
						System.out.println("Enter Middle Name");
						String middleName = br.readLine();
						System.out.println("Enter Last Name");
						String lastName = br.readLine();

						Name name = new Name(firstName, middleName, lastName);
						ArrayList<Consultant> matching = practice.getConsultantsByName(name);

						for (int i = 0; i < matching.size(); i++) {
							Consultant consultant = matching.get(i);
							System.out.println(consultant.toString());

							for (int j = 0; j < consultant.getCollectionOfPatients().size(); j++) {
								Patient patient = consultant.getCollectionOfPatients().get(j);
								System.out.println(patient.toString());
							}
							System.out.println();
						}

						continue APPLICATION;
					}
					case 6:{//Display all Consultants followed by their Patients followed by their visits.
						for (int i = 0; i < practice.getCollectionOfConsultants().size(); i++){
							Consultant consultant = practice.getCollectionOfConsultants().get(i);
							System.out.println(consultant.toString());

							for (int j = 0; j < consultant.getCollectionOfPatients().size(); j++){
								Patient patient = consultant.getCollectionOfPatients().get(j);
								System.out.println(patient.toString());

								for (int x = 0; x < patient.getCollectionOfVisits().size(); x++){
									Visit visit_temp = patient.getCollectionOfVisits().get(x);
									System.out.println(visit_temp.toString());
								}
							}
							System.out.println();
						}
						continue APPLICATION;
					}
					case 7:{//Save all information to a file.
						
					}
					case 8:{//Load information from a file.

					}
					case 9:{//Quit.
						System.out.println("\n" + "-----------------------------------------------------------" + "\n");

						//Set while(running) to false
						running = false;

						//close userChoice scanner
						in.close();//System.in

						//Exit message
						System.out.println("###########################################################");
						System.out.println("   THANKS FOR USING THE HOSPITAL CONSULTANCY APPLICATION");
						System.out.println("###########################################################");

						break;
					}

					default:{ //Display error message for invalid input (!1-9)
						System.out.println("Invalid command!");
					}

					}

				}
		}
	}

}
