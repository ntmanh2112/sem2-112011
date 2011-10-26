package kethua;

public class NhanVien extends ConNguoi {
	
	public double luong;
	
	public NhanVien() {
		super.ten = "Nhan Vien";
		super.chieuCao = 65;
		super.canNang = 65;
		super.soDienThoai = "0987654321";
		super.email = "nhanvien@gmail.com";
		this.luong = 5000000;
	
		
	}
	
	public void xuatThongTin() {
		System.out.println("********* NHAN VIEN *********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu Cao: " + this.chieuCao);
		System.out.println("Can Nang: " + this.canNang);
		System.out.println("So Dien Thoai: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
		System.out.println("Email: " + this.luong);
	}
	
}
