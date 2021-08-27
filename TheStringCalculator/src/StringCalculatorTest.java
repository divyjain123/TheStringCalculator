import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void WhenStringIsEmpty() {
		  assertEquals(0, StringCalculator.add(""));
		}

	@Test
	public void WhenOneNumberAsInput() {
		assertEquals(1,StringCalculator.add("1"));
	}
	
	@Test
	public void WhenTwoNumbersAsInput() {
		assertEquals(3,StringCalculator.add("1,2"));
	}
	
//	@Test
//	public void WhenMultipleNumbersAsInput() {
//		assertEquals(6,StringCalculator.add("1,2,3"));
//	}



}
