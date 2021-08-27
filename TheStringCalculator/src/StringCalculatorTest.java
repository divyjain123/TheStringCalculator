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
		assertEquals(4,StringCalculator.add("4"));
	}
	
	@Test
	public void WhenTwoNumbersAsInput() {
		assertEquals(9,StringCalculator.add("4,5"));
	}
	
	@Test
	public void WhenMultipleNumbersAsInput() {
		assertEquals(10,StringCalculator.add("1,4,5"));
	}



}
