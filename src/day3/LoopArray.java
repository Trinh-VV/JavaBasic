package day3;

import java.util.Scanner;

public class LoopArray {

	// Loop1 In mảng
	public void printArray() {
		int[] arr = new int[] { 1, 3, 5, 8, 9 };
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str = str + arr[i];
			} else {
				str = str + arr[i] + ", ";
			}
		}
		System.out.println("B1/ " + str);
	}

	// Loop2 Sum/average 1-100
	public void sumAndAverage(int n) {
		int sum = 0;
		float avg = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		avg = (float) sum / n;
		System.out.println("B2/ 1 ~ " + n + ": The sum is " + sum + ". The average is " + avg);
	}

	// Loop3 Sum/average 111-8899
	public void sumAndAverageEx2(int n, int m) {
		int sum = 0;
		int count = 0;
		float avg = 0;
		for (int i = n; i <= m; i++) {
			sum = sum + i;
			count++;
		}
		avg = (float) sum / count;
		System.out.println("B3/ " + n + " ~ " + m + ": The sum is " + sum + ". The average is " + avg);
	}

	// Loop4 Sum/average odd 1-100
	public static void sumAndAverageEx3(int n) {
		int sum = 0;
		int count = 0;
		float avg = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0)
				sum = sum + i;
			count++;
		}
		avg = (float) sum / count;
		System.out.println("B4/ 1 ~ " + n + ": The sum odd is " + sum + ". The avg is " + avg);
	}

	// Loop5 Sum/average %7 1-100
	public static void sumAndAverageEx4(int n) {
		int sum = 0;
		int count = 0;
		float avg = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				count++;
			}
		}
		avg = (float) sum / count;
		System.out.println("B5/ 1 ~ " + n + ": The sum(%7=0) is " + sum + ". The avg is " + avg);
	}

	// Loop6 sum of the squares 1-100
	public static void sumSquaresEx5(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		System.out.println("B6/ The sum of the squares is " + sum);
	}

	// Loop7 HarmonicSum
	public static void harmonicSumEx6(int n) {
		double leftToRight = 0;
		double rightToLeft = 0;
		for (int i = 1; i <= n; i++) {
			leftToRight = leftToRight + (double) 1 / n;
		}
		for (int i = n; i >= 1; i--) {
			rightToLeft += (double) 1 / n;
		}
		System.out
				.println("B7/ The sum of leftToRight is " + leftToRight + ". The sum of rightToLeft is " + rightToLeft);
	}

	// Loop8 SquareBoard
	public static void squareBoardEx7(int n) {
		String str = "";
		System.out.println("B8/");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				str = str + "# ";
			}
			System.out.println(str.trim());
			str = "";
		}
	}

	// Loop9 CheckBoard
	public static void checkBoardEx8(int n) {
		String rs = "";
		System.out.println("B9/");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				rs = i % 2 != 0 ? rs + "# " : rs + " #";
			}
			System.out.println(rs);
			rs = "";
		}
	}

	// Loop10 Search key
	public void searchKeyEx9(String s) {
		int no = s.indexOf('r');
		System.out.println(no == -1 ? "B10/ Not exist r" : "B10/ Index of r is " + no);
	}

	// In mang int
	public void printArray(int arr[]) {
		String str = "";
		if (arr.length == 0) {
			str = "{}";
		} else {
			str = str + "{";
			for (int i = 0; i < arr.length; i++) {
				str = i == (arr.length - 1) ? str + arr[i] + "}" : str + arr[i] + ", ";
			}
		}
		System.out.println(str);
	}

	// In mang float
	public void printArray(float arr[]) {
		String str = "";
		if (arr.length == 0) {
			str = "{}";
		} else {
			str = str + "{";
			for (int i = 0; i < arr.length; i++) {
				str = i == (arr.length - 1) ? str + arr[i] + "}" : str + arr[i] + ", ";
			}
		}
		System.out.println(str);
	}

	// In mang double
	public void printArray(double arr[]) {
		String str = "";
		if (arr.length == 0) {
			str = "{}";
		} else {
			str = str + "{";
			for (int i = 0; i < arr.length; i++) {
				str = i == (arr.length - 1) ? str + arr[i] + "}" : str + arr[i] + ", ";
			}
		}
		System.out.println(str);
	}

	// QL students
	public void radesAverage() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-----\nEnter the number of students: ");
		int n = sc.nextInt();
		int grades[] = new int[n];
		int num = 0;
		while (num < n) {
			int std = num + 1;
			System.out.print("* Enter the grade for student " + std + " :");
			int score = sc.nextInt();
			if (score >= 0 && score <= 100) {
				grades[num] = score;
				num += 1;
			} else {
				System.out.println("Invalid grade, try again...");
			}
		}
		printNumStudent(grades);
		printScore(grades);
		printAverage(grades);
	}

	private void printAverage(int[] grades) {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		System.out.println("Average score: " + (float) sum / grades.length);

	}

	private void printScore(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			int p = i + 1;
			System.out.println("Score of student " + p + " is: " + grades[i]);
		}
	}

	private void printNumStudent(int[] grades) {
		System.out.println("====>\nNumber of student: " + grades.length);
	}

	public void isOdd(int a) {
		boolean rs = false;
		if (a % 2 != 0) {
			rs = true;
		}
		System.out.println(rs ? "Lẻ" : "Chẵn");
	}

	public boolean hasEight(int number) {
		String num = number + "";
		boolean rs = false;
		if (num.charAt(num.length() - 1) == '8') {
			rs = true;
		}
		return rs;
	}

	public void magicSum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer or -1 to exit: ");
		int number = sc.nextInt();

		while (number != -1) {
			if (hasEight(number) == true) {
				sum += number;
			}

			// Read next input (Take note that you need to repeat these codes!)
			System.out.print("Enter a positive integer or -1 to exit: ");
			number = sc.nextInt();
		}
		System.out.println("Sum of number include 8: " + sum);
	}
}
