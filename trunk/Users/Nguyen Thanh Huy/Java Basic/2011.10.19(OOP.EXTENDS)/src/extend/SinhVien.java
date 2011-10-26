package extend;

public class SinhVien extends ConNguoi {
//1. Thuoc tinh
	public double diemTB;
//2. Phuong thuc
	//constructor
	public SinhVien() {
		super.ten = "Thanh Huy";
		super.chieuCao = 1.65;
		super.canNang = 53;
		this.diemTB = 8.5;
	}
	//xuat
	public void xuat() {
		System.out.println("********** SINH VIEN **********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu cao: " + this.chieuCao);
		System.out.println("Can nang: " + this.canNang);
		System.out.println("Diem trung binh: " + this.diemTB);
	}
	
}
