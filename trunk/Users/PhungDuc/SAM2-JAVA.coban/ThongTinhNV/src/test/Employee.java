package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Employee {
	public int id = 0;
	public String name="";
	public Date birthday;
	public int yearSaved = 0;
	public Designation des;
	public double salary = 0;
	
	public Employee() {
		// TODO
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Nhap vao id :");
			this.id = sc.nextInt();
			if(this.id>0)
			{
				break;
			}
			else{
				System.out.print("ID > 0");
			}
			
		}
		while(true)
		{
			System.out.println("Nhap vao name :");
			this.name = sc.next();
			if(this.name.length()>0)
			{
				break;
			}
			else{
				System.out.print("Khong duoc de trong");
			}
		}
		System.out.println("Nhap vao birthday :");
		//this.birthday = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		while(true)
		{
			try{
				this.birthday= sdf.parse(sc.next());
				break;
			} catch (ParseException e){
				System.out.println("say dinh dang ngay thang dd/mm/yyyy");
			}
		}
		while(true)
		{
			System.out.println("Nhap vao yearSaved :");
			this.yearSaved = sc.nextInt();
			if(this.yearSaved>=2 && this.yearSaved<=10)
			{
				break;
			}
			System.out.println("Nam kinh nghiem khong hop le");
		}
		for (int i = 0; i<Function.desList.length; i++) {
			Function.desList[i].xuat();
		}
		int choise = 0;
		while(true)
		{
		try {
			System.out.println("Ban hay chon chuc vu tuong ung:");
			choise =Integer.parseInt(sc.next());
			this.des = Function.desList[choise-1];
			break;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Hay chon 1 ,2 hoac 3");
		}
	
		}
		while(true)
		{
			System.out.println("Nhap vao salary :");
			this.salary = sc.nextDouble();
			if(this.des.minSalary<=this.salary && this.des.maxSalary >=this.salary)
			{
				break;
			}
			else{
				System.out.println("Sai muc luong quy dinh");
			}
		}
		
	}
	public void xuat(){
		System.out.println("*****************	++	*******************");
		System.out.println("Thong tinh nhan vien nay la :");
		System.out.println("ID :"+this.id+" -- Name : "+this.name+" -- brithday :"+this.birthday+" -- year saved : "+this.yearSaved+" -- salary :"+this.salary);
		this.des.xuat();
		System.out.println("*****************	--	*******************");
	}
	
}
