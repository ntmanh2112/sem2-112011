package kethua;

public class SinhVien extends ConNguoi {
	//1.thuoc tinh
	public double diemTB ;
	//2.phuong thuc
	public SinhVien() {
		super.ten = "Sinh Vien";
		super.chieuCao = 1600 ;
		super.canNang = 80 ;
		super.soDienThoai = "0909090909";
		super.email = "lethanhaptech@gmail.com";
		this.diemTB = 5 ;
		//this.xuatThongTin();
		
		
	}
	public void xuatThongTin() {
		System.out.println("******** SINH VIEN ********" );
		System.out.println("ten: " + this.ten );
		System.out.println("Chieu Cao: " + this.chieuCao );
		System.out.println("Can Nang: " + this.canNang );
		System.out.println("So dien Thoai: " + this.soDienThoai );
		System.out.println("Email: " + this.email);
		System.out.println("Diem Trung Binh: " + this.diemTB);
	}
	@Override
	public void hoc() {
		super.hoc();
		System.out.println("Sinh Vien hoc dai hoc,cao hoc,nghien cuu sinh");
	}
	
}