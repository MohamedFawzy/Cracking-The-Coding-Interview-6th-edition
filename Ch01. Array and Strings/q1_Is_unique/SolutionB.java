package q1_Is_unique;
/**
 * Class UniqueCharacters
 * @package src\chapter01
 *  Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */

public class SolutionB {
	
	/* Assumes only letters a through z. */
	public static boolean isUniqueChars(String str)
	{
		if(str.length() > 26){
			return false;
		}
		
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
	}

}
