package file_decryption;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import file_encryption.Code;

public class decryption_filter {

	public static void main(String[] args) throws IOException {
		Path cfile = Paths.get("coded file.txt");

		List<String> outputlines = Files.readAllLines(cfile);

		Code2 codedmessage;
		Path dfile = Paths.get("decoded file.txt");

		PrintWriter writer = new PrintWriter("decoded file.txt");
		writer.print("");
		writer.close();

		ArrayList<String> inputlines = new ArrayList<>();
		
		for (String a : outputlines) {
			String b = "";
			for (int i = 0; i < a.length(); i += 4) {
				codedmessage = new Code2(a.substring(i, (i + 4)));
				b += codedmessage.getLetter();
			}
			inputlines.add(b);
		}
		
		
		Files.write(dfile, inputlines, Charset.forName("UTF-8"));

	}

}
