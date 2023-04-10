package day5;

public class Admin extends AbstractUser{
	public String maNV;
	
	public void inThongTinNV(String role) {
		System.out.printf("%-20s %-15s %-8s %-6s\n" , hoTen , ngaySinh , maNV, role);
	}

	@Override
	public void inThongTinNV() {
		
	}
}
