package leadrat.task1;

import java.util.Scanner;

public class EachDigitFactor_10 {

	public static void eachDigitFactor(int num) {
		while (num > 0) {
			int rem = num % 10;
			System.out.print(rem + " factors are : ");
			factor(rem);
			System.out.println();
			num /= 10;
		}
	}

	public static void factor(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + ",");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();

		eachDigitFactor(num);
	}
}
