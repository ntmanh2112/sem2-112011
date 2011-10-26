package extend;

public class NhanVien extends DongVat {
//1. Thuoc tinh
	public double luong;
//2. Thuoc tinh
	//constructor
	public NhanVien() {
		super.ten = "Nguyen Thanh Huy";
		super.chieuCao = 1.65;
		super.canNang = 53;
		this.luong = 5000000;
	}
	//xuat
	public void xuat() {
		System.out.println("********** NHAN VIEN **********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu cao: " + this.chieuCao);
		System.out.println("Can nang: " + this.canNang);
		System.out.println("Luong: " + this.luong);
	}

}
