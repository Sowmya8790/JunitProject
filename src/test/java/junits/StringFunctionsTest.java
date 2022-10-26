package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		
		assertEquals(true,StringFunctions.ispalindrome("madam"));
	}
	
	@Test
	public void Test4() {
		
		assertEquals(false,StringFunctions.ispalindrome("priya"));
	}
	
	@Test
	public void Test2() {
		
		assertTrue(StringFunctions.ispalindrome("madam"));
	}
	
	@Test
	public void Test3() {
		
		assertFalse(StringFunctions.ispalindrome("priya"));
	}
	
	
	@DisplayName("Example of repeated test")
	@RepeatedTest(2)
	public void Test5() {
		
		assertTrue(StringFunctions.ispalindrome("mom"));
	}

}
