package day3;

//OOP
//String
//Array list
//Hashmap
//FileIO (file console)
public class LoopAndArray {
	public static void main(String[] args) {
		LoopAndArray p = new LoopAndArray();
		p.printArray();
		p.sumAndAverage(100);
		p.sumAndAverageEx2(111, 8899);
		p.sumAndAverageEx3(100);
		p.sumAndAverageEx4(100);
		p.sumSquaresEx5(100);
		p.harmonicSumEx6(5000);
		p.squareBoardEx7(7);
		p.checkBoardEx8(7);
		p.searchKeyEx9("Hello world");

	}

	// Loop-B1 In mảng
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
}
