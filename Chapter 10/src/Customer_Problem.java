
public class Customer_Problem {

	public static void main(String[] args) {
		Customer phauCustomer = new Customer("phauCustomer", "123 Road Pike, City, State, Zip", "123-456-7890", 98765);
		phauCustomer.setMailingList(1);
		
		System.out.println("name:         " + phauCustomer.getName() + "\n"
				+ "address:      " + phauCustomer.getAddress() + "\n"
				+ "telephone:    " + phauCustomer.getTelephone() +"\n"
				+ "number:       " + (int)phauCustomer.getNumber() + "\n"
				+ "mailing list: " + phauCustomer.getMailingList());
	}

}
