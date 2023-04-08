package day3;

public class main {
	public static void main(String[] args) {
		LoopArray p = new LoopArray();
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

		System.out.print("Mảng 0 phần tử: ");
		p.printArray(new int[] {});
		System.out.print("Mảng 1 phần tử: ");
		p.printArray(new int[] { 6 });
		System.out.print("Mảng 5 phần tử: ");
		p.printArray(new int[] { 1, 3, 5, 7, 9 });
		System.out.print("Mảng Float: ");
		p.printArray(new float[] { 1.2f, 2.3f });
		
		
		System.out.print("----\nCheck chẵn lẻ: ");
		p.isOdd(1998);
		System.out.print("Check chứa 8: ");
		System.out.println(p.hasEight(1998)?"Chứa số 8":"Không chứa số 8");
		System.out.print("Tổng số có 8: ");
		p.magicSum();
		
		p.radesAverage();
	}
}
