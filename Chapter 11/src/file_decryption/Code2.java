package file_decryption;

public class Code2 {

	private static String Code;

	public Code2(String code) {
		Code = code;
	}

	public char getLetter() {
		char letter = codeletter(Code);
		return letter;
	}

	private static char codeletter(String code) {
		char letter = 0;

		switch (code) {
		case "@423":
			letter = 'a';
			break;
		case "@135":
			letter = 'b';
			break;
		case "4^ew":
			letter = 'c';
			break;
		case "2%se":
			letter = 'd';
			break;
		case "$&8(":
			letter = 'e';
			break;
		case "^6&7":
			letter = 'f';
			break;
		case "1*7(":
			letter = 'g';
			break;
		case "!10)":
			letter = 'h';
			break;
		case "#&4%":
			letter = 'i';
			break;
		case "*1))":
			letter = 'j';
			break;
		case "^2((":
			letter = 'k';
			break;
		case "-!#%":
			letter = 'l';
			break;
		case "4^2(":
			letter = 'm';
			break;
		case "op%9":
			letter = 'n';
			break;
		case "jk$5":
			letter = 'o';
			break;
		case "=+nb":
			letter = 'p';
			break;
		case "nbs%":
			letter = 'q';
			break;
		case "6666":
			letter = 'r';
			break;
		case "-~%6":
			letter = 's';
			break;
		case "mz@6":
			letter = 't';
			break;
		case "M>?|":
			letter = 'u';
			break;
		case "/l&8":
			letter = 'v';
			break;
		case "aWqb":
			letter = 'w';
			break;
		case "msft":
			letter = 'x';
			break;
		case "&*$3":
			letter = 'y';
			break;
		case "_7*!":
			letter = 'z';
			break;
		case "_-_-":
			letter = ' ';
			break;
		}

		return letter;
	}

}
