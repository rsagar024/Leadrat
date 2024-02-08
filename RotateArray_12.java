package leadrat.task1;

import java.util.Scanner;

public class RotateArray_12 {

	public static int[] rotate(int[] arr, int n) {
		for (int i = 1; i <= n; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("How many time rotate an array");
		int n = sc.nextInt();
		sc.close();

		int[] res = rotate(arr, n);
		for (int ele : res) {
			System.out.print(ele + " ");
		}
	}
}
