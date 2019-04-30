import java.util.Scanner;

public class backwards_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String word = s.nextLine();
		
		String wordback = backwards(word);
		System.out.println("Reversed string: " + wordback);
	}

	private static String backwards(String word) {
		String wordback = "";
		
		for(int i = (word.length()-1); i >= 0; i--) {
			wordback = wordback + word.charAt(i);
		}
		return wordback;
	}

}
