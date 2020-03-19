package gyar_prog;

public class Main_control {
	
	/*public static String lessonfix(String less) {
		String[] brokeclasses = {"PRR","PRRP","PRRPR","PRRPRR","PRRPRR0","MATMAT","FYSF","SVES","Klassr","GYA","MATM"};
		String[] classes = {"PRRPRR02","MATMAT00S","FYSFYS02","SVESVE03","Klassråd","GYAR","MATMAT05"};
		String fix = "";
		
		for(String s : brokeclasses) {
			for(String g : classes) {
				if(less.contains(s)) {
					
				}
				
			}
		}
	}
	*/
	
	public static String linefix(String exp) {
		
		String[] timeh = {};
		String result = "";
		
		String[] starttimeh = {"\n7:","\n8:","\n9:","\n10:","\n11:","\n12:","\n1:","\n2:","\n3:","\n4:","\n5:","\n6:"};
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
		return result;
	}
	
	public static String fixer(String broken) {
		String Spacefix = broken.replace(" ", "");
		String fixed = Spacefix.replace("\n", " ");
		Input_check.checker(fixed);
		
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
}