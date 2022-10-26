package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitAnnotations {
	
	@BeforeAll
	public static void beforeall() {
		
		System.out.println("Before All");
	}
	
	@BeforeEach
	
	public void junitbefore() {
		
		System.out.println("Before junit");
		
	}
	@Test
	public void Test1() {
		
		assertEquals(11,Calculator.add(5, 6));
		
	}

	@AfterEach
	
	public void junitafter() {
		
		System.out.println("After junit");
		
	}
	
	@AfterAll
	public static void afterall() {
		
		System.out.println("After All");
	}

}
