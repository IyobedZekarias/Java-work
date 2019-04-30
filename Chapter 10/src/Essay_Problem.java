
public class Essay_Problem {

	public static void main(String[] args) {
		Essay DrewsEssay = new Essay();
		DrewsEssay.setGrammer(20);
		DrewsEssay.setSpelling(20);
		DrewsEssay.setLength(20);
		DrewsEssay.setContent(20);
		DrewsEssay.setScore();
		char Grade = DrewsEssay.getGrade();
		
		System.out.println(Grade);
	}

}
