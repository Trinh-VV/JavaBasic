package common;

import day3.LoopArray;
import day5.Admin;
import day5.Student;
import day5.Teacher;

public class Main {
	public static void main(String[] args) {
	LoopArray p = new LoopArray();
//	p.printArray();
//	p.sumAndAverage(100);
//	p.sumAndAverageEx2(111, 8899);
//	p.sumAndAverageEx3(100);
//	p.sumAndAverageEx4(100);
//	p.sumSquaresEx5(100);
//	p.harmonicSumEx6(5000);
//	p.squareBoardEx7(7);
//	p.checkBoardEx8(7);
//	p.searchKeyEx9("Hello world");

//		System.out.printf("%-20s %-15s %-6s %-6s\n", "Họ tên", "Ngày sinh", "Mã SV", "Role");
//		Student st = new Student();
//		st.hoTen = "Vo Van Trinh";
//		st.ngaySinh = "11/01/1111";
//		st.maSv = "1234";
//		st.inThongTinNV("sv");
//
//		Teacher teacher = new Teacher();
//		teacher.hoTen = "Nguyen Van GV";
//		teacher.ngaySinh = "22/22/2222";
//		teacher.maGV = "1235";
//		teacher.inThongTinNV("gv");
//
//		Admin admin = new Admin();
//		admin.hoTen = "Vo Van Admin";
//		admin.ngaySinh = "11/01/1111";
//		admin.maNV = "1222ko phải";
//		admin.inThongTinNV("nv");


	System.out.print("Mảng 0 phần tử: ");
	p.printArray(new int[] {});
	System.out.print("Mảng 1 phần tử: ");
	p.printArray(new int[] { 6 });
	System.out.print("Mảng 5 phần tử: ");
	p.printArray(new int[] { 1, 3, 5, 7, 9 });
	System.out.print("Mảng Float: ");
	p.printArray(new float[] { 1.2f, 2.3f });
	

//	System.out.print("----\nCheck chẵn lẻ: ");
//	p.isOdd(1998);
//	System.out.print("Check chứa 8: ");
//	System.out.println(p.hasEight(1998)?"Chứa số 8":"Không chứa số 8");
//	System.out.print("Tổng số có 8: ");
//	p.magicSum();
//	
//	p.radesAverage();
	}
}
