package employee;

import java.util.Scanner;

public class Designation {
//1. Properties
	int designationID;
	String designationName;
	String description;
	double maxSalary;
	double minSalary;
//2. Methods
	//constructor
	public Designation() {
	}
	public Designation(int _designationID, String _designationName, String _description, double _minSalary, double _maxSalary) {
		this.designationID = _designationID;
		this.designationName = _designationName;
		this.description = _description;
		this.minSalary = _minSalary;
		this.maxSalary = _maxSalary;
	}
	//enter
	public void enter() {
		Scanner s = new Scanner(System.in);
		System.out.print("Designation Name: ");
		designationName = s.nextLine();
		System.out.print("Description: ");
		description = s.nextLine();
		System.out.print("Max Salary: ");
		System.out.print("Designation ID: ");
		designationID = s.nextInt();
		maxSalary = s.nextDouble();
		System.out.print("Min Salary: ");
		minSalary = s.nextDouble();
	}
	//print
	public void print() {
		System.out.println(	"ID: " 				+ this.designationID
							+ "||Name: " 		+ this.designationName
							+ "||Description: "	+ this.description
							+ "||Max Salary: "	+ this.maxSalary
							+ "||Min Salary: "	+ this.minSalary);
	}
	
}
