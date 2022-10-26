package PkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;



@Tag("Sanity")
public class PkgBTest {
	
	@Test
	@DisplayName("Test IS PkgB ")
	public void Test2() {
		
		assertTrue(StringFunctions.ispalindrome("madam"));
	}
}
