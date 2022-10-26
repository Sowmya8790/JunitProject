package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	@Test
	public void Test1() {
		
		assertEquals(11,Calculator.add(5, 6));
		
	}
	
	@Test
	public void Test2() {
		
		assertEquals(10,Calculator.sub(20, 10));
	}
	
	/*@Test
	public void Test3() {
		
		//failing intensionally
		assertEquals(1,Calculator.sub(20, 10));
	}*/

}
