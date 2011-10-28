package bai2;

public class Employee {
	public int id;
	public String name;
	public int age;
	public String company;
	public double salary;
	
	public Employee() {
		
	}
	
	public Employee(int _id, String _name, int _age, String _company,double _salary) {
		this.id = _id;
		this.name = _name;
		this.age = _age;
		this.company = _company;
		this.salary = _salary;
	}
	
	public void display() {
		System.out.println("id=" + this.id);
		System.out.println("name=" + this.name);
		System.out.println("age=" + this.age);
		System.out.println("company=" + this.company);
		System.out.println("salary=" + this.salary);
	}
}
