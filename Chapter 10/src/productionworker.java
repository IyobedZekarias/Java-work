import java.util.Date;

public class productionworker extends Employee{

	private static int shift;
	private static double payrate;
	
	public productionworker() {
		super();
		shift = 0;
		payrate = 0.0;
		
	}
	
	public productionworker(String na, String nu, Date hd, int s, double p) {
		super(na, nu, hd);
		p = payrate;
		s = shift;
	}
	
	public static int getShift() {
		return shift;
	}

	public static double getPayrate() {
		return payrate;
	}
	
	public static void setPayrate(double d) {
		payrate = d;
	}
	
	public static void setShift(int s) {
		shift = s;
	}

}
