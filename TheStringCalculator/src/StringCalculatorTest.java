import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testWhenStringIsEmpty() {
		  assertEquals(0, StringCalculator.add(""));
		}

	@Test
	public void testWhenOneNumberAsInput() {
		assertEquals(4,StringCalculator.add("4"));
	}
	
	@Test
	public void testWhenTwoNumbersAsInput() {
		assertEquals(9,StringCalculator.add("4,5"));
	}
	
	@Test
	public void testWhenMultipleNumbersAsInput() {
		assertEquals(10,StringCalculator.add("1,4,5"));
	}

	@Test
	public void testMultipleNumbersWithNewLineDelimiter() {
		assertEquals(7,StringCalculator.add("1\n2,4"));
	}
	
	@Test
	public void testWhenDelimiterIsSpecified() {
	    assertEquals(4+5+6, StringCalculator.add("//;\n4;5;6"));
	}
	
	@Test
	public void negativeNumbersRaiseExeption() {
		try{
			StringCalculator.add("-2,6,7");
			fail("Exception");
		}catch(RuntimeException ex) {
				//check
	}
	}
	
	@Test
	public void testExceptionMessageWithNegativeNumbers() {
		try{
			StringCalculator.add("-2,-5,-6,7");
			fail("Exception");
		}catch(RuntimeException ex) {
			assertEquals("Negatives Not Allowed: -2,-5,-6",ex.getMessage());
		} 

	}
	
	@Test
	public void NumbersBiggerThanThousandShouldBeIgnored() {
	    assertEquals(5, StringCalculator.add("5,1001"));
	}
	

}
