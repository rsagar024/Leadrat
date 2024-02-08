package leadrat.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitArray_11 {

	public static String splitArray(int[] arr) {

		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}

		if (sum % 2 != 0) {
			return "Split is not possible, because sum of array is odd";
		}
		int half = sum / 2;
		int n = arr.length;
		
		while(n>0) {
			if(sumOfSplitArray(arr, half)) {
				break;
			}else {
				arr = rotate(arr);
			}
			n--;
		}

		return "Splited Successfully";
	}

	public static int[] rotate(int[] arr) {
		int first = arr[0];
		for (int j = 0; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[arr.length - 1] = first;
		return arr;
	}
	
	public static boolean sumOfSplitArray(int[] arr, int half) {
		int leftSum = 0;
		int rightSum = 0;
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (leftSum + arr[i] <= half) {
				leftSum += arr[i];
				left.add(arr[i]);
			} else {
				rightSum += arr[i];
				right.add(arr[i]);
			}
		}
		
		if(leftSum==rightSum) {
			System.out.println(left);
			System.out.println(right);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		int[] arr = { 2, 5, 8, 2, 3, 7, 3 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(splitArray(arr));
	}
}
