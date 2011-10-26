import java.text.ParseException;
import java.util.Scanner;

import employee.Designation;
import employee.Employee;
import employee.Program;


public class Main {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		Program pr = new Program();
		
		while (true) {
			Employee e = new Employee();
			e.enter();
			pr.employeeList.add(e);
			System.out.println("Do you want to continue? No: 0, Yes: Any Number");
			int choise = s.nextInt();
			if (choise == 0) {
				break;
			}
		}
		for (int i = 0; i < Program.employeeList.size(); i++) {
			Employee em = (Employee) Program.employeeList.get(i);
			em.print();
		}
	}

}
