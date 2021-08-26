import static org.junit.Assert.*;


import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		  assertEquals(0, StringCalculator.add(""));
		}

}
