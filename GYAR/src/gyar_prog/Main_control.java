package gyar_prog;

public class Main_control {
	
	
	public static String linefix(String exp) {
		
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
		return result;
	}
	
	public static String fixer(String broken) {
		Input_check inp = new Input_check();
		
		String Spacefix = broken.replace(" ", "");
		String fixed = Spacefix.replace("\n", " ");
		inp.checker(fixed);
		
		return fixed;
	}
	
	public static String classfix(String broke) {
		String[] rep = {"T","E","1","7","D"};
		String[] brea = {"TE", "TE1", "TE17"};
		String[] classes = {"PRRPRR02","MATMAT00S","FYSFYS02","SVESVE03","Klassråd"};
		String cl = "";
		String replace = "";
		String checker = "";
		String fixed = "";
		String[] temp = {};
		String fix = "";
		
		for(String g : rep) {
			cl = cl+g;
		}
		if(broke != cl) {
			for(String l : classes) {
				if(broke.contains(l)) {
					temp = broke.split("(\\-)");
					temp = temp[2].split("(\\ )");
					fix = temp[0];
				}
			}
					for(String o : brea) {
						if(fix.contains(o)) {
							replace = (broke.replace(cl, o));
						}
					}
			for(String c : classes) {
				if(replace.contains(c)) {
					checker = rep[0]+rep[1];
						if(fix.contains(checker)) {
						String fix1 = replace.replace(fix, cl);
						fixed = fix1;
						}
				}
			}
			return fixed;
		}
		return "error";
	}	
}