package kethua;

public class NhanVien extends ConNguoi {
	public double luong;
	
	public NhanVien() {
		this.ten = "Con Nguoi";
		this.chieuCao = 170;
		this.canNang = 50;
		this.soDienThoai = "0123456789";
		this.email = "nhanvien@gmail.com";
		this.luong = 2000000;
	}
	
	public void xuatThongTin() {
		System.out.println("********* NHAN VIEN *********");
		System.out.println("Ten:" + this.ten);
		System.out.println("Chieu Cao:" + this.chieuCao);
		System.out.println("Can Nang:" + this.canNang);		
		System.out.println("So Dien Thoai:" + this.soDienThoai);
		System.out.println("Email:" + this.email);
		System.out.println("Luong Can Ban:" + this.luong);
		
	}
	
}