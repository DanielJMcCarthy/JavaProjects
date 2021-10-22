/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

//import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//import javafx.scene.image.Image;
//import javafx.scene.image.Image;


public class Main extends Application  {//implements EventHandler<ActionEvent>
	
	
	//TODO 	Make firstTab class
	// 		Associated the add and remove class with the second tab dropbox
	// 		In the third tab add a textbox with a list of all the contacts as in tab 1 list

	//*****************************************************************
	//Declare buttons
	//*****************************************************************

	private Button addButton;
	private Button removeButton;
	private Button listButton;
	private Button loadButton;
	private Button saveButton;
	private Button exitButton;



	//*****************************************************************
	//Declare Labels and TextFields
	//*****************************************************************

	private   Label labelContactsBannerMessage;

	private   Label labelContactFirstName;
	private   TextField textFieldContactFirstName;

	private   Label labelContactSurname;
	private   TextField textFieldContactSurname;

	private   Label labelContactUniqueID;
	private   TextField textFieldContactUniqueID;

	private   Label labelContactPhoneNumber;
	private   TextField textFieldContactPhoneNumber;


	//*****************************************************************
	//Declare TabPane
	//*****************************************************************

	private	TabPane tp;


	//*****************************************************************
	//Declare TextArea
	//*****************************************************************

	private	TextArea allContacts;




	private static Controller controller = new Controller();
	//private static File covidContactListFile = new File("C:\\Users\\mccda\\Downloads\\Programming\\Object Oriented\\My_Covid_Close_Contact_Application\\src\\CovidCloseContactApplication\\covidContactList.txt");

	@Override
	public void start(Stage primaryStage) throws Exception {


		primaryStage.setTitle("Covid-19 Close Contact Application");

		//new Image(Main.class.getResource("covidImage.png").toExternalForm());
		//primaryStage.getIcons().add(new Image("\\icons\\covidImage.png"));
		//Image image = new Image("covidImage.png");
		//primaryStage.getIcons().add(image);


		//*****************************************************************
		//Display declared Labels and TextFields
		//*****************************************************************

		labelContactsBannerMessage = new Label("\t\t" + "----------------Contacts----------------");

		labelContactFirstName = new Label("\t" + "Enter first name" + "\t" + "  ");
		textFieldContactFirstName = new TextField ();

		labelContactSurname = new Label("\t" + "Enter surname" + "\t\t" + "  ");
		textFieldContactSurname = new TextField ();

		labelContactUniqueID = new Label("\t" + "Enter ID Number" + "\t" + "  ");
		textFieldContactUniqueID = new TextField ();

		labelContactPhoneNumber = new Label ("\t" + "Enter Phone Number");
		textFieldContactPhoneNumber = new TextField ();


		//*****************************************************************
		//Display declared TabPane
		//*****************************************************************

		tp = new TabPane();


		//add the tabs inside the tabPane
		Tab tb1 = new Tab("Tab 1");
		Tab tb2 = new Tab("Tab 2");
		Tab tb3 = new Tab("Tab 3");

		tp.getTabs().addAll(tb1,tb2,tb3);





		//*****************************************************************
		//Display declared TextArea
		//*****************************************************************


		allContacts = new TextArea("People in the Application");



		//*****************************************************************
		//Display all declared buttons on primaryWindow
		//*****************************************************************

		addButton = new Button();
		addButton.setText("Add");

		removeButton = new Button();
		removeButton.setText("Remove");

		listButton = new Button();
		listButton.setText("List");

		loadButton = new Button();
		loadButton.setText("Load");

		saveButton = new Button();
		saveButton.setText("Save");

		exitButton = new Button();
		exitButton.setText("Exit");



		//*****************************************************************
		//Implement button methods
		//*****************************************************************

		//************
		//addButton
		//************
		addButton.setOnAction( e->

		controller.addContact(textFieldContactFirstName.getText(),textFieldContactSurname.getText(), 
				textFieldContactUniqueID.getText(), textFieldContactPhoneNumber.getText())

				);



		//************
		//listButton
		//************
		listButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String listContacts = controller.listOfContacts();
				allContacts.setText(listContacts);

			}
		});



		//************
		//removeButton
		//************
		removeButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				controller.removeLastContact();

				String listContacts = controller.listOfContacts();
				allContacts.setText(listContacts);

			}

		});


		//************
		//exitButton
		//************
		exitButton.setOnAction(e-> 

		AlertBox.displayAlertBoxSaveOnExit("Unsaved data" , "Would you like to save the file?")

				);


		/*
		//************
		//saveButton
		//************

		saveButton.setOnAction(e->

		//controller.populate());
		//allContacts.setText("Saving file: " + covidContactListFile.getName() + "...")

		controller.saveFileFromContactListFile()

				);
		/*
		 saveButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				controller.populate();
				controller.saveFileFromContactListFile();
				allContacts.setText("Saving file: " + covidContactListFile.getName() + "...");

			}


		//************
		//loadButton
		//************

		loadButton.setOnAction(e->

		controller.loadFileFromContactListFile()
		//allContacts.setText("Loading file: " + covidContactListFile.getName() + "...")


				);
		 */


		//*****************************************************************
		//Create the design of the primaryWindow
		//*****************************************************************	
		//add a box to contain tabPane
		HBox hTab = new HBox(10);
		hTab.getChildren().addAll(tp);

		HBox h0 = new HBox(10);
		h0.getChildren().addAll(labelContactsBannerMessage);

		HBox h1 = new HBox(10);
		h1.getChildren().addAll(labelContactFirstName,textFieldContactFirstName);

		HBox h2 = new HBox(10);
		h2.getChildren().addAll(labelContactSurname,textFieldContactSurname);

		HBox h3 = new HBox(10);
		h3.getChildren().addAll(labelContactUniqueID,textFieldContactUniqueID);

		HBox h4 = new HBox(10);
		h4.getChildren().addAll(labelContactPhoneNumber,textFieldContactPhoneNumber);

		HBox h5 = new HBox(10);
		h5.getChildren().addAll(addButton,listButton, removeButton);

		HBox h6 = new HBox(10);
		h6.getChildren().addAll(saveButton, loadButton, exitButton);

		HBox h7 = new HBox();
		h7.setAlignment(Pos.BOTTOM_RIGHT);
		h7.getChildren().addAll(exitButton);
		exitButton.setStyle("-fx-background-color: #f73e3e; ");


		//*****************************************************************
		//Implement created design, set primaryWindowLayout dimensions
		//Add objects and display the window
		//*****************************************************************


		//AnchorPane primaryWindowLayout = new AnchorPane();

		//Set the width of the TabPane
		tp.prefWidthProperty().bind(primaryStage.widthProperty());
		//make it so tabs can't be closed 
		tp.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		//call second tab
		new SecondTab(tb2).open();

		//call Third tab
		new ThirdTab(tb3).open();


		//AnchorPane primaryWindowLayout = new AnchorPane();
		VBox primaryWindowLayout = new VBox (10);
		primaryWindowLayout.getChildren().addAll(hTab, h0, h1, h2, h3, h4, h5, allContacts, h6, h7);


		Scene primaryWindow = new Scene(primaryWindowLayout,450,500);
		primaryStage.setMaximized(true);
		primaryStage.setScene(primaryWindow);
		primaryStage.show();







	}
	public static void main(String[] args) {

		launch(args);

	}

}






//Reserved for later
/*
//*****************************************************************
//Create the primary window for the application and set dimensions.
//Add objects and display the window
//*****************************************************************

//StackPane primaryWindowLayout = new StackPane();
//primaryWindowLayout.getChildren().addAll(r1,r2, r3, r4, r5, allContacts, r6, r7);


//Scene primaryWindow = new Scene(primaryWindowLayout, 600, 600);
//primaryStage.setScene(primaryWindow);
//primaryStage.show();
 */

