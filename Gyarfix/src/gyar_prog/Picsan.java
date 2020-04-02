package gyar_prog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Picsan extends Application{
	
	
	@Override
	public void start(Stage window1) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Graphics_interface.fxml"));
		window1.setScene(new Scene(root));
		window1.show();
		window1.setTitle("Picsan");
		root.requestFocus();
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
