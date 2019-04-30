
public class chapter9lab {
	public static void main(String[] args) {
		/*String given = "John";
		String middle = "Fitzgerald";
		String family = "Kennedy";
		String first3 = given.substring(0,1) + "." + middle.substring(0, 1) + "." + family.substring(0, 1);
		System.out.println(first3);*/
		
		/*String sentence = "Broccoli is delicious";
		String secondword = sentence.substring(sentence.indexOf(' ') + 1, (sentence.indexOf(' ', sentence.indexOf(' ') + 1)));
		System.out.println(secondword);*/
		
		/*String word = "George slew the dragon";
		String drWord = word.substring(word.indexOf("dr"), word.indexOf("dr") + 4);
		System.out.println(drWord);*/
		
		/*String line = "this is the sentence, here is the part that will be forgotten";
		String clause;
		int pos;
		pos = line.indexOf(",");
		clause = line.substring(0, pos);
		System.out.println(clause);*/
		
		/*String fullName = "Iyobed Zekarias";
		String firstName, lastName;
		if(fullName.contains(",")) {
			firstName = fullName.substring(fullName.indexOf(",") + 2);
			lastName  = fullName.substring(0, fullName.indexOf(","));
		}
		else {
			firstName = fullName.substring(0, fullName.indexOf(' '));
			lastName  = fullName.substring(fullName.indexOf(' ') + 1);
		}
		System.out.println(firstName + " " + lastName);*/
		
		//System.out.println(thisint());
	}
	
	public static String getEmailUserName(String Email) {
		String EmailUserName = "";
		
		int pos = Email.indexOf("@");
		EmailUserName = Email.substring(0, pos);
		
		return EmailUserName;
	}
	
	public static String getEmailDomain(String Email) {
		String EmailDomain = Email.substring(Email.indexOf("@") + 1);
		return EmailDomain;
	}
	
	public static String makeEmailAddress(String name, String domain) {
		String address = name + "@" + domain;
		return address; 
	}
	
	public static String getSecondLine(String lines) {
		String secondline = lines.substring(lines.indexOf("\n"));
		return secondline;
	}
	
	public static boolean isEmailAddress(String Email) {
		boolean isEmail = true;
		if(Email.indexOf("@", Email.indexOf("@") + 1) != -1 
				|| Email.contains(" ") 
				|| Email.contains("\n") 
				|| Email.contains("\t")) {
			isEmail = false;
		}
		
		return isEmail;
	}
	
	/*public static Integer thisint() {
		Double myDouble;
		Double secondDouble = new Double(1.5); 
		myDouble = secondDouble;
		return myint;
	}*/
}
