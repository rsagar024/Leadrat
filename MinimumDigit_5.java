package leadrat.task1;

import java.util.Scanner;

public class MinimumDigit_5 {

	public static int minDigit(int num) {
		int[] arr = new int[10];
		while (num > 0) {
			int rem = num % 10;
			arr[rem]++;
			num /= 10;
		}
		int digit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				digit = i;
				break;
			}
		}
		return digit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Minimum Digit is : " + minDigit(num));
	}
}
