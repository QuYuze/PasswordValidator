package password_validator;

import java.util.regex.Pattern;

public class Validator {
	
	public String varify(String s) {
		String sLevel = "";
		
		if(tooLong(s)) {
			sLevel = "Too Long";
		}
		
		if(needUpperCase(s)) {
			sLevel = "Need UpperCase Letter";
		}
		
		if(needInteger(s)) {
			sLevel = "Need Integer";
		}
		
		if(length(s)) {
			sLevel = "Too Short";
		}
				
		if(notPassword(s)) {
			sLevel = "Not password";
		}
		
		return sLevel;
	}
	
	public Boolean length(String s) {
		boolean x = false;
		if(s.length()<8) {
			x = true;
		}
		
		return x;
	}
	
	public Boolean notPassword(String s) {
		boolean x = false;
		if(s.equals("password")) {
			x = true;
		}
		
		return x;
	}
	
	public Boolean needInteger(String s) {
		boolean x = true;
		if(s.matches(".*\\d+.*")){;
				x = false;
		}
	
		
		return x;
	}
	
	public Boolean needUpperCase(String s) {
		boolean x = true;
		if(Pattern.matches("[A-Z]+[a-z]+[0-9]", s)){;
				x = false;
		}
	
		
		return x;
	}
	
	public Boolean tooLong(String s) {
		boolean x = false;
		if(s.length()>10){;
				x = true;
		}
	
		
		return x;
	}
	
	public static void main(String [] args) {
		Validator v = new Validator();
		
		System.out.println(v.varify("123"));
		System.out.println(v.varify("abcdef"));
		System.out.println(v.varify("Passworddd1"));
		System.out.println(v.varify("Passwo1d"));

	}
	


}
