package q4_Plaindrom_Permutation;

public class Common {

	
	public static int getCharNumber(Character c)
	{
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		
		if(a <= val && val <= z){
			return val - a;
		}
		
		return -1;
	}
	
	
	public static int[] buildCharFrequencyTable(String pharse)
	{
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		
		for(char c: pharse.toCharArray()){
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
			}
		}
		
		return table;
	}
}
