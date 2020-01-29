package gyar_prog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Picsan extends Application{
	
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage window1) throws Exception {
		W1buttons w1 = new W1buttons();
		
		
		Scene Hpage = new Scene(w1.mainmeny, 700, 700);
		window1.setScene(Hpage);
		window1.show();
		
		
	}

}
