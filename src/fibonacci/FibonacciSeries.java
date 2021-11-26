package fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	int nextNumber;

	public static void main(String[] args) {

		System.out.println("How many fibonacci elements to print?");

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();

		int prev = 0;
		int current = 1;

		if (count > 0) {
			System.out.print(prev +"\t");
			for (int i = 1; i < count; i++) {
				System.out.print(current + "\t");
				FibonacciSeries fbnacci = new FibonacciSeries(); 
				int temp = fbnacci.nextElement(prev, current);
				prev = current;
				current = temp;
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	public int nextElement(int prev, int current) {
		return (prev + current);
	}
}