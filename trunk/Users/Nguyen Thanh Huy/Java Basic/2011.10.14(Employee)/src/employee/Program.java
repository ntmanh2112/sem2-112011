package employee;

import java.util.ArrayList;

public class Program {
//1. Properties
	public static Designation[] designationList;
	public static ArrayList<Employee> employeeList;
//2. Methods
	//constructor
	public Program() {
		this.designationList = new Designation[3];
		designationList[0] = new Designation(1, "GL", "Group Leader", 12, 20);
		designationList[1] = new Designation(2, "PM", "Project manager", 8, 12);
		designationList[2] = new Designation(3, "Dev", "Developer", 4, 8);
		
		this.employeeList = new ArrayList<Employee>();
	}
	//print
	public void print() {
		
	}

}
