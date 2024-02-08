package leadrat.task1;

import java.util.Scanner;

public class SortArray_1 {

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
//		int[] arr = { 4, 2, 9, 4, 1, 8, 0, 3 };
//		for (int ele : arr) {
//			System.out.print(ele + " ");
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of an Array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int[] res = sort(arr);
		for (int ele : res) {
			System.out.print(ele + " ");
		}
	}
}
