import java.util.Date;

public class Employee {

	protected static String name;
	protected static String number;
	protected static Date hiredate;
	
	public Employee() {
		name = "";
		number = "";
		hiredate = null;
	}
	
	public Employee(String na, String nu, Date hd) {
		name = na;
		number = nu;
		hiredate = hd;
	}
	
	public String getName() {
		return name;
	}
	
	public static String getNumber() {
		return number;
	}
	
	public static Date getHireDate() {
		return hiredate;
	}
	
	public static void setName(String n) {
		name = n;
	}
	
	public static void setNumber(String n) {
		number = n;
	}
	
	public static void setHireDate(Date d) {
		d = hiredate;
	}
}
