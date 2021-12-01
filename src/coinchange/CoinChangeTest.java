package coinchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void testMinCoin() {
		assertEquals(1, CoinChange.minCoin(1, new int[] { 1, 5, 7 }, new int[2]));
		assertEquals(4, CoinChange.minCoin(4, new int[] { 7, 5, 1 }, new int[5]));
		assertEquals(1, CoinChange.minCoin(5, new int[] { 7, 5, 1 }, new int[6]));
		assertEquals(2, CoinChange.minCoin(6, new int[] { 1, 7, 5 }, new int[7]));
		assertEquals(3, CoinChange.minCoin(11, new int[] { 1, 7, 5 }, new int[12]));
		assertEquals(4, CoinChange.minCoin(18, new int[] { 1, 7, 5 }, new int[19]));
	}

}