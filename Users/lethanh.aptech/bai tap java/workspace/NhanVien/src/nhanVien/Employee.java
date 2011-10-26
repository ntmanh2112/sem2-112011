package nhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	public int id = 0;
	public String name = " ";
	public Date birthday;
	public int yearSaved = 0;
	public Designation des;
	public double salary = 0;
	
	public Employee() {
		// TODO
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao id :");
		this.id = sc.nextInt();
		System.out.println("Nhap vao name :");
		this.name = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		while (true){
		System.out.println("Nhap vao birthday dd/mm/yyyy:");
		
		try {
			this.birthday = sdf.parse(sc.next());
			break;
		} catch (ParseException e) {
			
			System.out.println("sai dinh dang ngay thang (dd/mm/yyyy) : ");
		}
		}
		System.out.println("Nhap vao yearSaved :");
		this.yearSaved = sc.nextInt();
		
		for (int i = 0; i < Function.desList.length; i++) {
			Function.desList[i].xuat();
		}
		
		int choise = 0;//bien chon la ham choise
		try {
			System.out.println("Ban hay chon chuc vu tuong ung voi ID :");
			choise = Integer.parseInt(sc.next());
		} catch (Exception e) {
			System.out.println("ban phai chon ID co trong danh sach");;
		}
		choise = sc.nextInt();
		this.des = Function.desList[choise - 1];
		
		System.out.println("Nhap vao salary :");
		this.salary = sc.nextDouble();
	}
	public void xuat (){
		System.out.println("thong tin chi tiet cua nhan vien la :");
		System.out.println("id : " + this.id + "\n --name : " + this.name + "\n brithday : " + this.birthday + "\n yearSaved : " + this.yearSaved + "\n des :" + this.des + "\n salary :" + this.salary);
		this.des.xuat();
		
	}
}
