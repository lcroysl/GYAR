package gyar_prog;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Main_tess {
	
	String result;
	File imp;
	
	public void tess(String Scheme, String day) {
		
		if(Scheme.equals("MyScheme")) {
			if(day.equals("Monday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\MyMonday.PNG");
			}
			else if(day.equals("Tuesday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\MyTuesday.PNG");
			}
			else if(day.equals("Wednesday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\MyWednesday.PNG");
			}
			else if(day.equals("Thursday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\MyThursday.PNG");
			}
			else{
				imp = new File("C:\\Users\\usr\\Pictures\\MyFriday.PNG");
			}
		}
		if(Scheme.equals("TE17D")) {
			if(day.equals("Monday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\MondayTE17D.PNG");
			}
			else if(day.equals("Tuesday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\TuesdayTE17D.PNG");
			}
			else if(day.equals("Wednesday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\WednesdayTE17D.PNG");
			}
			else if(day.equals("Thursday")) {
				imp = new File("C:\\Users\\usr\\Pictures\\ThursdayTE17D.PNG");
			}
			else{
				imp = new File("C:\\Users\\usr\\Pictures\\FridayTE17D.PNG");
			}
		}
		
		ITesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\usr\\Documents\\GitHub\\GYAR\\Gyarfix\\tessdata");
		tess.setLanguage("swe");
		try {
			result = tess.doOCR(imp);
		} 
		catch (TesseractException e) {
			e.printStackTrace();
		}
	}
	

}