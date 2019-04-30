
public class passcorrect {
	private static String pass;
	
	passcorrect(String password){
		pass = password;
	}
	
	public static boolean passcount() {
		boolean count = false;
		if(pass.length() == 6)
			count = true;
		return count; 
	}
	
	public static boolean passcase() {
		boolean letteruppercase = false;
		boolean letterlowercase = false; 
		boolean lettercase = false;
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isUpperCase(pass.charAt(i)) && letteruppercase == false){
				letteruppercase = true;
			}
			if(Character.isLowerCase(pass.charAt(i)) && letterlowercase == false) {
				letterlowercase = true;
			}
			if(letterlowercase && letteruppercase) {
				lettercase = true;
				break;
			}
		}
		return lettercase;
	}
	
	public static boolean passdigit() {
		boolean digit = false; 
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isDigit(pass.charAt(i))) {
				digit = true;
				break;
			}
		}
		return digit;
	}
}
