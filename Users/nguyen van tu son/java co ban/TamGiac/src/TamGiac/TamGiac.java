package TamGiac;


public class TamGiac {
	// Thuoc tinh
	public Diem diemA;
	public Diem diemB;
	public Diem diemC;
	public double canhAB;
	public double canhBC;
	public double canhAC;
	
	// Phuong thuoc
	public TamGiac() {
		
	}
	
	public void nhap() {
		
		System.out.print("Nhap toa do diem A:");
		this.diemA = new Diem();
		this.diemA.nhap();
		System.out.print("\n Nhap toa do diem B:");
		this.diemB = new Diem();
		this.diemB.nhap();
		System.out.print("\n Nhap toa do diem C:");
		this.diemC = new Diem();
		this.diemC.nhap();
		
		
		this.canhAB=this.diemA.tinhKhoangCach(this.diemB);
		this.canhBC=this.diemB.tinhKhoangCach(this.diemC);
		this.canhAC=this.diemA.tinhKhoangCach(this.diemC);
	}
	
	 public void xuat() {
		 System.out.println(" Chu Vi la :" + tinhChuVi());
		 System.out.println(" Dien Tich la :" + tinhDienTich());
	}
	 
	 public double tinhChuVi(){
		 double chuVi = 0;
		 chuVi=this.canhAB + this.canhBC + this.canhAC;
		 return chuVi;
	}
		 
	 public double tinhDienTich() {
		 double p = this.tinhChuVi()/2;
		 double dienTich=0;
		 dienTich = Math.sqrt(p*(p-canhAB)*(p-canhBC)*(p-canhAC));
		 return p;
	}
	
}
