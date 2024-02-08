package leadrat.task1;

import java.util.Scanner;

public class MaximunDigit_4 {

	public static int maxDigit(int num) {
		int[] arr = new int[10];
		while (num > 0) {
			int rem = num % 10;
			arr[rem]++;
			num /= 10;
		}
		int digit = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
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

		System.out.println("Maximum Digit is : " + maxDigit(num));
	}
}
