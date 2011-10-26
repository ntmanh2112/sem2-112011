import java.util.Scanner;

import DSNV.Employee;
import DSNV.Function;


public class NhanVien {

	/**
	 * xuất ra danh sách nhân viên
	 */
	public static void main(String[] args) {
		Function.nhap();
		while (true) {
			Employee nv = new Employee();
			nv.nhap();
			Function.empList.add(nv);
			int choice;
			System.out.println("Bạn muốn nhập nữa không (1:yes / 0:no) : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			if (choice == 0) {
				break;
			}
		}
		
		for(int i = 0;i < Function.empList.size();i++){
			Employee nv = (Employee) Function.empList.get(i);
			nv.xuat();
		}

	}

}
