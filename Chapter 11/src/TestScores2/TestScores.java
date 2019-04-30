package TestScores2;
import java.util.ArrayList;

public class TestScores {

	private static ArrayList<Integer> Scores = new ArrayList<>();

	TestScores(int[] scores) throws InvalidTestScore {
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < 0 || scores[i] > 100)
				throw new InvalidTestScore("The test score" + scores[i] + " is not valid");
			else
				Scores.add(scores[i]);
		}
	}
	
	public static void clearscores() {
		Scores.clear();
	}
	
	static int getaverage() {
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
