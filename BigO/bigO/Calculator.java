package bigO;

public class Calculator {

	public int evaluate(String expression){
		int sum=0;
		for(String summad: expression.split("\\+")){
			sum += Integer.valueOf(summad);
		}
		return sum;
	}
	
}
