package kethua;

public class NhanVien extends ConNguoi{
	//1.thuoc tinh
	public double luong ;
	//2.phuong thuc
	public NhanVien() {
		super.ten = "Nhan vien";
		super.chieuCao = 1700 ;
		super.canNang = 60 ;
		super.soDienThoai = "090909090909";
		super.email = "ljugjguuy@gmail.com";
		this.luong = 120000;
			
		
		//this.xuatThongTin();
		
		
	}
	public void xuatThongTin() {
		System.out.println("******** NHAN VIEN ********" );
		System.out.println("ten: " + this.ten );
		System.out.println("Chieu Cao: " + this.chieuCao );
		System.out.println("Can Nang: " + this.canNang );
		System.out.println("So dien Thoai: " + this.soDienThoai );
		System.out.println("email: " + this.email);
		System.out.println("Luong : " + this.luong);
		
	}
}
