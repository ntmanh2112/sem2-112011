package DSNV;

import java.util.Scanner;

public class Designation {
	//Khai báo thuộc tính
	public int desID = 0;
	public String desName = "";
	public String description = "";
	public double minSalary = 0;
	public double maxSalary = 0;
	
	//Khai báo phương thức
	public Designation() {
		
	}
	
	public Designation(int _desID,String _desName,String _description,double _minSalary,double _maxSalary) {
		this.desID = _desID;
		this.desName = _desName;
		this.description = _description;
		this.minSalary = _minSalary;
		this.maxSalary = _maxSalary;
	}
	//chưa dùng hàm nhập này
	public void nhap() {
		Scanner des = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập mã chức vụ: ");
		this.desID = des.nextInt();
		System.out.println("Mời bạn nhập mã kí tự chức vụ: ");
		this.desName = des.nextLine();
		System.out.println("Mời bạn nhập mô tả chức vụ: ");
		this.description = des.nextLine();
		System.out.println("Mức lương thấp nhất : ");
		this.minSalary = des.nextDouble();
		System.out.println("Mức lương cao nhất : ");
		this.maxSalary = des.nextDouble();
	}
	
	public void xuat() {
		System.out.print("Chức vụ : " + this.desID + "." + this.desName + "(" + this.description + ") --- ");
		System.out.println("Mức lương : " + this.minSalary + " - " + this.maxSalary);
	}
	
}
