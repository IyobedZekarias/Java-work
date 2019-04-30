package file_encryption;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.*;

public class Encryption_Filter {

	public static void main(String[] args) throws IOException {
		Path dfile = Paths.get("decoded file.txt");
				
		List<String> outputlines = Files.readAllLines(dfile);
		
		Code codedmessage;
		Path cfile = Paths.get("coded file.txt");
		
		PrintWriter writer = new PrintWriter("coded file.txt");
		writer.print("");
		writer.close();
		
		ArrayList<String> inputlines = new ArrayList<>();
		for(String a : outputlines) {
			codedmessage = new Code(a);
			String b = codedmessage.getCode();
			inputlines.add(b);
		}
		
		Files.write(cfile, inputlines, Charset.forName("UTF-8"));
	}

}
