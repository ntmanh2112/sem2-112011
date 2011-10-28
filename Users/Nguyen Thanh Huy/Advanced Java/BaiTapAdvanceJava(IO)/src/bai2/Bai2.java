package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	ArrayList<Employee> listEmp;
	
	public Bai2() {
		listEmp = new ArrayList<Employee>();
	}
	
	public void readDataFromFile() {
		//Scanner s = new Scanner(System.in);
		//String fileName;
		FileReader fr;
		BufferedReader br;
		try {
			//System.out.println("Vui long nhap chinh xac ten file can doc: ");
			//fileName = s.nextLine();
			
			fr = new FileReader("Employee.txt");
			br = new BufferedReader(fr);
			
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] arr = line.split("\t");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				System.out.println(arr[0]);
				
				Employee emp = new Employee();
				emp.id = Integer.parseInt(arr[0]);
				emp.name = arr[1];
				emp.age = Integer.parseInt(arr[2]);
				emp.company = arr[3];
				emp.salary = Double.parseDouble(arr[4]);
				
				listEmp.add(emp);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//search
	public void search() {
		Scanner s = new Scanner(System.in);
		int idInput = s.nextInt();
		for (Employee e: listEmp) {
			if (idInput == e.id) {
				e.display();
			}
		}
	}
}
