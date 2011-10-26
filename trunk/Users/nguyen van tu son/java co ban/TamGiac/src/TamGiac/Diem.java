package TamGiac;

import java.util.Scanner;

public class Diem {
	// 1. Khai bao thuoc tinh
	public int toaDoX;
	public int toaDoY;
	
	// 2. Khai bao phuong thuc
	public Diem() {
		// Day la constrcutor(ham dung)
		// ==> de do chua lam gi ca
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap vao toa do X:");
		this.toaDoX = sc.nextInt();
		System.out.print("Nhap vao toa do Y:");
		this.toaDoY = sc.nextInt();
	}
	
	public void xuat() {
		System.out.print("Toa do X = "+ this.toaDoX);
		System.out.print("Toa do Y = "+ this.toaDoY);
	}
	
	public double tinhKhoangCach(Diem B) {
		double kc=0;
		kc = Math.sqrt(Math.pow((B.toaDoX-this.toaDoX),2)+ Math.pow((B.toaDoY-this.toaDoY), 2));
		return kc;
	}
}
