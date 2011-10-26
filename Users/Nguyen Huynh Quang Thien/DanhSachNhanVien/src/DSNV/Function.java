package DSNV;

import java.util.ArrayList;

public class Function {
	public static Designation desList[]; //mảng tĩnh
	public static ArrayList empList; //mảng động
	
	public Function() {
/*		this.desList = new Designation[3];
		this.desList[0] = new Designation(1,"GL","Group Leader",12,20);
		this.desList[1] = new Designation(2, "PM", "Project Manager", 8, 12);
		this.desList[2] = new Designation(3, "Dev", "Developer", 4, 8);
		
		this.empList = new ArrayList<Employee>(); */
	}
	
	public static void nhap() {
		desList = new Designation[3];
		desList[0] = new Designation(1,"GL","Group Leader",12,20);
		desList[1] = new Designation(2,"PM","Project Manager", 8, 12);
		desList[2] = new Designation(3,"Dev","Developer", 4, 8);
		
		empList = new ArrayList<Employee>();
	}
}
