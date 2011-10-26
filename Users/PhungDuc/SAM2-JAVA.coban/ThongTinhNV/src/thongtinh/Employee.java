package thongtinh;

import java.util.Date;
import java.util.Scanner;

public class Employee {

	public int employeeID;
	public String employeeName;
	public Date birthDay;
	public Designation designation;
	public int yearServed;
	public double salary;
	
	public Employee(){
		
	}
	public void nhap(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap ma nhan vien");
		this.employeeID=sc.nextInt();
		System.out.println("Nhap ten nhan vien");
		this.employeeName=sc.nextLine();
	}
}
