package gyar_prog;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class W1buttons {
	
	
	HBox mainmeny;
	

	public W1buttons() {
		
		Main_tess mt = new Main_tess();
		Mcon mc = new Mcon();
		
		mainmeny = new HBox();
		Button Scandoc = new Button("Scan");
		Button ssrt = new Button("School start");
		TextField Output_noti = new TextField();
		TextField Output_scan = new TextField();
		
		Scandoc.setOnAction(event->{mt.tess();
		Output_scan.textProperty().set(mt.fixedtxt);
		});
		ssrt.setOnAction(event->{Output_noti.textProperty().set("Skolan börjar: " + mt.timestart);});
		
		Output_noti.setMinSize(300, 30);
		Output_noti.setTranslateY(30);
		Output_noti.setTranslateX(-35);
		
		Output_scan.setMinSize(200, 100);
		Output_scan.setTranslateY(65);
		Output_scan.setTranslateX(-335);
		
		
		
			
		
		
		
		
		mainmeny.getChildren().addAll(Scandoc,ssrt,Output_noti, Output_scan);
		
		
		
		
		
	}

}
