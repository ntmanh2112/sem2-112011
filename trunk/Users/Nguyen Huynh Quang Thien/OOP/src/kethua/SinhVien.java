package kethua;

public class SinhVien extends ConNguoi {
	//1.Thuộc tính
	public double diemTB;
	
	//2.Phương thức
	public SinhVien() {
		super.ten = "Sinh viên";
		super.chieuCao = 1700;
		super.canNang = 60;
		super.soDienThoai = "0987654321";
		super.email = "sinhvien@gmail.com";
		this.diemTB = 7.5;
		
		//this.xuatThongTin();
	}
	
	public void xuatThongTin() {
		System.out.println("******************");
		System.out.println("Tên: " + this.ten);
		System.out.println("Chiều cao: " + this.chieuCao);
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("số điện thoại: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
		System.out.println("Điểm trung bình: " + this.diemTB);
	}
	
	@Override
	public void hoc() {
		super.hoc();
		System.out.println("Sinh viên học đại học,cao học,nghiên cứu sinh");
	}
}
