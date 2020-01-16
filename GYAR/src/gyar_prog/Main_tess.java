package gyar_prog;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Main_tess {
	
	String timestart;
	String fixedtxt;
	
	public void tess() {
		
		
		
		
		File imp = new File("C:\\Users\\usr\\Pictures\\labb1test4.PNG");
		
		ITesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\usr\\Documents\\GitHub\\GYAR\\GYAR\\tessdata");
		tess.setLanguage("swe");
		
		try {
			String result = tess.doOCR(imp);
			timestart = Mcon.mot(result);
			fixedtxt = Mcon.fixer(result);
		}
		
		catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	
}