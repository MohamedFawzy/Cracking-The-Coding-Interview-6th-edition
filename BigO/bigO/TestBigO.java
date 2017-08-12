package bigO;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestBigO {

	
	@Test
	public void foo(){
		BigO bigO = new BigO();
		int[] array = {1,2,3};
		bigO.foo(array);
		assertEquals(6, bigO.sum);
		assertEquals(6, bigO.product);
		int result = bigO.fib(10);
		System.out.println(result);
		bigO.allFib(5);
		System.out.println("======");
		bigO.allFib_memo(5);
		System.out.println("======");
		int product = bigO.product(5,3);
		assertEquals(15, product);
		int power = bigO.power(2, 3);
		assertEquals(8, power);
		int mod = bigO.mod(5, 2);
		assertEquals(1, mod);
		int div = bigO.div(6, 3);
		assertEquals(2, div);
		int sqrt = bigO.sqrt(9);
		System.out.println(sqrt);
	}
	
}
