import java.util.Scanner;

import nhanVien.Employee;
import nhanVien.Function;


public class NhanVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function.nhap();
		while(true) {
			Employee em = new Employee();
			em.nhap();
			Function.empList.add(em);
			// Lap lai
			int choise;
			System.out.print("Ban co muon nhap nua khong? (1: yes / 0: No)?");
			Scanner sc = new Scanner(System.in);
			choise = sc.nextInt();
			if(choise == 0){
				break;
			}
		}
		
		for  (int  i=0; i< Function.empList.size();i++){
			Employee em = (Employee)Function.empList.get(i);
			em.xuat();
		}

	}
}
