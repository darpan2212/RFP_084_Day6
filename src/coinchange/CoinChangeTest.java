package coinchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void testMinCoin() {
		assertEquals(1, CoinChange.minCoin(5,  new int[]{1,5,7}));
	}
	
}