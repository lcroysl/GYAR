package test;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;


public class Labb1 {
	
	
	
	
	public static void main(String[] args) {
		
		
		File imp = new File("C:\\Users\\usr\\Pictures\\labb1test4.PNG");
		
		ITesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\usr\\Documents\\GitHub\\GYAR\\GYAR\\tessdata");
		tess.setLanguage("swe");
		
		try {
			String result = tess.doOCR(imp);
			String[] res = {result};
			Labb1c2.not(result);
			System.out.println(result);
		}
		
		catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
