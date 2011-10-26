package tamgiac;

public class TamGiac {
//1. Thuoc tinh
	public Diem diemA;
	public Diem diemB;
	public Diem diemC;
	public double canhAB;
	public double canhAC;
	public double canhBC;
//2. Phuong thuc
	//constructor
	public TamGiac() {
		// TODO Auto-generated constructor stub
	}
	//nhap
	public void nhap() {
		while (true) {
			System.out.println("Nhap toa do diem A: ");
			diemA = new Diem();//cap dat
			this.diemA.nhap();//xay nha
			System.out.println("Nhap toa do dien B: ");
			diemB = new Diem();
			this.diemB.nhap();
			System.out.println("Nhap toa do diem C: ");
			diemC = new Diem();
			this.diemC.nhap();
			//tinh do dai cac canh
			this.canhAB = this.diemA.tinhKhoangCach(diemB);
			this.canhAC = this.diemA.tinhKhoangCach(diemC);
			this.canhBC = this.diemB.tinhKhoangCach(diemC);
			if (laTamGiac(this.canhAB, this.canhAC, this.canhBC) == true) {
				break;
			}
			else {
				System.out.println("3 diem vua nhap khong the la tam giac. Vui long nhap lai!");
			}
		}
	}
	//xuat
	public void xuat() {
		//phuong thuc nay chu can thiet => de do tinh sau
	}
	//tinh chu vi
	public double tinhChuVi() {
		double chuVi = 0;
		chuVi = this.canhAB + this.canhAC + this.canhBC;
		return chuVi;
	}
	//tinh dien tich
	public double tinhDienTich() {
		double dienTich = 0;
		double p = this.tinhChuVi()/2;
		dienTich = Math.sqrt(p * (p - this.canhAB) * (p - this.canhAC) * (p - this.canhBC));
		return dienTich;
	}
	
//cac phuong thuc phu
	//kiem tra 3 diem nhap vao co tao thanh tam giac hay khong
	public boolean laTamGiac(double ab, double ac, double bc) {
		boolean kq = true;
		if ((ab + ac <= bc) || (ab + bc <= ac) || (ac + bc <= ab)) {
			kq = false;
		}
		return kq;
	}

}
