/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */


package CovidCloseContactApplication;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//TODO Link the AlertBox with contactListFile to save to the file before exiting the application.
//*****************************************************************
//Alert box to save on exit
//*****************************************************************

public class AlertBox {



	//*****************************************************************
	//Create an alert box with title and message.
	//*****************************************************************
	public static void displayAlertBoxSaveOnExit(String title, String message){

		Stage secondaryWindow = new Stage();
		secondaryWindow.initModality(Modality.APPLICATION_MODAL);


		//*****************************************************************
		//Set dimensions of new Alert window
		//*****************************************************************
		secondaryWindow.setTitle(title);
		secondaryWindow.setMinWidth(350);
		secondaryWindow.setMinHeight(80);

		Label label8 = new Label();
		label8.setText(message);

		Button saveOnExitAlertButton = new Button("Save and Exit");
		saveOnExitAlertButton.setOnAction(e -> secondaryWindow.close() );

		Button ExitAlertButton = new Button("Exit");
		ExitAlertButton.setOnAction(e -> secondaryWindow.close() );

		HBox primaryWindowLayout = new HBox(10);
		primaryWindowLayout.getChildren().addAll(label8, saveOnExitAlertButton, ExitAlertButton);
		ExitAlertButton.setStyle("-fx-background-color: #f73e3e; ");

		primaryWindowLayout.setAlignment(Pos.BASELINE_CENTER);


		//*****************************************************************
		//Display the stage and wait until button click to exit
		//*****************************************************************
		Scene secondaryStage = new Scene(primaryWindowLayout);
		secondaryWindow.setScene(secondaryStage);
		secondaryWindow.showAndWait();

		System.exit(0);


	}

}
