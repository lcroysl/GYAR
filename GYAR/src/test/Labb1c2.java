package test;

public class Labb1c2 {
	
	String[] timeh;
	String result;
	
	public Labb1c2(){
		
	}
	
	
	public static void not(String exp) {
		String[] timeh = {};
		String result = "";
		
		String[] starttimeh = {"\n1:","\n2:","\n3:","\n4:","\n5:","\n6:","\n7:","\n8:","\n9:","\n10:","\n11:","\n12:"};
		String[] starttimem = {":05",":10",":15",":20",":25",":30",":35",":40",":45",":50",":55"};
		for(String s : starttimeh) {
			if(exp.contains(s)) {
				timeh = s.split("(\\:)");
			
			for(String c : starttimem) {
				if(exp.contains(c)) {
					String[] fixer = timeh[0].split("(\\n)");
					String timehm = fixer[1] + c;
					result = timehm;
				}
				}
			}
			
			
		}
		
		System.out.println("Skolan b�rjar : " + result);
	}

}
