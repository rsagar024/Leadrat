package leadrat.task1;

import java.util.Scanner;

public class PrimeDigitSum_8 {

	public static int primeDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (prime(rem)) {
				sum += rem;
			}
			num /= 10;
		}
		return sum;
	}

	public static boolean prime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Sum of Prime Digit : " + primeDigitSum(num));
	}
}
