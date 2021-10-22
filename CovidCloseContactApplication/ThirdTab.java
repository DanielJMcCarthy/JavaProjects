/*Student Details:
 * Student Name: Daniel McCarthy
 * Student ID: R00151837
 * Class: SD2-A
 */
package CovidCloseContactApplication;

//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ThirdTab {


	private Tab tab;
	
	
	//make constructor 
	
	public ThirdTab(Tab tab){
		this.tab = tab;
		
	}
	
	
	//make the method
	public void open(){
		Label l1 = new Label("List of Close Contacts");
		TextField tf1 = new TextField("Close Contacts: ");
		
		
		VBox v2 = new VBox(10);
		
		//add inside tab
		
		v2.getChildren().addAll(l1,tf1);
		tab.setContent(v2);
		
	}
	
}
