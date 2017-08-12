package q1_Is_unique;

public class Tester {

	
	public static void main(String[] args)
	{
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			boolean wordA =  SolutionA.isUniqueChars(word);
			boolean wordB =  SolutionB.isUniqueChars(word);
			if (wordA == wordB) {
				System.out.println(word + ": " + wordA);
			} else {
				System.out.println(word + ": " + wordA + " vs " + wordB);
			}
		}
	}
}
