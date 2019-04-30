import java.util.Scanner;

public class pass_verify {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(
				"Your password must have six characters\n"
				+ "one upper case and one lowercase letter\n"
				+ "one digit\n"
				+ "Enter your password: ");
		String pass = s.nextLine();
		
		passcorrect password = new passcorrect(pass);
		boolean passcase = password.passcase();
		boolean passcount = password.passcount();
		boolean passdigit = password.passdigit();
		
		if(!passcase && !passcount && !passdigit) {
			System.out.println("your password is invalid");
		}
		else
			System.out.println("your password is valid");
	}

}
