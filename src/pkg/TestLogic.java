package pkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax() {
		int[] arr = { 4, 6, 2, 9, 1, 7 };
		assertEquals(9, Calculation.findMax(arr));

		int[] negArr = { -7, -3, -4, -1, -9, -19 };
		assertEquals(-1, Calculation.findMax(negArr));
	}
}