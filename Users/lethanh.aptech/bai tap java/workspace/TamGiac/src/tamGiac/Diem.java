package tamGiac;

import java.util.Scanner;

public class Diem {

	//1.khai bao thuoc tinh
	public int toaDoX;
	public int toaDoY;
	//2.khai bao phuong thuc
	public Diem() {
		//constructor (ham dung)
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap toa do X");
		this.toaDoX = sc.nextInt();
		System.out.println("nhap toa do Y");
		this.toaDoY = sc.nextInt();
		
	}
	public void xuat() {
		System.out.println("toa do X la :" + this.toaDoX);
		System.out.println("toa do Y la :" + this.toaDoY);
		
	}
	public double tinhKhoangCach(Diem B) {
		double kc=0;
		kc = Math.sqrt(Math.pow((B.toaDoX-this.toaDoX),2)+ Math.pow((B.toaDoY-this.toaDoY), 2));
		return kc;
	}
}
