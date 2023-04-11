package day5;

public class Student extends AbstractUser{
	public String maSv;
	
	public void inThongTinNV(String role) {
		System.out.printf("%-20s %-15s %-8s %-6s\n" , hoTen , ngaySinh , maSv, role);
	}

	@Override
	public void inThongTinNV() {
		
	}
}
