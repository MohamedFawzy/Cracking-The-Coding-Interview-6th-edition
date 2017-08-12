package bigO;

import java.util.*;

public class BigO {

	public int sum=0;
	public int product=1;
	/**
	 * this will take runtime O(N) time the fact that we iterate through the array twice does not matter
	 * @param array
	 */
	public void foo(int[] array){
		for(int i=0; i< array.length; i++){
			this.sum += array[i];
		}
		
		for(int i=0; i< array.length; i++){
			this.product *= array[i];
		}
	}
	
	/**
	 * The inner for loop has 0 (N) iterations 
	 * and it is called Ntimes.Therefore, the runtime is 0 (N^ 2)
	 * 
	 * @param array
	 */
	public static void printPairs(int[] array){
		
		for(int i=0; i< array.length; i++){
			for(int j=0; j < array.length; j++){
				System.out.println(array[i]+" , "+ array[j]);
			}
		}
	}
	
	/**
	 * the running time still O(n^2)
	 * @param array
	 */
	public static void printUnorderedPairs(int[] array){
		for(int i=0; i< array.length; i++){
			for(int j=i+1; j < array.length; j++){
				System.out.println(array[i]+" , "+array[j]);
			}
		}
	}
	/**
	 * the running time will be O(a b)
	 * because we have two input variables both matter
	 * @param a
	 * @param b
	 */
	public static void printUnorderedPairs(int[] a, int[] b){
		for(int i=0; i< a.length; i++){
			for(int j=0; j< b.length; j++){
				if(a[i] < b[j]){
					System.out.println(a[i]+" , "+ b[j]);
				}
			}
		}
	}
	/**
	 * this running time will be O(n) the fact that it only goes the half of the array
	 * in terms of iteration does not impact the big o time
	 * @param array
	 */
	public static void reverse(int[] array){
		for(int i=0; i< array.length / 2; i++){
			int other = array.length-i -1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}
	/**
	 * the run time will be O(n) where n number of nodes
	public static int sum(Node node){
		if(node==null){
			return 0;
		}
		
		return sum(node.left) + node.value + sum(node.right);
	}*/
	
	
	
	/**
	 * check if number is prime or not
	 * running time O(√n) times √ means square root
	 * @param n
	 * @return boolean
	 */
	public static boolean isPrime(int n){
		for(int x=2; x * x < n; x++){
			if(n % x ==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * computes n! (n factorial)
	 * @param n
	 * @return int
	 * time complexity for this is O(n)
	 */
	public static int factorial(int n){
		if(n < 0){
			return -1;
		}else if(n == 0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	
	public static void permutation(String str){
		permutation(str, "");
	}
	/**
	 * count permutation of  string 
	 * @param str
	 * @param prefiex
	 * time complexity O(n^2 * n!)
	 * 
	 */
	public static void permutation(String str, String prefiex){
		if(str.length()==0){
			System.out.println(prefiex);
		}else{
			for(int i=0; i< str.length(); i++){
				String reminder = str.substring(0,i) + str.substring(i+1);
				permutation(reminder, prefiex+str.charAt(i));
			}
		}
	}
	/**
	 * computes nth fibonacci sequence
	 * @param int n
	 * complexity there are two branches per call and we go as deep N ,
	 *  therefore the runtime is O(2^n)
	 */
	public  int fib(int n){
		if(n<=0){
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			return fib(n -1 ) + fib(n -2);
		}
	}	
	
	/**
	 *  memorize fibonacci sequence number
	 *  time complexity O(n)
	 * @param n , memo
	 * @param memo
	 * @return int
	 */
	public int fib(int n, int[] memo){
		if(n<=0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			memo[n] = fib(n -1, memo) + fib(n-2, memo);
		}
		return memo[n];
	}
	
	
	public void allFib_memo(int n){
		int[] memo = new int[n+1];
		for(int i=0; i < n; i++){
			System.out.println(i + ": "+ fib(i, memo));
		}
	}
	/**
	 * prints all Fibonacci numbers from 0 to n
	 * time complexity takes O(2 ^ n)
	 * 
	 * @param n
	 */
	public  void allFib(int n){
		for(int i =0; i < n; i++){
			System.out.println(i + ": " + fib(i));
		}
	}
	
	/**
	 * prints the power of 2 from 1 through n (inclusive)
	 * time complexity O(log n)
	 * @param n
	 * @return
	 */
	public static int powerOf2(int n){
		if(n < 1){
			return 0;
		}else if(n == 1){
			System.out.println(1);
			return 1;
		}else{
			int prev = powerOf2(n / 2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
	/**
	 * computes the product of a and b
	 * complexity O(b) the forloop iterate through b
	 * @param a
	 * @param b
	 * @return int
	 */
	public int product(int a, int b){
		int sum =0;
		for(int i=0; i<b; i++){
			sum += a;
		}
		
		return sum;
	}
	
	/**
	 * compute a^b
	 * @param a
	 * @param b
	 * @return int
	 */
	public int power(int a , int b){
		if(b < 0){
			return 0;
		}else if( b==0){
			return 1;
		}else{
			return a * power(a, b-1);
		}
	}
	
	/**
	 * compute a % b
	 * @param a
	 * @param b
	 * @return
	 */
	public int mod(int a, int b){
		if(b <= 0){
			return -1;
		}
		
		int div = a / b;
		return a - div * b;
	}
	/**
	 * performs integer division
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b){
		int count=0;
		int sum=b;
		while(sum <= a){
			sum += b;
			count++;
		}
		return count;
	}
	
	
	/**
	 * The following code computes the [integer) square root of a number.
	 *  If the number is not a perfect square (there is no integer square root), 
	 *  then it returns -1.It does this by successive guessing. 
	 *  If n is 100, it first guesses SO. Too high?
	 *   Try something lower - halfway between 1 and SO. What is its runtime?
	 */
	
	int sqrt(int n){
		return sqrt_helper(n, 1, n);
	}
	

	int sqrt_helper(int n , int min , int max){
		if(max < min) {
			return -1; // no square root
		}
		
		int guess = (min + max) / 2;
		if(guess * guess == n){
			return guess;
		}else if(guess * guess < n){
			return sqrt_helper(n, guess + 1, max); // try higher
		}else{
			return sqrt_helper(n, min , guess -1); // try lower
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,7,8,9,10};
		int[] array1 ={1,2,34,5,192,101,10};
		BigO.printPairs(array);
		System.out.println("=========================");
		BigO.printUnorderedPairs(array);
		System.out.println("=========================");
		BigO.printUnorderedPairs(array, array1);
		System.out.println("=========================");
		BigO.reverse(array);
		for(int i=0; i< array.length; i++){
			System.out.println(array[i]);
		}
		System.out.println("===========================");
		boolean isPrime = BigO.isPrime(33);
		boolean isPrime1 = BigO.isPrime(29);
		System.out.println(isPrime+" , "+ isPrime1);
		System.out.println("==============");
		int result = BigO.factorial(5);
		System.out.println(result);
		BigO.permutation("ABC");
		System.out.println("=======");
		BigO.powerOf2(50);

	}
}
