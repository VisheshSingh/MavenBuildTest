package multiplyingNumbers;

import junit.framework.TestCase;

public class DigitPositionTest extends TestCase {
	public void testgetPosition() {
		assertEquals(100, DigitPosition.getPosition(2018, 0));
	}
}
