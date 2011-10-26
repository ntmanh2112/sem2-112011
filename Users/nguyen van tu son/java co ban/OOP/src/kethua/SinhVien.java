package kethua;

public class SinhVien extends ConNguoi{
	// thuoc tinh
	public double diemTrungBinh;
	// phuong thuc
	public SinhVien() {
		super.ten = "Sinh Vien";
		super.chieuCao = 160;
		super.canNang = 50;
		super.soDienThoai = "123456789";
		super.email = "sinhvien@gmail.com";
		this.diemTrungBinh = 5;
		
		
	}
	
	public void xuatThongTin() {
		System.out.println("********* SINH VIEN *********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu Cao: " + this.chieuCao);
		System.out.println("Can Nang: " + this.canNang);
		System.out.println("So Dien Thoai: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
		System.out.println("Diem Trung Binh: " + this.diemTrungBinh);
	}
	
	@Override
	public void hoc() {
		super.hoc();
		System.out.println("Sinh Vien hoc Dai Hoc, Cao Hoc, Nghien Cuu Sinh");
	}
}

