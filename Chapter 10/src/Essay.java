 
public class Essay extends GradedActivity {
	protected double grammer, spelling, length, content, score;
	
	public Essay() {
		super();
		grammer = 0.0; 
		spelling = 0.0;
		length = 0.0;
		content = 0.0;
		score = 0.0;
	}
	
	public void setGrammer(double g) {
		if(g < 0 || g > 30) 
			System.out.println("This is an invalid grammer score, the grmamer score has to be between 0 and 30");
		else 
			grammer = g;
	}
	public void setSpelling(double s) {
		if(s < 0 || s > 20)
			System.out.println("This is an invalid spelling score, the spelling score has to be between 0 and 20");
		else
				spelling = s; 
	}
	public void setLength(double l) {
		if( l < 0 || l > 20)
			System.out.println("This is an invalid length score, the length has to be between 0 and 20");
		else
			length = l;
	}
	public void setContent(double c) {
		if( c < 0 || c > 30)
			System.out.println("This is an invalid content score, the content score has to be betwene 0 and 30");
		else
			content = c;
	}
	
	public double getGrammer() {
		return grammer;
	}
	public double getSpelling() {
		return spelling;
	}
	public double getLength() {
		return length;
	}
	public double getContent() {
		return content;
	}
	public void setScore() {
		score = grammer + spelling + length + content;
		super.setScore(score);
	}
	public char getGrade() {
		return super.getGrade();
	}
	
}
