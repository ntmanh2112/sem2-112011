package DSNV;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Employee {
	//Khai báo thuộc tính
	public int id = 0;
	public String name = "";
	public Date birthday;
	public int yearServed = 0;
	public Designation des;
	public double salary = 0;
	
	//Khai báo phương thức
	public Employee() {
	
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập ID : ");
		this.id = sc.nextInt();
		System.out.println("Nhập name : ");
		this.name = sc.next();
		
		SimpleDateFormat bd = new SimpleDateFormat("dd/mm/yy");
		while(true) {
			try {
				System.out.println("Nhập birthday (dd/mm/yyyy) : ");
				this.birthday = bd.parse(sc.next());
				break;
			} catch (Exception e) {
				System.out.println("Sai định dạng (dd/mm/yyyy)");
			}
		}
		
		System.out.println("Nhập served : ");
		this.yearServed = sc.nextInt();
			
		for (int i = 0; i < Function.desList.length; i++) {
			Function.desList[i].xuat();
		}
		int choise = 0;
		while(true) {
			try {
				System.out.println("Bạn hãy chọn chức vụ tương ứng");
				choise = Integer.parseInt(sc.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Bạn phải nhập số cho chức vụ tương ứng");
			}
		}
		this.des = Function.desList[choise-1];
		
		while (true) {
			System.out.println("Nhập salary : ");
			this.salary = sc.nextDouble();
			if (choise == 1) {
				if(this.salary >=4 && this.salary <8) {
					break;
				} else {
					System.out.println("Bạn nhập sai lương");
				}
			} else if (choise == 2) {
				if(this.salary >=8 && this.salary <12) {
					break;
				} else {
					System.out.println("Bạn nhập sai lương");
				}
			}else if (choise == 3) {
				if(this.salary >=12 && this.salary <20) {
					break;
				} else {
					System.out.println("Bạn nhập sai lương");
				}
			}
			
		}
		
	}
	
	public void xuat() {
		System.out.println("*************************");
		System.out.println("Thông tin chi tiết của nhân viên này là: ");
		System.out.println("Id : " + this.id + ",Name : " + this.name + ",Birthday : " + this.birthday + ",YearServed : " + this.yearServed + ",Salary : " + this.salary);
		this.des.xuat();
	}
	
}
