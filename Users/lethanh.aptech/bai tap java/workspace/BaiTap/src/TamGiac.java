
import java.util.Scanner;
public class TamGiac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int xA;
		int xB;
		int xC;
		int yA;
		int yB;
		int yC;
		double a;
		double b;
		double c;
		double chuVi=0;
		double dienTich=0;
		double p;
		
		 // Input
		while (true){
		Scanner sc=new Scanner(System.in);
		System.out.println("Hay nhap vao toa do xA :");
		xA = sc.nextInt();
		System.out.println("Hay nhap vao toa do xB :");
		xB = sc.nextInt();
		System.out.println("Hay nhap vao toa do xC :");
		xC = sc.nextInt();
		System.out.println("Hay nhap vao toa do yA :");
		yA = sc.nextInt();
		System.out.println("Hay nhap vao toa do yB :");
		yB = sc.nextInt();
		System.out.println("Hay nhap vao toa do yC :");
		yC = sc.nextInt();
		
		

	        
		 // tinh khoang cach
		a = Math.sqrt(Math.pow((xB-xC),2)+ Math.pow((yB-yC), 2));
		b = Math.sqrt(Math.pow((xA-xC),2)+ Math.pow((yA-yC), 2));
		c = Math.sqrt(Math.pow((xB-xA),2)+ Math.pow((yB-yA), 2));

		boolean kiemTra = kiemTraTamGiac (a,b,c);
		if (kiemTra==true) {
		
		//tinh chu vi & dien tich
		chuVi = a + b + c;
		p = chuVi/2;
		dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		//Xuat gia tri
		System.out.println("chu vi tam giac = " +chuVi);
		System.out.println("Dien tich tam giac ="+dienTich);
		break;
		}else {
			System.out.println("khong phai tam giac");
		}
	
	}
	}
	public static boolean kiemTraTamGiac(double a, double b, double c) {
		boolean kq = true;
		if ((a + b <c )||
			(a+c<b) ||
			(b+c<a)) {
			kq = false;
		}
			return kq;
	}
	
}
