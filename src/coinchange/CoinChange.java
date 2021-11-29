package coinchange;

public class CoinChange {

	public static void main(String[] args) {

		/*
		 * int[] change = { 1, 5, 7 }; int n = 18;
		 * 
		 * int minChange = minCoin(n, change);
		 */
		System.out.println(minCoin(19, new int[] { 1, 5, 7 }));
	}

	public static int minCoin(int amount, int change[]) {
		if (amount == 0) {
			return 0;
		} else {
			int ans = 0;
			for (int i = 0; i < change.length; i++) {
				if (amount - change[i] >= 0) {
					int subAns = minCoin(amount - change[i], change);

//					if (subAns < ans) {
					ans = subAns + 1;
//					}
					System.out.println(subAns + "(" + (amount - change[i]) + ")\t" + ans + "(" + amount + ")");
				}
			}

			return ans;
		}
	}
}