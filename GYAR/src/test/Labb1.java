package test;

import java.io.File;
import java.io.*;
import net.sourceforge.tess4j.*;


public class Labb1 {
	
	String result;
	
	
	public static void main(String[] args) {
		String result = "";
		
		File imp = new File("C:\\Users\\usr\\Pictures\\labb1test3.PNG");
		
		ITesseract tess = new Tesseract();
		tess.setDatapath("C:\\Users\\usr\\Documents\\GitHub\\GYAR\\GYAR\\tessdata");
		tess.setLanguage("swe");
		
		try {
			result = tess.doOCR(imp);
			Labb1c2.not(result);
			System.out.println(result);
		}
		
		catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
