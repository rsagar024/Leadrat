package leadrat.task1;

import java.util.Scanner;

public class SumDigit_9 {

	public static String sumDigit(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		if (sum % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Sum of digit is : " + sumDigit(num));
	}
}
