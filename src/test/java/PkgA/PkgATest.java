package PkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class PkgATest {

	@Tag("Sanity")
	@Tag("Regression")
	@Test
	@DisplayName("Test is PkgA")
	public void Test1() {
		
		assertTrue(StringFunctions.ispalindrome("madam"));
	}
	
	@Tag("Regression")
	@Test
	@DisplayName("Test is PkgA")
	public void Test2() {
		
		assertTrue(StringFunctions.ispalindrome("madam"));
	}
	

}
