package q4_Plaindrom_Permutation;
/**
 * Class PalindromePermutationChecker
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 */


public class SolutionA {

	public static boolean checkMaxOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {

				if (foundOdd) {
					return false;
				}

				foundOdd = true;
			}
		}
		return true;
	}
	
	
	public static boolean isPermutationOfPalindrome(String pharse)
	{
		int[] table = Common.buildCharFrequencyTable(pharse);
		return checkMaxOdd(table);
	}
	
	
	public static void main(String[] args)
	{
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}
	
}
