package leadrat.task1;

import java.util.Scanner;

public class PrintEvenDigit_3 {

	public static void evenDigit(int num) {
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				System.out.print(rem + " ");
			}
			num /= 10;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();

		evenDigit(num);
	}
}
