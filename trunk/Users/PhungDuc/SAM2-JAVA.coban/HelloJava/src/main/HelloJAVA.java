package main;

import java.util.Scanner;

import thread.ThreadA;
import thread.ThreadB;

public class HelloJAVA {
//public		- cong cong
//protected		- nhom
//private		- rieng biet
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadA threadA= new ThreadA();
			threadA.setName("Tien trinh 1");
			
			ThreadB b= new ThreadB();
			Thread threadB=new Thread(b);
			threadB.setName("Tien trinh 2");
			
			threadA.start();
			threadA.join();
			
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Khai bao bien
	/*	int xA;
		int yA;
		int xB;
		int yB;
		int xC;
		int yC;
		double a; //Khoang Cach BC
		double b; //Khoang Cach AC
		double c; //Khoang Cach AB
		double p; //Nua chu vi
		double chuVi=0;
		double dienTich=0;
		//input
		while (true){
			Scanner sc = new Scanner(System.in);
			System.out.println("hay nhap xA");
			xA=sc.nextInt();
			System.out.println("hay nhap yA");
			yA=sc.nextInt();
			System.out.println("hay nhap xB");
			xB=sc.nextInt();
			System.out.println("hay nhap yB");
			yB=sc.nextInt();
			System.out.println("hay nhap xC");
			xC=sc.nextInt();
			System.out.println("hay nhap yC");
			yC=sc.nextInt();

		// Xu Ly
		a = Math.sqrt(Math.pow((xB-xC),2) + Math.pow((yB-yC),2));
		b = Math.sqrt(Math.pow((xA-xB),2) + Math.pow((yA-yB),2));
		c = Math.sqrt(Math.pow((xA-xC),2) + Math.pow((yA-yC),2));
		// Chu vi va dien tich
		boolean kiemtra=kiemTraTamGiac (a, b, c);
		if(kiemtra==true)
			{
				chuVi= a+b+c;
				p= chuVi/2;
				dienTich = Math.sqrt(p * (p-a)*(p-b)*(p-c));
				// xuat gia tri
				System.out.println("chu vi tam giac = "+chuVi);
				System.out.println("dien tich tam giac="+dienTich);	
				break;
			}
		else
			{
				System.out.println("khong la tam giac");
			}
		}
		
		*/
/*		String hoTen="rong";
		String diaChi="rong";
		String dienThoai="rong";
		int namSinh=1989;
		int tuoi;
		int kiemtra;
		int dem=1;
		Scanner sc = new Scanner(System.in);
		// nhap ho ten
		for(kiemtra=0;kiemtra<dem;dem++)
		{
		System.out.println("Hay nhap Ho Ten");
		hoTen=sc.nextLine();
		if (hoTen.length()<10)
			{
				System.out.println("Hoten khong duoc it hon 10 ky tu");
				dem++;
			}
		else
			{
				break;
			}
		}
		// dia chi
		for(kiemtra=0;kiemtra<dem;dem++)
		{
			System.out.println("Hay nhap dia chi");
			diaChi=sc.nextLine();
		if (diaChi.length()<10)
			{
				System.out.println("DiaChi khong duoc it hon 10 ky tu");
				dem++;
			}
		else
			{
				break;
			}
		}
		// so dien thoai
		for(kiemtra=0;kiemtra<dem;dem++)
		{
			System.out.println("Hay nhap dien Thoai");
			dienThoai=sc.nextLine();
		if (dienThoai.length()<10)
			{
				System.out.println("Dien thoai khong duoc it hon 10 so");
				dem++;
			}
		else
			{
				break;
			}
		}
		// nam sinh
	//	for(kiemtra=0;kiemtra<dem;dem++)
	//	{
			System.out.println("Hay nhap nam Sinh");
			namSinh=sc.nextInt();
			
			*/
		/*	if (namsinh.length()<10)
			{
				System.out.println("Ban chua du 18 tuoi ");
				dem++;
			}
		else
			{
				break;
			}*/
	//	}
		// xuat gia tri
/*		System.out.println("Ho ten :"+ hoTen);
		System.out.println("Dia chi :"+ diaChi);
		System.out.println("Dien thoai :"+ dienThoai);
		System.out.println("Nam sinh :"+ namSinh);
		*/
	}
/*	public class DateTimeMaster {
	    Calendar now = Calendar.getInstance();
	    
	    public DateTimeMaster() {
	    	 String getYear()
	    	    {
	    	        String s = String.valueOf(now.get(Calendar.YEAR));
	    	        return s;
	    	    }
	    }
	    
	}
	*/
	//	public static boolean kiemtraNamSinh (int namSinh, int year){

	//	}
		
	
		
	// ky thuat co hieu	
	public static boolean kiemTraTamGiac (double a, double b, double c){
		boolean kq=true;
		if	((a + b <=c)||
			(a + c <=b)||
			(b + c <=a))
		{
			kq=false;
		}
		return kq;
		}
		
}
