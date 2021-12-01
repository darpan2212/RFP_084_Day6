package coinchange;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 5, 10, 50, 100, 500, 1000 };

		System.out.println("Enter the amount");
		int n = sc.nextInt();
		sc.close();

		int[] ds = new int[n + 1];

		for (int i = 0; i < ds.length; i++) {
			ds[i] = -1;
		}

		int min = minCoin(n, arr, ds);

		System.out.println(min);
	}

	public static int minCoin(int n, int arr[], int[] ds) {
		if (n == 0) {
			return 0;
		} else {
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (n - arr[i] >= 0) {
					int subAns;
					if (ds[n - arr[i]] != -1) {
						subAns = ds[n - arr[i]];
					} else {
						subAns = minCoin(n - arr[i], arr, ds);
						ds[n - arr[i]] = subAns;
					}
					if (subAns + 1 < ans) {
						ans = subAns + 1;
					}
				}
			}
			return ans;
		}
	}
}