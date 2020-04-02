package gyar_prog;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class Main_control {
	Main_tess mt = new Main_tess();
	private static String Day;
	private String Scheme;
	private String timestart;
	private String timeend;
	
	  @FXML
	  public TextArea Output;
	  
	public void runScan() {
		Output.setEditable(false);
		try {
			Output.clear();
			mt.tess(Scheme,Day);
			results();
		}
		catch(Exception error) {
			Output.textProperty().set("Ooops! No day was set or no scheme was selected.");
		}
		
	}
	
	public void runSstart() {
		Output.textProperty().set("School starts at:" +" "+ timestart);
	}
	public void runSend() {
		Output.textProperty().set("School ends at:" +" "+ timeend);
	}
	public void clear() {
		Output.clear();
	}
	public void showSource() {
		Output.textProperty().set(results());
	}
	public void exit() {
		Platform.exit();
	}
	public static void getDay(String day) {
		Day = day;
	}
	
	public void setMonday() {
		getDay("Monday");
	}
	public void setTuesday() {
		getDay("Tuesday");
	}
	public void setWednesday() {
		getDay("Wednesday");
	}
	public void setThursday() {
		getDay("Thursday");
	}
	public void setFriday() {
		getDay("Friday");
	}	
	
	public void getScheme(String Scheme) {
		this.Scheme = Scheme;
	}
	
	public void setMyScheme() {
		getScheme("MyScheme");
	}
	
	public void setTE17D() {
		getScheme("TE17D");
	}
	
	public static String timeFix(String exp) {
		
		String result = "";
		
		String[] starttimeh = {"\n1:","\n2:","\n3:","\n4:","\n5:","\n6:","\n7:","\n8:","\n9:","\n10:","\n11:","\n12:"};
		if(exp.isEmpty()) {
			result = "No time found";
		}
		else {
			for(String s : starttimeh) {
				if(exp.contains(s)) {
					String[] temp1 = exp.split("(\\n)");
					String[] temp2 = temp1[1].split("(\\-)");
					result = temp2[0];
					break;
				}
			}
		}
		return result;
	}
	
	public static String timeFixend(String exp) {
		String result = "";
		
		String[] endtimeh = {"-18","-17","-16","-15","-14","-13","-12","-11","-10","-9","-8","-7"};
		
		if(exp.isEmpty()) {
			result = "No time found";
		}
		else {
			for(String s : endtimeh) {
				if(exp.contains(s)) {
					String[] temp1 = exp.split("(\\-)");
					String temp2 = temp1[temp1.length-2].substring(0,5);
					result = temp2;
					break;
				}
			}
		}
		return result;
	}
	
	public static String fixer(String broken) {
		String Spacefix = broken.replace(" ", "");
		String fixed = Spacefix.replace("\n", " ");
		
		return fixed;
	}
	
	public static String classfix(String broke) {
		String[] charcls = {"T","E","1","7","D"};
		String[] brokencls = {"TE", "TE1", "TE17"};
		String[] classes = {"PRRPRR02","MATMAT00S","FYSFYS02","SVESVE03","Klassråd","GYAR","MATMAT05"};
		String cl = "";
		String replace = "";
		String checker = "";
		String fixed = "";
		String[] temp = {};
		String fix = "";
		
		for(String kg : charcls) {
			cl = cl+kg;
		}
		for(String l : classes) {
			if(broke.contains(l)) {
				temp = broke.split("(\\-)");
				temp = temp[2].split("(\\ )");
				fix = temp[0];
			}
		}
		for(String o : brokencls) {
			if(fix.contains(o)) {
				replace = (broke.replace(cl, o));
			}
		}
		for(String c : classes) {
			if(replace.contains(c)) {
				checker = charcls[0]+charcls[1];
					if(fix.contains(checker)) {
						String fix1 = replace.replace(fix, cl);
						fixed = fix1;
					}
			}
		}
			return fixed;
	}	
	
	public String results() {
		timestart = timeFix(mt.result);
		timeend = timeFixend(mt.result);
		String classfix = classfix(mt.result);
		return classfix;
	}
}