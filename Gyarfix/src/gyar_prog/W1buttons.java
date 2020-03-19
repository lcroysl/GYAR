package gyar_prog;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class W1buttons {
	HBox mainmeny;
	TextArea Output_scan;
	Button temp;
	String cheee;
	String classcheee;
	
	
	public W1buttons() {
		Main_tess mt = new Main_tess();
		ArrayList<Button> daybuttons = new ArrayList<Button>();
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		
		for(String day : days) {
			temp = new Button(day);
			temp.setOnAction(event->{cheee = day;});
			daybuttons.add(temp);
		}
		
		mainmeny = new HBox();
		Button Scandoc = new Button("Scan");
		Button class1 = new Button("TE17D");
		Button ssrt = new Button("School start");
		TextArea Output_noti = new TextArea();
		Output_scan = new TextArea();
		
		Scandoc.setOnAction(event->{
		mt.tess();
		Output_scan.textProperty().set(mt.results());
		});
		ssrt.setOnAction(event->{
		Output_noti.textProperty().set("Skolan börjar: " + mt.timestart);
		});
		class1.setOnAction(event ->{
			TE17D.class1();
		});
		
		int xsize = 150;
		
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
		
		for(Button day : daybuttons) {
			mainmeny.getChildren().add(day);
		}
			mainmeny.getChildren().addAll(Scandoc,ssrt,Output_noti,Output_scan,class1);
		
	}
}
