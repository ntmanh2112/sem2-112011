package tamGiac;

import java.util.Scanner;

public class Diem {
	//1.Khai báo thuộc tính
	public int toaDoX;
	public int toaDoY;
	
	//2.Khai báo phương thức
	public Diem() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập tọa độ x : ");
		this.toaDoX = sc.nextInt();
		System.out.println("Mời bạn nhập tọa độ y : ");
		this.toaDoY = sc.nextInt();
	}
	
	public void xuat() {
		System.out.println("Tọa độ x : " + this.toaDoX);
		System.out.println("Tọa độ y : " + this.toaDoY);
	}
	
	public double tinhKC(Diem B) {
		double tinhKC = 0;
		tinhKC = Math.sqrt(Math.pow((B.toaDoX - this.toaDoX),2) + Math.pow((B.toaDoY - this.toaDoY),2));
		return tinhKC;
	}

}
