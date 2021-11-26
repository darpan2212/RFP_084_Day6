package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number : ");

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		sc.close();
		PerfectNumber perfectNumber = new PerfectNumber();
		for (int i = 1; i <= range; i++) {
			if(perfectNumber.checkPerfectNumber(i)) {
				System.out.print(i+"\t");
			} 
		}
	}
	
	public boolean checkPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
//				System.out.println(i);
				sum += i;
			}
		}

		if (sum == number) {
			return true;
//			System.out.println(number + " is the perfect number");
		} else {
			return false;
//			System.out.println(number + " is not the perfect number " + "(Sum of divisors are :" + sum + ")");
		}
	}

}