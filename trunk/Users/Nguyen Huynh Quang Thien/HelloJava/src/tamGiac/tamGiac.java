package tamGiac;

public class tamGiac {
	//1.Khai báo thuộc tính
	public Diem diemA;
	public Diem diemB;
	public Diem diemC;
	public double canhAB;
	public double canhBC;
	public double canhAC;
	
	//2.Khai báo phương tính
	public tamGiac() {
	
	}
	
	public void nhap() {
		System.out.println("Nhập tọa độ điểm A :");
		diemA = new Diem();
		this.diemA.nhap();
		System.out.println("Nhập tọa độ điểm B :");
		diemB = new Diem();
		this.diemB.nhap();
		System.out.println("Nhập tọa độ điểm C :");
		diemC = new Diem();
		this.diemC.nhap();
		
		this.canhAB = this.diemA.tinhKC(this.diemB);
		this.canhBC = this.diemB.tinhKC(this.diemC);
		this.canhAC = this.diemA.tinhKC(this.diemC);
	}
	
	public void xuat() {
		System.out.println("Chu vi tam giac : " + this.tinhChuVi());
		System.out.println("Dien tich tam giac : " + this.tinhDienTich());
	}
	
	public double tinhChuVi() {
		double tinhChuVi = 0;
		tinhChuVi = this.canhAB + this.canhAC + this.canhBC;
		return tinhChuVi;
	}
	
	public double tinhDienTich() {
		double tinhDienTich = 0;
		double p = tinhDienTich/2;
		tinhDienTich = Math.sqrt(p*(p-this.canhBC)*(p-this.canhAB)*(p-this.canhAC));
		return tinhDienTich;
	}
}
