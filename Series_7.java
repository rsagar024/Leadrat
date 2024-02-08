package leadrat.task1;


public class Series_7 {

	// Output : 1+3+5+7+9.....
	public static void series1(int n) {
		System.out.println("Series 1");
		int x = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(x + " + ");
			x += 2;
		}
		System.out.println("\n");
	}

	// Output : 1-2+3-4+5-6......
	public static void series2(int n) {
		System.out.println("Series 2");
		int x = 1;
		for (int i = 1; i <= n; i++) {
			if (x % 2 != 0) {
				System.out.print(x + " - ");
			} else {
				System.out.print(x + " + ");
			}
			x++;
		}
		System.out.println("\n");
	}

	// Output : 1,22,333,4444......
	public static void series3(int n) {
		System.out.println("Series 3");
		for (int i = 1; i <= n; i++) {
			String res = digit1(i);
			System.out.print(res + ", ");
		}
		System.out.println("\n");
	}

	public static String digit1(int n) {
		String res = "";
		for (int i = 1; i <= n; i++) {
			res += n;
		}
		return res;
	}

	// Output : 1,12,123,1234.....
	public static void series4(int n) {
		System.out.println("Series 4");
		for (int i = 1; i <= n; i++) {
			String res = digit2(i);
			System.out.print(res + ", ");
		}
		System.out.println("\n");
	}

	public static String digit2(int n) {
		String res = "";
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		return res;
	}

	public static void main(String[] args) {
		series1(7);
		series2(5);
		series3(5);
		series4(5);
	}
}
