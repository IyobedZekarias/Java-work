
public class Customer extends Person {
	
	protected static float number;
	protected static boolean mailing_list;
	
	@SuppressWarnings("null")
	public Customer() {
		super();
		number = 0;
		mailing_list = (Boolean) null; 
	}
	
	public Customer(String nS, String a, String t, float nI) {
		super(nS, a, t);
		number = nI;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String getAddress() {
		return super.getAddress();
	}
	
	public String getTelephone() {
		return super.getTelephone();
	}
	
	public float getNumber() {
		return number;
	}
	
	public void setMailingList(int tf) {
		if(tf == 0)
			mailing_list = false;
		else
			mailing_list = true;
	}
	
	public boolean getMailingList() {
		return mailing_list;
	}

}
