package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {

	/**
	 * @param args
	 */
	public static ArrayList<Employee> listEmployee;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile();
		search();
	}

	public static void readFile() {
		listEmployee = new ArrayList<Employee>();
		try {
			FileReader fr = new FileReader("D:/Employee.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] a = line.split("\t");
				Employee em = new Employee();
				em.id = Integer.parseInt(a[0]);
				em.name = a[1];
				em.age = Integer.parseInt(a[2]);
				em.company = a[3];
				em.salary = Double.parseDouble(a[4]);
				
				listEmployee.add(em);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void search() {
		Scanner sc = new Scanner(System.in);
		int idInput;
		System.out.println("Pls in put id for searching : ");
		idInput = sc.nextInt();
		
		for (Employee obj : listEmployee) {
			if (obj.id == idInput) {
				obj.display();
				return;
			}
		}
		System.out.println("Not exists id " + idInput);
	}
}
