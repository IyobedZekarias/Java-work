
public class Person {
	
	protected static String name, address, telephone;
	public Person() {
		name = "";
		address = "";
		telephone = "";
	}
	
	public Person(String n, String a, String t) {
		name = n;
		address = a;
		telephone = t;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress(){
		return address; 
	}
	
	public String getTelephone() {
		return telephone;
	}

}
