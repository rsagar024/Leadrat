package leadrat.task1;

import java.util.Scanner;

public class LeapYear_2 {

	public static void leapYear(int year) {
		int x = 1;
		while (x <= 20) {
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
				System.out.print(year + " ");
				x++;
			}
			year++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		sc.close();

		leapYear(year);
	}
}
