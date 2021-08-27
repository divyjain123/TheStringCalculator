import static org.junit.Assert.assertEquals;
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
}
