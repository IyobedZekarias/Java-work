import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Chapter_9_lab_TimeConversion {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		boolean x = false;
		System.out.print("This program will convert standard time (hh:mm a) to military time (HH:mm)\n"
				+ "Your time will need to be a valid entry for example 4:15 pm\n");
		String userTime = "";
		do {
			System.out.print("Enter your time: ");
			userTime = s.nextLine();
			String ampm = userTime.substring((userTime.indexOf(' ') + 1), (userTime.indexOf(' ') + 3));
			String am = "AM";
			String pm = "PM";
			if (!userTime.contains(":") || !am.equalsIgnoreCase(ampm) && !pm.equalsIgnoreCase(ampm)) {
				System.out.println(userTime + " is not a valid entry");
			}else
				x = true;
		} while (!x);
		
		SimpleDateFormat hour24format = new SimpleDateFormat("HH:mm");
		SimpleDateFormat hour12format = new SimpleDateFormat("hh:mm a");
		Date date = hour12format.parse(userTime);
		System.out.println(hour12format.format(date) + " = " + hour24format.format(date));

	}

}
