package thongtinh;

import java.util.Scanner;


public class Designation {
	public int desID=0;
	public String desName="";
	public String desCription="";
	public double minSalary=0;
	public double maxSalary=0;
	public int i=0;
	// khai bao thuoc tinh;
	public Designation() {
		
	}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		for(i=0;i<1;i--)
		{
		System.out.println("1. GL(Group Leader)");
		System.out.println("2. PM(Project Manager)");
		System.out.println("3. Dev(Developer)");
		this.desID=sc.nextInt();
			if(this.desID==1||this.desID==2||this.desID==3)
			{
				break;
			}
		}
	}
	public void xuat(){
		if(this.desID==1)
		{
			this.desName="GL";
			this.desCription="Group Leader";
			this.minSalary=12000000;
			this.maxSalary=20000000;
			System.out.println(this.desName+(this.desCription));
		}
		if(this.desID==2)
		{
			this.desName="PM";
			this.desCription="Project Manager";
			this.minSalary=8000000;
			this.maxSalary=12000000;
			System.out.println(this.desName+(this.desCription));
		}
		else
		{
			if(this.desID==3)
			{
				this.desName="Dev";
				this.desCription="Developer";
				this.minSalary=4000000;
				this.maxSalary=8000000;
				System.out.println(this.desName+(this.desCription));
			}
		}
	}
}
