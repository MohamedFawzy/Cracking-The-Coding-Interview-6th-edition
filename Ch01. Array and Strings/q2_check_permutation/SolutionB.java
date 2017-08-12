package q2_check_permutation;
/**
 * Class Permutation
 * Given two strings, write a method to decide if one is a permutation of the other.
 * e.g of strings god can be dog
 */
public class SolutionB {

	public static boolean permutation(String s, String t)
	{
		// permutation strings must be same length
		if(s.length() != t.length()){
			return false;
		}
		
		// create array of letters
		int[] letters = new int[128]; // ASCII letters
		
		//loop through first string
		for(int i=0; i< s.length(); i++){
			// add first string letters in array
			letters[s.charAt(i)]++;
		}
		
		for(int i=0; i< t.length(); i++){
			// remove second string letters from array
			letters[t.charAt(i)]--;
			// if letter less than zero that means this letter exist in second string and deos not exist in first string
			if(letters[t.charAt(i)] < 0){
				return false;
			}
		}
		
		return true; // letters array has no negative values, and therefore no positive values either

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
