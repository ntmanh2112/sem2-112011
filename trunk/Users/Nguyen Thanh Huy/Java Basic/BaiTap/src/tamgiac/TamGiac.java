package tamgiac;

import java.util.Scanner;

public class TamGiac {
	public static void main(String[] args) {
		//khai bao bien
		int xA, yA;
		int xB, yB;
		int xC, yC;
		/*
		 * a = BC
		 * b = AC
		 * c = AB
		 */
		double a;
		double b;
		double c;
		
		double p;
		double chuVi;
		double dienTich;
		
		Scanner s = new Scanner(System.in);
		//nhap lieu
		while (true) {
			System.out.print("xA: ");
			xA = s.nextInt();
			System.out.print("yA: ");
			yA = s.nextInt();
			
			System.out.print("xB: ");
			xB = s.nextInt();
			System.out.print("yB: ");
			yB = s.nextInt();
			
			System.out.print("xC: ");
			xC = s.nextInt();
			System.out.print("yC: ");
			yC = s.nextInt();
			
			//tinh do dai cac canh
			a = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));
			b = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));
			c = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
			String loi = "";
		
			
			
			//chu vi
			chuVi = (a + b + c);
			//nua chu vi
			p = chuVi/2;
			//dien tich
			dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			
			System.out.println("Nua chu vi: " + p);
			System.out.println("Chu vi tam giac: " + chuVi);
			System.out.println("Dien tich tam giac: " + dienTich);
		}
		
	}
	//kiem tra tam giac
	public boolean laTamGiac(int a, int b, int c) {
		boolean kq = true;
		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			kq = false;
		}
		return kq;
	}

}
