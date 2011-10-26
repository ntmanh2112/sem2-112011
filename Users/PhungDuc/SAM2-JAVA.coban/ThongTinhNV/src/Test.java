import java.util.Scanner;

import test.Employee;
import test.Function;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Function.nhap();
		while(true)
		{
		Employee emp= new Employee();
		emp.nhap();
		Function.empList.add(emp);
		Scanner sc= new Scanner(System.in);
		int choise;
		System.out.println("Ban co muon nhap nua ko(1. yes / 0.no)");
		choise=sc.nextInt();
			if(choise == 0 )
			{
				break;
			}
		}
		for(int i=0; i<Function.empList.size(); i++)
		{
			Employee em = (Employee) Function.empList.get(i);
			em.xuat();
		}
	}

}
