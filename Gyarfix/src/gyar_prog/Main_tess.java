package gyar_prog;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Main_tess {
	
	String timestart;
	String fixedtxt;
	Boolean Inp_check;
	String result;
	File imp;
	
	public void tess() {
		
		if(TE17D.class1().equals("TE17D")) {
			imp = new File("C:\\Users\\usr\\Pictures\\labb1test6.PNG");
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
	
	public String results() {
		timestart = Main_control.linefix(result);
		//String check = Main_control.fixer(result);
		//Inp_check = Input_check.checker(check);
		//if (Inp_check = true) {
			fixedtxt = Main_control.fixer(result);
			String classfix = Main_control.classfix(fixedtxt);
			return classfix;
		
	
	}
}