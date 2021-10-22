/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

//import java.util.ArrayList;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SecondTab {


	private Tab tab;
	
	private   Label labelDate;
	private   TextField textFieldEnterDate;
	
	//make constructor 
	
	public SecondTab(Tab tab){
		this.tab = tab;
		
	}
	
	
	//make the method
	public void open(){
		
		Label l1 = new Label("\t" + "\t" + "------------Record A Close Contact------------");
		
		
		Label l2 = new Label("\t" + "Choose first contact");
		ChoiceBox <String> choiceBox1 = new ChoiceBox<>();
		choiceBox1.getItems().addAll("Dan","Ben","Stan");	
		
		
		Label l3 = new Label("\t" +  "Choose second contact");
		ChoiceBox <String> choiceBox2 = new ChoiceBox<>();
		choiceBox2.getItems().addAll("Dan","Ben","Stan");	
		
		
		Label l4 = new Label("\t" +  "Select a time");
		labelDate = new Label("\t" + "Enter Date Of Contact" + "\t" + "  ");
		textFieldEnterDate = new TextField ();
		
		TextField tf1 = new TextField("Close Contact Record");
		
		VBox secondaryWindowLayout = new VBox(10);
		
		HBox h1 = new HBox(10);
		h1.getChildren().addAll(labelDate,textFieldEnterDate);
		
		//add inside tab
		secondaryWindowLayout.getChildren().addAll(l1, l2, choiceBox1, l3, choiceBox2, tf1 ,l4,h1);
		tab.setContent(secondaryWindowLayout);
		
	}
	
}
