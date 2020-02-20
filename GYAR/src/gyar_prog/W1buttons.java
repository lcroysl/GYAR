package gyar_prog;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class W1buttons {
	
	
	HBox mainmeny;
	TextArea Output_scan;
	

	public W1buttons() {
		
		Main_tess mt = new Main_tess();
		Main_control mc = new Main_control();
		
		mainmeny = new HBox();
		Button Scandoc = new Button("Scan");
		Button ssrt = new Button("School start");
		TextArea Output_noti = new TextArea();
		Output_scan = new TextArea();
		
		Scandoc.setOnAction(event->{mt.tess();
		Output_scan.textProperty().set(mt.results());
		});
		ssrt.setOnAction(event->{Output_noti.textProperty().set("Skolan börjar: " + mt.timestart);});
		
		int xsize = 120;
		
		Output_noti.setMinSize(xsize, 30);
		Output_noti.setMaxSize(xsize, 30);
		Output_noti.setTranslateY(30);
		Output_noti.setTranslateX(-35);
		Output_noti.setScrollLeft(100);
		Output_noti.setEditable(false);
		
		
		Output_scan.setMinSize(xsize+70, 100);
		Output_scan.setMaxSize(xsize+70, 100);
		Output_scan.setTranslateY(65);
		Output_scan.setTranslateX(-xsize-35);
		Output_scan.setScrollLeft(10);
		Output_scan.setWrapText(true);
		Output_scan.setEditable(false);
		
		
		
		
		mainmeny.getChildren().addAll(Scandoc,ssrt,Output_noti, Output_scan);
	}

}
