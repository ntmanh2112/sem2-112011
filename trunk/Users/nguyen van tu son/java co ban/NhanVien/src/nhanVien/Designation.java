package nhanVien;

import java.util.Scanner;

public class Designation {
	public int desID = 0;
	public String desName ="";
	public String description = "";
	public double minSalary = 0;
	public double maxSalary = 0 ;
	
	public Designation() {
		
	}
	// trong 1 doi tuong co nhieu ham dung nhung khac ca tham so truyen vao
	public Designation(int _desID, String _desName, String _description, 
						double _minSalary, double _maxSalary) {
		this.desID = _desID;
		this.desName = _desName;
		this.description = _description;
		this.minSalary = _minSalary;
		this.maxSalary = _maxSalary;
		
	}
	
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao des ID :");
		this.desID = sc.nextInt();
		System.out.println("Nhap vao des Name :");
		this.desName = sc.nextLine();
		System.out.println("Nhap vao desscription :");
		this.description = sc.nextLine();
		System.out.println("Nhap vao min salary :");
		this.maxSalary = sc.nextDouble();
		System.out.println("Nhap vao max salary :");
		this.maxSalary = sc.nextDouble();
	}
	
	public void xuat() {
		System.out.println("id : " + this.desID 
				+ 	"--name :" + this.desName
				+ 	"--des:"	+ this.description
				+	"--minSalary: " + this.minSalary
				+ "--maxSalary :" + this.maxSalary);
}


	}

