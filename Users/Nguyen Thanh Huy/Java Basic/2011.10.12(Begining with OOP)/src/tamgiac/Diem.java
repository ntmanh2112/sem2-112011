package tamgiac;

import java.util.Scanner;

public class Diem {
//1. Thuoc tinh
	public int toaDoX;
	public int toaDoY;
//2. Phuong thuc
	//constructor
	public Diem() {
		// TODO Auto-generated constructor stub
	}
	//nhap lieu
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap toa do X: ");
		this.toaDoX = s.nextInt();
		System.out.print("Nhap toa do Y: ");
		this.toaDoY = s.nextInt();
	}
	//xuat
	public void xuat() {
		//chua can thiet => de do tinh sau
	}
	//tinh khoang cach
	public double tinhKhoangCach(Diem diemDen) {
		double kc = 0;
		kc = Math.sqrt(Math.pow((diemDen.toaDoX - this.toaDoX), 2) + Math.pow((diemDen.toaDoY - this.toaDoY), 2));
		return kc;
	}

}
