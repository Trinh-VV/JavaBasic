package day5;

public class Teacher extends AbstractUser {
	public String maGV;
	
	public void inThongTinNV(String role) {
		System.out.printf("%-20s %-15s %-8s %-6s\n" , hoTen , ngaySinh , maGV, role);
	}

	@Override
	public void inThongTinNV() {
		// TODO Auto-generated method stub
		
	}
}
