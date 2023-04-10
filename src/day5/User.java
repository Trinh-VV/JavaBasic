package day5;

public class User {
	public String hoTen;
	public String ngaySinh;
	
	public void inThongTinNV() {
		System.out.printf("%-20s %-15s %-6s\n" , hoTen , ngaySinh);
	}
}
