package gyar_prog;

public class Input_check {
	
	
	public static Boolean checker(String inp) {
		
		W1buttons w1 = new W1buttons();
		
		String[] subcheck = {"SVESVE03", "PRRPRR02", "Lunch", "MATMAT05", "MATMAT00S", "FYSFYS02", "GYAR", "IDRIDR02", "KLF"};
		String[] timecheckh = {"08:", "09:", "10:", "11:", "12:", "13:", "14:", "15:", "16", "17:", "18:", "19:", "20:", "21:", "22:", "23:", "24:"};
		String[] timecheckm = {":05", ":10", ":15", ":20", ":25", ":30", ":35", ":40", ":45", ":50", ":55" };
		for(String sub : subcheck) {
			if(inp.contains(sub)) {
				
			}
			else {
				w1.Output_scan.textProperty().set("Error! Subjects incorrect/not found.");
				return false;
			}
		}
		
		for(String timeh : timecheckh) {
			if(inp.contains(timeh)) {
				timeh.split("(\\:)");
				
				for(String timem : timecheckm) {
					if(inp.contains(timem)) {
						String time = timeh + timem;
						if (inp.contains(time)) {
							
						}
						else {
							w1.Output_scan.textProperty().set("Error! Timestamps incorrect/not found.");
							return false;
						}
					}
				}
			}
		}
		
		
		
		return true;
			
	}

}
