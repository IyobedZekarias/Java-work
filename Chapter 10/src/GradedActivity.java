
/** 2 A class that holds a grade for a graded activity. 3 */
public class GradedActivity {
	private double score; // Numeric score 8 9

	public void setScore() {
		score = 0.0;
	}
	public void setScore(double s) {
		score = s;
	}

	/**
	 * 20 The getScore method returns the score. 21 @return The value stored in the
	 * score field. 22
	 */
	public double getScore() {
		return score;
	}

	/**
	 * 30 The getGrade method returns a letter grade 31 determined from the score
	 * field. 32 @return The letter grade. 33
	 */
	public char getGrade() {
		char letterGrade;
		if (score >= 90)
			letterGrade = 'A';
		else if (score >= 80)
			letterGrade = 'B';
		else if (score >= 70)
			letterGrade = 'C';
		else if (score >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		return letterGrade;
	}
}
