package test;

public class Labb1c2 {
	
	String[] timeh;
	String result;
	
	public Labb1c2(){
		
	}
	
	
	public static void not(String exp) {
		String[] timeh = {};
		String result = "";
		
		String[] starttimeh = {"1:","2:","3:","4:","5:","6:","7:","8:","9:","10:","11:","12:"};
		String[] starttimem = {":05",":10",":15",":20",":25",":30",":35",":40",":45",":50",":55"};
		for(String s : starttimeh) {
			if(exp.contains(s)) {
				timeh = s.split("(\\:)");
			
			for(String c : starttimem) {
				if(exp.contains(c)) {
					String timehm = timeh[0] + c;
					result = timehm;
				}
				}
			}
			
			
		}
		
		System.out.println("School starts at : " + result);
	}

}
