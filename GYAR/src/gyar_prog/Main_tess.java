package gyar_prog;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Main_tess {
	
	String timestart;
	String fixedtxt;
	Boolean Inp_check;
	ITesseract tess;
	File imp;
	String result;
	
	public void tess() {
		
		
		
		
		imp = new File("C:\\Users\\usr\\Pictures\\labb1test4.PNG");
		
		tess = new Tesseract();
		tess.setDatapath("C:\\Users\\usr\\Documents\\GitHub\\GYAR\\GYAR\\tessdata");
		tess.setLanguage("swe");
		
		try {
			result = tess.doOCR(imp);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
		
	}
	
	public String results() {
		
		String check = Main_control.fixer(result);
		Inp_check = Input_check.checker(check);
		if (Inp_check = true) {
		timestart = Main_control.linefix(result);
		fixedtxt = Main_control.fixer(result);
		return fixedtxt;
		}
		
			return "";
		
		
	}
	
	
}