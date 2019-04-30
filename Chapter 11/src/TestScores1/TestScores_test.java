package TestScores1;

public class TestScores_test {

	public static void main(String[] args) {
		int[] scoresJ = {98, 100, 89, 95, 84, 88, 93, 99};
		int[] scoresT = {-12, 34, 97, 13, 76, 69, 90};
		TestScores Jimsscores = new TestScores(scoresJ);
		//TestScores Timsscores = new TestScores(scoresT);
		System.out.println(Jimsscores.getaverage());
		//System.out.println(Timsscores.getaverage());

	}

}
