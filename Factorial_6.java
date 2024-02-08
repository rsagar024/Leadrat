package leadrat.task1;

import java.util.Scanner;

public class Factorial_6 {

	public static long factorial(int num) {
		long fact = 1l;
		for (int i = num; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Factorial is : " + factorial(num));
	}
}
