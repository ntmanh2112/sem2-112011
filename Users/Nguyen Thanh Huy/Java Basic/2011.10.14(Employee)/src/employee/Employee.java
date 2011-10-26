package employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
//1. Properties
	int employeeID;
	String employeeName;
	Date birthday;
	Designation designation;
	int yearServed;
	double salary;
//2. Methods
	public void enter() {
		Scanner s = new Scanner(System.in);
		//nhap id
		System.out.print("Employee ID: ");
		this.employeeID = s.nextInt();
		//nhap ten
		System.out.print("Employee Name: ");
		this.employeeName = s.next();
		//nhap ngay thang
		while (true) {
			try {
					System.out.println("Birthday (dd/MM/yyyy): ");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					this.birthday = sdf.parse(s.next());
					break;
			} catch (ParseException e) {
				System.out.println("Sai dinh dang: dd/MM/yyyy");
			}
		}
		
		//nhap chuc vu
		for (int i = 0; i < Program.designationList.length; i++) {
			Program.designationList[i].print();
		}
		int choice = 0;
		System.out.println("Hay chon chuc vu ung voi danh sach tren: ");
		choice = s.nextInt();
		this.designation = Program.designationList[choice  - 1];
		//nhap nam kinh nghiem
		System.out.println("Year served: ");
		this.yearServed = s.nextInt();
		//nhap luong
		System.out.println("Salary: ");
		this.salary = s.nextDouble();
	}
	//print
	public void print() {
		System.out.println("********************++********************");
		System.out.println("ID: " + this.employeeID);
		System.out.println("Name: " + this.employeeName);
		System.out.println("Birthday: " + this.birthday);
		this.designation.print();
		System.out.println("Year served: " + this.yearServed);
		System.out.println("Salary: " + this.salary);
		System.out.println("********************++********************");
	}
	//tinh tuoi
	public int age(Date date) {
		int result = 0;
		String d = "" + date;
		String[] ds = d.split("/");
		
		String year = ds[2];
		result = Integer.parseInt(year);
		
		return result;
	}
}

//variable.next() => khong duoc co khoang trang