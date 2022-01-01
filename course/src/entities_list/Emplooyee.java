package entities_list;

public class Emplooyee {
	private Integer Id;
	private String name;
	private Double salary;
	
	
	public Emplooyee(int id, String name, double salary) {
		Id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalery() {
		return salary;
	}


	public void setSalery(double salary) {
		this.salary = salary;
	}
	
	public void incraseSalary(double percentage) {
		this.salary +=  this.salary * percentage /100;
			
	}
	public String toString() {
		return Id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
