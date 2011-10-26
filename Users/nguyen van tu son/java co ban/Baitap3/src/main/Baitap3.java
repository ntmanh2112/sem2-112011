package main;

import java.util.Scanner;

public class Baitap3 {
	
	public static void main(String[] args) {
		
		int xA;
		int yA;
		int xB;
		int yB;
		int xC;
		int yC;
		double a; // khoang cach BC
		double b; // khoang cach AC
		double c; // khoang cach AB
		double p; // Chu VI
		double chuVi=0 , dienTich =0;
		
		// input
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi Ban nhap toa do xA:");
		xA = sc.nextInt();
		System.out.print("Moi Ban nhap toa do yA:");
		yA= sc.nextInt();
		System.out.print("Moi ban nhap toa do xB:");
		xB = sc.nextInt();
		System.out.print("Moi ban nhap toa do yB:");
		yB = sc.nextInt();
		System.out.print("Moi ban nhap toa do xC:");
		xC = sc.nextInt();
		System.out.print("Moi ban nhap toa do yC:");
		yC = sc.nextInt();
		
		// Tinh khoang cach
		a = Math.sqrt(Math.pow((xB - xC),2)+ Math.pow((yB - yC),2));
		b = Math.sqrt(Math.pow((xA - xC),2)+ Math.pow((yA - yC),2));
		c = Math.sqrt(Math.pow((xB - xA),2)+ Math.pow((yB - yA),2));
				
		
		boolean kiemTra = kiemTraTamGiac(a,b,c);
		if(kiemTra == true) {
			chuVi = a+b+c;
			p= chuVi/2;
			dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));}
		 else {
			System.out.print("Khong la tam giac");
		}
		
		// Xuat ra
		System.out.println("Chu Vi Tam Giac:" + chuVi + "\n" + "Dien Tich Tam Giac:"+ dienTich);
	}
		
	
	public static boolean kiemTraTamGiac(double a, double b, double c){
	
	boolean kq = true;
	if ((a+b <= c) ||
	  (a+c <= b) ||
	  (b+c <= a)) {
		kq = false;
	}
	return kq;
}
}

