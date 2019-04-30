package TestScores1;
import java.util.ArrayList;

public class TestScores {

	private static ArrayList<Integer> Scores = new ArrayList<>();

	public TestScores(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < 0)
				throw new IllegalArgumentException("All scores must be positive");
			else
				Scores.add(scores[i]);
		}
	}
	
	public static int getaverage() {
		Integer sum = 0;
		  if(!Scores.isEmpty()) {
		    for (Integer score : Scores) {
		        sum += score;
		    }
		    return (int) (sum.doubleValue() / Scores.size());
		  }
		  return sum;
	}

}
