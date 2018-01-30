package multiplyingNumbers;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {

	public void testmultiply() {
		Multiplication m = new Multiplication();
		assertEquals(50, m.multiply(5, 10));
	}

	public void testmultiplyThree() {
		Multiplication m = new Multiplication();
		assertEquals(125, m.multiplyThree(5, 5, 5));
	}
}
