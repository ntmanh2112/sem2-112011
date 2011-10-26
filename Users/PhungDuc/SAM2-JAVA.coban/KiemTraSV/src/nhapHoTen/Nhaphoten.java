package nhapHoTen;


import java.util.Calendar;
import java.util.Scanner;

public class Nhaphoten {
	public String hoTen;
	public String diaChi;
	public String dienThoai;
	public int namSinh;
	public int i;
	public int yy;
	public int year= Calendar.getInstance().get(Calendar.YEAR);
	public Nhaphoten(){
		
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		for(i=0; i<1; i--)
		{
			System.out.println("Hay nhap ho ten");
			this.hoTen=sc.nextLine();
			if(this.hoTen.length()<10)
			{
				System.out.println("Nhap lai ho ten");
			}
			else
			{
				break;
				
			}
		}
		for(i=0;i<1;i--)
		{
			System.out.println("Hay nhap so dien thoai");
			this.dienThoai=sc.nextLine();
			if(this.dienThoai.length()<10)
			{
				System.out.println("Nhap lai so dien thoai");
			}
			else
			{
				break;
			}
		}
		for(i=0;i<1;i--)
		{
			System.out.println("Hay nhap so dia chi");
			this.diaChi=sc.nextLine();
			if(this.diaChi.length()<10)
			{
				System.out.println("Nhap lai so dia chi");
			}
			else
			{
				break;
			}
		}
		for(i=0;i<1;i--)
		{
			System.out.println("Hay nhap  nam sinh");
			this.namSinh=sc.nextInt();
			yy = year-this.namSinh;
			if(yy<18)
			{
				System.out.println("Nhap lai nam sinh");
			}
			else
			{
				break;
			}
		}
	}
	public void xuat(){
		System.out.println("Ho ten :" +this.hoTen);
		System.out.println("Dia chi:" +this.diaChi);
		System.out.println("Dien thoai:" +this.dienThoai);
		System.out.println("Nam sinh :" +this.namSinh);
		
	}
}
