package main;

public class TamGiac {
	//1. Khai bao thuoc tinh
	public Diem diemA;
	public Diem diemB;
	public Diem diemC;
	public double canhAB;
	public double canhBC;
	public double canhAC;
	//2. Khai bao phuong thuc
	public TamGiac(){
		// de trong chua lam gi
	}
	public void nhap(){
		System.out.println("Hay nhap Diem A");
		diemA=new Diem();
		this.diemA.nhap();
		System.out.println("Hay nhap Diem B");
		diemB=new Diem();
		this.diemB.nhap();
		System.out.println("Hay nhap Diem c");
		diemC=new Diem();
		this.diemC.nhap();
		this.canhAB=this.diemA.tinhKhoangCach(this.diemB);
		this.canhAC=this.diemA.tinhKhoangCach(this.diemC);
		this.canhBC=this.diemB.tinhKhoangCach(this.diemC);
	}
	public void xuat(){
		System.out.println("Chu Vi tam giac "+ tinhChuVi());
		System.out.println("Dien Tich tam giac "+ tinhDienTich() );
	}

	// tinh chu vi
	public double tinhChuVi(){
		double chuVi=0;
		chuVi=this.canhAB+this.canhAC+this.canhBC;
		return chuVi;
	}
	public double tinhDienTich(){
		double p=this.tinhChuVi()/2;
		double dienTich=0;
		dienTich=Math.sqrt( p * (p - this.canhAB) * (p - this.canhAC) * (p - this.canhBC));
		return dienTich;
	}
}
