package file_encryption;

public class Code {

	private static String Message;

	public Code(String message) {
		Message = message;
	}

	public String getCode() {
		String code = null;
		for (int i = 0; i < Message.length(); i++) {
			Character a = Message.charAt(i);
			if (i == 0)
				code = lettercode(a.toLowerCase(a));
			else
				code += lettercode(a.toLowerCase(a));
		}
		return code;
	}

	private static String lettercode(char letter) {
		String code = null;

		switch (letter) {
		case 'a':
			code = "@423";
			break;
		case 'b':
			code = "@135";
			break;
		case 'c':
			code = "4^ew";
			break;
		case 'd':
			code = "2%se";
			break;
		case 'e':
			code = "$&8(";
			break;
		case 'f':
			code = "^6&7";
			break;
		case 'g':
			code = "1*7(";
			break;
		case 'h':
			code = "!10)";
			break;
		case 'i':
			code = "#&4%";
			break;
		case 'j':
			code = "*1))";
			break;
		case 'k':
			code = "^2((";
			break;
		case 'l':
			code = "-!#%";
			break;
		case 'm':
			code = "4^2(";
			break;
		case 'n':
			code = "op%9";
			break;
		case 'o':
			code = "jk$5";
			break;
		case 'p':
			code = "=+nb";
			break;
		case 'q':
			code = "nbs%";
			break;
		case 'r':
			code = "6666";
			break;
		case 's':
			code = "-~%6";
			break;
		case 't':
			code = "mz@6";
			break;
		case 'u':
			code = "M>?|";
			break;
		case 'v':
			code = "/l&8";
			break;
		case 'w':
			code = "aWqb";
			break;
		case 'x':
			code = "msft";
			break;
		case 'y':
			code = "&*$3";
			break;
		case 'z':
			code = "_7*!";
			break;
		case ' ':
			code = "_-_-";
			break;
		}

		return code;
	}

}
