import java.util.Date;

public class Employee_Problem {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date danhire = new Date(118, 01, 12);
		@SuppressWarnings("deprecation")
		Date stevehire = new Date(117, 05, 30);
		
		Employee dan = new Employee("Dan", "123-L", danhire);
		System.out.println(dan.getName() + " is an employee who's employee number is " + dan.getNumber() + " and he was hired on " + dan.getHireDate());
		
		productionworker steve = new productionworker("Steve", "456-F", stevehire, 1, 12.45);
		System.out.println(steve.getName() + " is a production worker who's employee number is " + steve.getNumber() + ", he was hired on " + steve.getHireDate()
				+ ", has the " + steve.getShift() + ", and his pay per hour is " + steve);
	}

}
