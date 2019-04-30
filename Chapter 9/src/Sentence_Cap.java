import java.util.Scanner;

public class Sentence_Cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("This is a program that will make your sentence have uppercase letters");
		System.out.println(
				"The sentence will need to be grammatically correct and have no uppercase letters with a space following the end to a sentence.\nFor example hello, this is a computer. nice to meet you. -----> Hello, this is a computer. Nice to meet you.");
		System.out.print("Enter a grammatically correct sentence with no capital letters: ");
		String input = s.nextLine();
		input = capletter(input);
		

		System.out.println(input);
	}

	private static String capletter(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		for (int i = 1; i < (input.length() - 2); i++) {
			char a = input.charAt(i);
			if (a == '.' || a == '!' || a == '?') {
				input = input.substring(0, i + 2) + input.substring(i + 2, i + 3).toUpperCase()
						+ input.substring(i + 3);
			}
		}
		
		return input;
	}

}
