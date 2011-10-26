package kethua;

public class SinhVien extends ConNguoi {
	public double diemTrungBinh;
	
	public SinhVien() {
		this.ten = "Con Nguoi";
		this.chieuCao = 170;
		this.canNang = 50;
		this.soDienThoai = "0123456789";
		this.email = "nhanvien@gmail.com";
		this.diemTrungBinh = 5.0;
	}
	
	public void xuatThongTin() {
		System.out.println("********* SINH VIEN *********");
		System.out.println("Ten:" + this.ten);
		System.out.println("Chieu Cao:" + this.chieuCao);
		System.out.println("Can Nang:" + this.canNang);		
		System.out.println("So Dien Thoai:" + this.soDienThoai);
		System.out.println("Email:" + this.email);
		System.out.println("Diem Trung Binh:" + this.diemTrungBinh);
		
	}
	
	public void hoc() {
		System.out.println("Sinh Vien hoc DAI HOC, CAO HOC, NGHIEN CUU SINH");
	}
}
