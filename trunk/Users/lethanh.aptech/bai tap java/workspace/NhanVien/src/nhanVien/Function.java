package nhanVien;

import java.util.ArrayList;



public class Function {
	//neu co static o dau thi dc su dung truc tiep.ko su dung tu khoa "new"
	//neu ko co tartic thi phai su dung tu khoa new
	public static Designation desList[]; // mang tinh
	public static ArrayList	empList; // mang dong
	
	public Function() {
		
	}
	
	public static void nhap() {
		desList = new Designation[3];
		desList[0] = new Designation(1, "GL", "Group Leader", 12, 20);
		desList[1] = new Designation(2, "PM", "Project Manager", 8, 12);
		desList[2] = new Designation(3, "Dev", "Developer", 4, 8);
		
		empList = new ArrayList<Employee>();
	}
	
}