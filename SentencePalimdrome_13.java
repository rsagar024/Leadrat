package leadrat.task1;

import java.util.Scanner;

public class SentencePalimdrome_13 {

	public static void sentencePalimdrome(String str) {
		String sub = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sub += str.charAt(i);
			} else {
				if (palimdrome(sub)) {
					System.out.print(sub + " ");
				}
				sub = "";
			}
		}
		if (palimdrome(sub)) {
			System.out.print(sub + " ");
		}
	}

	public static boolean palimdrome(String str) {
		int l = 0, r = str.length() - 1;
		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		sc.close();

		sentencePalimdrome(str);
	}
}
