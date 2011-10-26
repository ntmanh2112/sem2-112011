package kethua;

public class NhanVien extends ConNguoi {
	//1.Thuộc tính
	public double luong;
	
	//2.Phương thức
	public NhanVien() {
		super.ten = "Con mèo";
		super.chieuCao = 1700;
		super.canNang = 60;
		super.soDienThoai = "0981234567";
		super.email = "nhanvien@gmail.com";
		this.luong = 3000;
		
		//this.xuatThongTin();
	}
	
	public void xuatThongTin() {
		System.out.println("******************");
		System.out.println("Tên: " + this.ten);
		System.out.println("Chiều cao: " + this.chieuCao);
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("số điện thoại: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
		System.out.println("Lương: " + this.luong);
	}
}
