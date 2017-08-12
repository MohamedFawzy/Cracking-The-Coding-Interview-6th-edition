package q2_check_permutation;
/**
 * Class Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 * e.g of strings god can be dog
 */

public class SolutionA {

	
	public static String sort(String str)
	{
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
		
	}
	
	public static boolean permutation(String s, String t)
	{
		return sort(s).equals(sort(t));
	}
	
	public static void main(String[] args)
	{
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}

	}
	
}
