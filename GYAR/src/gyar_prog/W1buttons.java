package gyar_prog;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class W1buttons {
	
	
	HBox mainmeny;
	TextField Output_scan;
	

	public W1buttons() {
		
		Main_tess mt = new Main_tess();
		Main_control mc = new Main_control();
		
		mainmeny = new HBox();
		Button Scandoc = new Button("Scan");
		Button ssrt = new Button("School start");
		TextField Output_noti = new TextField();
		Output_scan = new TextField();
		
		Scandoc.setOnAction(event->{mt.tess();
		Output_scan.textProperty().set(mt.results());
		});
		ssrt.setOnAction(event->{Output_noti.textProperty().set("Skolan börjar: " + mt.results());});
		
		Output_noti.setMinSize(300, 30);
		Output_noti.setTranslateY(30);
		Output_noti.setTranslateX(-35);
		
		Output_scan.setMinSize(200, 100);
		Output_scan.setTranslateY(65);
		Output_scan.setTranslateX(-335);
		
		
		
		mainmeny.getChildren().addAll(Scandoc,ssrt,Output_noti, Output_scan);
	}

}
