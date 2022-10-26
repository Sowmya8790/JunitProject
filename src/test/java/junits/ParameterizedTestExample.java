package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {
	
	@ValueSource(strings = {"MOM","DAD","RADAR"})
	@ParameterizedTest
	public void Test(String arg1) {
		
		assertTrue(StringFunctions.ispalindrome(arg1));
		
	}
	
	@CsvSource(value = {"RADAR:MOM:DAD:THIS IS COMPARISION"}, delimiter = ':')
	@ParameterizedTest
	public void Test2(String arg1,String arg2,String arg3){
		
		assertEquals(arg1,arg2);
		
	}

}
